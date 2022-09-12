import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart{
    private List<Item> cart = new ArrayList<>();
    public void add(String product, int price){
        Item match = new Item(product,0,0);
        if (cart.contains(match)){
            cart.get(cart.indexOf(match)).increaseQuantity();
        }else {
            cart.add(new Item(product,1,price));
        }
    }

    public int price(){
        int sum = 0;
        for (Item i:cart) {
            sum += i.price();
        }
        return sum;
    }

    public void print(){
        for (Item i: cart){
            System.out.println(i);
        }
    }
}
