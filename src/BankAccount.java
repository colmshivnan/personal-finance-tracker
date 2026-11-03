public class BankAccount{
    private double balance;
    private String name;

    public BankAccount(String name, double balance){
        if(balance < 0 || Double.isNaN(balance)){
            throw new IllegalArgumentException("Balance must be non negative and not Nan");
        }
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0 ){
            this.balance += amount;
        }
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
    public boolean withdraw(double amount){
        if(this.balance >= amount && amount > 0){
            this.balance -= amount;
            return true;
        }
        return false;
    }
    public String summary(){
        return this.name + " has $" + this.balance + " in their bank account.";
    }
}