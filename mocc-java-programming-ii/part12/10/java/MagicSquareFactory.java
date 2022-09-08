import java.util.Random;

public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        // implement the creation of a magic square with the Siamese method algorithm here
        if (size%2 == 1){
            int row = 0;
            int column = size/2;
            int tempR = 0;
            int tempC = 0;
            boolean reset = false;
            for (int i = 1; i <= size * size; i++) {
                if (square.readValue(column,row) ==0)
                {
                    square.placeValue(column,row,i);

                }else {
                    row += 1;
                    row += 1;
                    column -=1;
                    if (row >= size) {
                        row = tempR+1;
                    }
                    if (column <0) {
                        column = tempC;
                    }
                    square.placeValue(column,row,i);
                }
                tempR = row;
                tempC = column;
                row -= 1 ;
                column +=1;

                if (row < 0) {
                    row = size - 1;
                }
                if (column >= size) {
                    column = 0;
                }


            }
        }
        return square;
    }

}
