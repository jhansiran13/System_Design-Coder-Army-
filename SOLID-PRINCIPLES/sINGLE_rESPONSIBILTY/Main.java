import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(123);
        account.setFirstName("Vishrut");
        account.setTotalAmount(BigDecimal.valueOf(100000));
        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(123),123);
    }
}


// Purpose: This class contains the main method, which is the starting point for any Java application. It orchestrates the entire process to demonstrate how the other classes work together.
// Execution Flow:
// An Account object is created and populated with data (account number 123, name "Vishrut", initial balance 100,000).
// An AccountOperations object is created.
// accountOperations.addAccount(account) is called. This stores the new account in the static accountmap.
// A TransactionOperations object is created.
// transactionOperations.deposit(BigDecimal.valueOf(123), 123) is called. This triggers the deposit logic:
// Inside deposit, getAccount(123) is called, which fetches the account for "Vishrut".
// The balance is updated from 100,000 to 100,123.
// Since the account object was retrieved from the shared accountmap, the map now holds the updated account information