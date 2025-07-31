public class Creditcard extends Card{
    public Creditcard(String userName,String cardNo){
        super(userName,cardNo);
    }
    @Override
    public void pay(){
        System.out.println("Making payment via Creditcard");
    }

}