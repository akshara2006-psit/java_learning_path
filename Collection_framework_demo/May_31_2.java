import java.util.ArrayList;

public class May_31_2 {
    public static void main(String[] args) {
        ArrayList<String> cart=new ArrayList<>();
        ShoppingCart sc=new ShoppingCart(cart);
        // task1:
        sc.addProduct("Laptop");
        sc.addProduct("Mouse");
        sc.addProduct("KeyBoard");
        
     //task2:
     sc.removeProduct("Mouse");

     //task3:
     sc.displayProducts();

     //task4:
     System.out.println(sc.searchProducts("Mouse"));

     //task5
     System.out.println(sc.getTotalProducts());


    }
}
// E-Commerce Shopping Cart
// Scenario

// You are developing an online shopping website.

// Each customer can add multiple products to their cart.

// Requirements:

// Add a product to the cart.
// Remove a product from the cart.
// Display all products.
// Search whether a product exists.
// Display total number of products.