package bankingsystem;

import java.util.Scanner;

final public class Operations extends User{
    
    private final String bankName = "Moms Bank of India";
    private final String branchName = "MBI INDORE";
    private final long accountNumber = 56433209320l;
    private final String ifscCode = "MBIN0001604";
    private double amount;
    private int id = 1;
    private Transaction transaction = new Transaction();
    
    Scanner sc = new Scanner(System.in); 
        
    public void exitOrContinue()
    {
        
        System.out.print("\nPress 1 for continue and any key for exit : ");
        String x = sc.next();
        
        if (x.equals("1")) {
            mainMenu();
        }
        
        else
        {
            exit();
        }
    }
     
    public void mainMenu()
    {
//        sc.nextLine();
        System.out.println("\n\n\t\t\tMain Menu\n");
        System.out.println("Press 1 for Debit Details");
        System.out.println("Press 2 for Credit Details");
        System.out.println("Press 3 for View Transaction History");
        System.out.println("Press 4 for Search By Amount");
        System.out.println("Press 5 for View Account Balance");
        System.out.println("Press 6 for View User Details");
        System.out.println("Press 7 for Update User Details");
        System.out.println("Press 8 for Exit");
        System.out.print("Enter key : ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println();
        
        switch(x)
            {
                case 1:
                    debitDetails();
                    break;
                   
                case 2:
                    creditDetails();
                    break;
                 
                case 3:
                    viewTransactionHistory();
                    break;
                 
                case 4:
                    searchByAmount();
                    break;
                 
                case 5:
                    viewAccountBalance();
                    break;
              
                case 6:
                    userInformation();
                    break;
                    
                case 7:
                    updateUserDetails();
                 
                case 8:
                    exit();
                    break;
        }
    }
    
    public void userInformation()
    {
        System.out.println("Name : " + getFullName());
        System.out.println("Mobile Number +91 " + getMobileNumber());
        System.out.println("Email Id : " + getEmailId());
        System.out.println("Date Of Birth : " + getDateOfBirth());
        System.out.println("Age : " + getAge());
        System.out.println("Permanent Address : " + getPermanentAddress());
        System.out.println("Adhar Card Number : " + getAdharCardNumber());
        System.out.println("Bank Name : " + bankName);
        System.out.println("Branch Name : " + branchName);
        System.out.println("Account Number :" + accountNumber);
        System.out.println("IFSC Code :" + ifscCode);
       
        exitOrContinue();
    }
   
    
    public void debitDetails()
    {
        System.out.print("Enter Amout your want to debit : ");
        amount = sc.nextDouble();
        accountBalance = accountBalance - amount;
        transaction.transactionUpdate(id, "Debit", -amount);
        id++;
        
        exitOrContinue();
    }
    
    public void creditDetails()
    {
        System.out.print("Enter Amout your want to credit : ");
        amount = sc.nextDouble();
        accountBalance = accountBalance + amount;
        transaction.transactionUpdate(id, "Credit", amount);
        id++;
        
        exitOrContinue();
    }
    
    public void searchByAmount()
    {
        System.out.print("Enter amount whose history you want to know : ");
        amount = sc.nextDouble();
        transaction.transationSearch(amount);

        exitOrContinue();
    }
    
    final public void viewTransactionHistory()
    {
        transaction.viewAllTransactions();

        exitOrContinue();
    }
    
    final public void viewAccountBalance()
    {        
        System.out.println("Your Account balance is : " + accountBalance);
        exitOrContinue();
    }
    
    public void exit()
    {
        System.out.println("\n\n\n\t\t\tThanks For Visit In MBI");  
        System.exit(0);
    }

    private void updateUserDetails() {
        System.out.println("Press 1 for Update Name");
        System.out.println("Press 2 for Update Mobile Number");
        System.out.println("Press 3 for Update Email Id");
        System.out.println("Press 4 for Update Date Of Birth");
        System.out.println("Press 5 for Update Permanent Address");
        
        System.out.print("Enter Response : ");
        int y = sc.nextInt();
        sc.nextLine();
        switch(y)
        {
            case 1:
                System.out.print("\nEnter New Updated Name : ");
                String updateFullName = sc.nextLine();
                setFullName(updateFullName);
                System.out.println("\n\t\tName is Updated");
                break;
            
            case 2:
                System.out.print("\nEnter New Updated Mobile Number : ");
                String updateMobileNumber = sc.next();
                setMobileNumber(updateMobileNumber);
                if(updateMobileNumber.matches("[0-9]{10}"))
                {
                } 

                else
                {                
                    while (!updateMobileNumber.matches("[0-9]{10}"))
                        {
                        System.out.println("\t\tInvalid Mobile Number\n");
                        System.out.print("Enter Mobile Number(Only use 10 digit no dont use +91,+1 etc) : ");
                        updateMobileNumber = sc.next();
                        }
                }
                System.out.println("\n\t\tMobile Number is Updated");
                    break;
                
            case 3:
                System.out.print("\nEnter New Updated Email Id : ");
                String updateEmailId = sc.next();
                setEmailId(updateEmailId);
                System.out.println("\n\t\tEmail Id is Updated");
                break;
            
            case 4:
                System.out.print("\nEnter New Updated Date Of Birth : ");
                String updateDateOfBirth = sc.nextLine();
                setDateOfBirth(updateDateOfBirth);
                System.out.println("\n\t\tDate Of Birth is Updated");
                break;
            
            case 5:
                System.out.print("\nEnter New Updated Permanent Address : ");
                String updatePermanentAddress = sc.nextLine();
                setPermanentAddress(updatePermanentAddress);
                System.out.println("\n\t\tPermanent Address is Updated");
                break;
                
            default:
                System.out.println("\n\tPlease Enter Correct choice\n");
                updateUserDetails();
        }
        
        mainMenu();
        
    }
}
