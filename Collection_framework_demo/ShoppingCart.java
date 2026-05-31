import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<String> cart;
    ShoppingCart(ArrayList cart){
        this.cart=cart;
    }
    public void addProduct(String product){
        cart.add(product);
    }
    public void removeProduct(String product){
        cart.remove(product);
    }
    public void displayProducts(){
        System.out.println("The cart is as follows:"+cart);
    }
    public boolean searchProducts(String product){
        return cart.contains(product);
    }
    public int getTotalProducts(){
        return cart.size();
    }
}
