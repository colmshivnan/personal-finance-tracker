public class Transaction{
    private String description;
    private double amount;
    private String type;

    public Transaction(String description, double amount, String type){
        if(amount <= 0 ){
            throw new IllegalArgumentException("Amount must be positive");
        }
        if(!type.equals("income") && !type.equals("expense")){
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