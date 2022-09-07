public class List<Type> {

        private Type[] value;
        private int firstFreeArray;

        public List(){
            this.value = (Type[]) new Object[10];
            this.firstFreeArray = 0;
        }

        public void add(Type value){
            if (this.firstFreeArray == this.value.length){
                grow();
            }
            this.value[this.firstFreeArray] = value;
            this.firstFreeArray++;
        }

        public void grow(){
            int newSize = this.value.length + this.value.length/2;
            Type[] newArray = (Type[]) new  Object[newSize];

            for (int i = 0; i < firstFreeArray; i++) {
                newArray[i] = this.value[i];
            }
            this.value = newArray;
        }

        public boolean contains(Type value){
            for (int i = 0; i < firstFreeArray; i++) {
                if (this.value[i].equals(value)){
                    return true;
                }
            }
            return false;
        }

        public void remove(Type value) {
            int indexOfValue = indexOfValue(value);
            if (indexOfValue < 0) {
                return; // not found
            }

            moveToTheLeft(indexOfValue);
            this.firstFreeArray--;
        }

    public int indexOfValue(Type value){
        for (int i = 0; i < firstFreeArray; i++) {
            if (this.value[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex){
        for (int i = fromIndex; i < firstFreeArray - 1; i++) {
            this.value[i] = this.value[i+1];
        }
    }

    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeArray) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeArray + "]");
        }

        return this.value[index];
    }

    public int size() {
        return this.firstFreeArray;
    }


}
