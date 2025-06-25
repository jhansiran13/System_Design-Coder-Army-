import java.math.BigDecimal;

public class TransactionOperations {
    // This is good as it does transactions and at right place.
    public void deposit(BigDecimal amount , int accountNumber){
        //Getting account details it is job of account operations
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount , int accountNumber){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}

// Purpose: This class follows the advice from the comment in AccountOperations. Its single responsibility is to handle financial transactions.
// Methods:
// deposit(BigDecimal amount, int accountNumber):
// It first needs to find the relevant account. It does this by creating an instance of AccountOperations and calling getAccount().
// It then gets the current total amount from the account object.
// It uses the add() method of BigDecimal to calculate the new balance. Note: BigDecimal objects are immutable. The add() method does not change the original value; it returns a new BigDecimal object with the result.
// Finally, it calls setTotalAmount() on the account object to update its balance. Because Java passes objects by reference, this change to the account object will be reflected in the object stored in the accountmap.
// withdraw(...): Works in the same way but uses the subtract() method.
