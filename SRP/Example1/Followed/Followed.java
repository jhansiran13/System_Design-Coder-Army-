
// Product class representing any item in eCommerce.
import java.util.ArrayList;

class Product{
    public String name;
    public double price;
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }
}

// 1. ShoppingCart: Only responsible for Cart related business logic.
class ShoppingCart{
    private ArrayList<Product> products=new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
    // Calculates total price in cart.
    public double calculateTotal(){
        double total=0;
        for(Product p:products){
            total+=p.price;
        }
        return total;
    }

}


// 2. ShoppingCartPrinter: Only responsible for printing invoices
class ShoppingCartPrinter{
    private ShoppingCart cart;
    public ShoppingCartPrinter(ShoppingCart cart){
        this.cart=cart;
    }
    public void printInvoice(){
        System.out.println("Shopping cart Invoice: ");
        for(Product p:cart.getProducts()){
            System.out.println(p.name+" "+p.price);
        }
        System.out.println("Total: Rs " + cart.calculateTotal());
    }
}

// 3. ShoppingCartStorage: Only responsible for saving cart to DB
class ShoppingCartStorage{
    private ShoppingCart cart;
    public ShoppingCartStorage(ShoppingCart cart){
        this.cart=cart;
    }
    public void saveToDatabase(){
        System.out.println("saving to Database....");
    }

}

public class Followed{
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        cart.addProduct(new Product("Laptop", 500000));
        cart.addProduct(new Product("Mobile", 20000));

        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();

        ShoppingCartStorage db = new ShoppingCartStorage(cart);
        db.saveToDatabase();
    }
}