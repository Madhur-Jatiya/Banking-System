package bankingsystem;

public class TransationVariable {
    private int transactionId;
    private String transactionType;
    private double amount;

    public TransationVariable(int transactionId, String transactionType, double amount) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }
    
    public void display()
    {
        System.out.println("\nID : " + transactionId);
        System.out.println("Type : " + transactionType);
        System.out.println("Amount : " + amount);
    }

    public double getAmount() {
        return amount;
    }
}
