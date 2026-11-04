public class Transaction{
    private String description;
    private double amount;
    private String type;

    public Transaction(String description, double amount, String type){
        if(amount <= 0 || !Double.isFinite(amount)){
            throw new IllegalArgumentException("Amount must be a positive finite number");
        }
        if(!"income".equals(type) && !"expense".equals(type)){
            throw new IllegalArgumentException("Type must be either income or expense");
        }
        this.description = description;
        this.amount = amount;
        this.type = type;
    }
    public String summary(){
        return "Transaction: " + this.description
                + " | Amount: $" + this.amount
                + " | Type: " + this.type;
    }
}