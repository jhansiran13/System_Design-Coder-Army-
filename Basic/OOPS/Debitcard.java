public class Debitcard extends Card {
    public Debitcard(String userName,String cardNo){
        super(userName,cardNo);
    }
    @Override
    public void pay(){
        System.out.println("Making payment via Debitcard");
    }
}
