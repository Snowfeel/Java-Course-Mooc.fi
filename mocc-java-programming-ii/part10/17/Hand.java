import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<>();
    }

    public void add(Card card){
        hand.add(card);
    }

    public void print(){
        hand.stream().forEach(card -> System.out.println(card));
    }

    public void sort(){
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand o) {
        int sumA=0;
        int sumB=0;
        for (Card a:this.hand){
            sumA += a.getValue();
        }
        for (Card b:o.hand){
            sumB += b.getValue();
        }
        return sumA - sumB;
    }

    public void sortBySuit(){
        BySuitInValueOrder sort = new BySuitInValueOrder();
        Collections.sort(hand,sort);
    }
}
