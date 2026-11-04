public class BankAccount{
    private double balance;
    private String name;

    public BankAccount(String name, double balance){
        if(balance < 0 || !Double.isFinite(balance)){
            throw new IllegalArgumentException("Balance must be a non-negative finite number");
        }
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount <= 0 || !Double.isFinite(amount)){
            throw new IllegalArgumentException("Amount must be a positive finite number");
        }
        double newBalance = this.balance + amount;
        if(!Double.isFinite(newBalance)){
            throw new IllegalArgumentException("Deposit would make the balance non-finite");
        }
        this.balance = newBalance;
    }
    public boolean withdraw(double amount){
        if(Double.isFinite(amount) && this.balance >= amount && amount > 0){
            this.balance -= amount;
            return true;
        }
        return false;
    }
    public String summary(){
        return this.name + " has $" + this.balance + " in their bank account.";
    }
}