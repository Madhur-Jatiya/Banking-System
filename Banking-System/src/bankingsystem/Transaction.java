package bankingsystem;

import  java.util.ArrayList;

public class Transaction{    
            
    ArrayList list = new ArrayList();

    public void transactionUpdate(int transactionId, String transactionType, double amount) 
    {
        TransationVariable transactionvariable = new TransationVariable(transactionId, transactionType, amount);
        list.add(transactionvariable);
    }

    
    public void transationSearch(double amount)
    {       
        boolean check = false;
        
        for (int i = list.size()-1; i >= 0; i--) {
            TransationVariable compareAmount = (TransationVariable) list.get(i);
            if (compareAmount.getAmount() == amount || compareAmount.getAmount() == -amount) 
            {
                    compareAmount.display();
                    check = true;
            }
        }
        
        if (!check) {
                System.out.println("\n\tNo Transaction history found of amount " + amount);
        }
    }

    
    public void viewAllTransactions()
    {
        if (list == null) {
            System.out.println("No transaction happend");
        }
        
        else
        {
            System.out.println("\n\n\t\t\tLatest Transaction History");
            for (int i = list.size()-1; i >= 0; i--) {
                TransationVariable print = (TransationVariable) list.get(i);
                print.display();
            }
        }
    }
}
