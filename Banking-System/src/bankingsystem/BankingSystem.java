package bankingsystem;

public class BankingSystem {

    public static void main(String[] args) {
        
        System.out.println("\t\tWELCOME TO Moms BANK OF INDIA(MBI)\n\n");
        Registration registration = new Registration();
        registration.ask();
        Operations operations = new Operations();
//        operations.mainMenu();
    }
    
}
