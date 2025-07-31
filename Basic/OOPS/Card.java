abstract public class Card implements PaymentMethod{
    private final String userName;
    private String cardNo;
    public Card(String userName,String cardNo){
        this.userName=userName;
        this.cardNo=cardNo;
    }

    public Card(String userName) {
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public String getCardNo(){
        return cardNo;
    }
    
}