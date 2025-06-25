import java.util.HashMap;
import java.util.Map;
public class AccountOperations {
    private static Map<Integer,Account> accountmap=new HashMap<>();
    public void addAccount(Account account){
        accountmap.put(account.getAccountNumber(),account);
    }
    public void updateAccount(Account account){
        accountmap.put(account.getAccountNumber(),account);
    }
    public Account getAccount(int accountNumber){
        return accountmap.get(accountNumber);
    }
    /** This method should not be part of AccountOperations
     * Reason is account operations are responsible for doing
     * operation for account like add account, update account
     * get account. However deposit is something called as transaction
     * which eventually not responsible by account.
     *
     * Adding this method violates Single Responsibility principle
     * Create new class which actually does TransactionOperations.
     * **/
     public void deposit(int amount , int accountNumber){
        //Move this method to different class
    }
}
// Purpose: This class is responsible for managing the lifecycle of Account objects. Think of it as a simple, in-memory database or a repository for accounts. Its single responsibility is to manage the collection of accounts (add, find, update).
// Fields:
// private static Map<Integer, Account> accountmap: This is a crucial part.
// Map: A data structure that stores key-value pairs. Here, the key is the Integer account number, and the value is the Account object itself. This allows for very fast lookups.
// static: This keyword means the accountmap belongs to the AccountOperations class itself, not to any single instance of it. All instances of AccountOperations will share this one single map. This effectively creates a global, shared "database" for the application's runtime.
// Methods:
// addAccount(Account account): Adds a new account to the map.
// updateAccount(Account account): Updates an existing account. Since map keys are unique, put will simply overwrite the old value if the key (account number) already exists.
// getAccount(int accountNumber): Retrieves a single account from the map by its number.
