// burger interface
interface Burger{
    void prepare();
}
// concrete methods for burger interface
// basic burger
class BasicBurger implements Burger{
    @Override
    public void prepare(){
        System.out.println("preparing basic Burger with bun, patty");
    }
}
// standard burger
class StandardBurger implements Burger{
    @Override
    public void prepare(){
        System.out.println("preparing Standard Burger with bun, patty, cheese, and lettuce!");
    }
}
// premium burger
class PremiumBurger implements Burger{
    @Override
    public void prepare(){
        System.out.println("preparing Premium Burger with gourmet bun, premium patty, cheese, lettuce, and secret sauce!");
    }
}

// burger factory
class BurgerFactory{
    public Burger createBurger(String type){
        if(type.equalsIgnoreCase("basic")){
            return new BasicBurger();
        }
        else if(type.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
        else if(type.equalsIgnoreCase("premium")){
            return new PremiumBurger();
        }
        else {
            System.out.println("Invalid burger type!");
            return null;
        }
    }
}

// --- Main Class ---
public class SimpleFactory {
    public static void main(String[] args) {
        String type = "standard";

        BurgerFactory myBurgerFactory = new BurgerFactory();

        Burger burger = myBurgerFactory.createBurger(type);

        if (burger != null) {
            burger.prepare();
        }
    }
}
