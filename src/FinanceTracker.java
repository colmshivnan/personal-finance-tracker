import java.util.ArrayList;
public class FinanceTracker{
    private BankAccount account;
    private ArrayList<Transaction> transactions;

    public FinanceTracker( BankAccount account){
        if(account == null){
            throw new IllegalArgumentException("Account must not be null");
        }
        this.account = account;
        this.transactions = new ArrayList<>();
    }
    public void addIncome(String description, double amount){
        if(amount <= 0 || !Double.isFinite(amount)){
            throw new IllegalArgumentException("Amount must be a positive real number");
        }
        Transaction transaction = new Transaction(description, amount, "income");
        this.account.deposit(amount);
        this.transactions.add(transaction);
    }
    public boolean addExpense(String description, double amount){
        if(amount <= 0 || !Double.isFinite(amount)){
            throw new IllegalArgumentException("Amount must be a positive real number");
        }
        if(!this.account.withdraw(amount)){
            return false;
        }
        Transaction transaction = new Transaction(description, amount, "expense");
        this.transactions.add(transaction);
        return true;
    }
    public void showTransactions(){
        if(this.transactions.isEmpty()){
            System.out.println("No transactions yet");
            return;
        }
        for(Transaction transaction : this.transactions){
            System.out.println(transaction.summary());
        }

    }
}