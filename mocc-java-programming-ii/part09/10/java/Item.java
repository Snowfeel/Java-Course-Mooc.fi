import java.util.Objects;

public class Item{

    private String product;
    private int qty;
    private int unitPrice;
    public Item(String product, int qty, int unitPrice){

        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity(){
        this.qty++;
    }

    public String toString(){
        return this.product + ": " + this.qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        if (this.product.equals(item.product)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.product.hashCode();
    }
}
