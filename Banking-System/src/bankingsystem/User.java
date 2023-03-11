package bankingsystem;

import java.util.Scanner;

public class User {
    private String fullName;
    private String mobileNumber;
    private String dateOfBirth;
    private int age;
    private String gender;
    private String permanentAddress;
    private String adharCardNumber;
    private String emailId;
    private double accountOpeningAmount;
    protected double accountBalance;
    
    Scanner sc = new Scanner(System.in);
    
    public void userDetails()
    {
        System.out.print("\n\nEnter Full Name : ");
        fullName = sc.nextLine();

            //mobile number validation
        System.out.print("Enter Mobile Number(Only use 10 digit no dont use +91,+1 etc) : ");
        mobileNumber = sc.next();

        if(mobileNumber.matches("[0-9]{10}"))
            {
            } 

        else
        {                
            while (!mobileNumber.matches("[0-9]{10}"))
            {
                System.out.println("\t\tInvalid Mobile Number\n");
                System.out.print("Enter Mobile Number(Only use 10 digit no dont use +91,+1 etc) : ");
                mobileNumber = sc.next();
            }
        }
  
        
        System.out.print("Enter Email ID : ");
        emailId = sc.next();
        System.out.print("Enter Date Of Birth : ");
        dateOfBirth = sc.next();
        
        
            //age validation
        System.out.print("Enter Age(In numbers | Minimum age 16) : ");
        age = sc.nextInt();
        sc.nextLine();
        if (age>=16) {          
        }
        
        else{
            System.out.println("You are not elegible. Your are less then 16");
            System.exit(0);
        }
        
        System.out.print("Enter Gender : ");
        gender = sc.next();
        System.out.print("Enter Permanent Address : ");
        permanentAddress = sc.next();
        
            //adhar card number validation        
        System.out.print("Enter Adhar Card Number(Only 12 digit number) : ");
        adharCardNumber = sc.next();
        
        if(adharCardNumber.matches("[0-9]{12}"))
            {
            } 

        else
        {                
            while (!adharCardNumber.matches("[0-9]{12}"))
            {
                System.out.println("\t\tInvalid Adhar Number\n");
                System.out.print("Enter Adhar Card Number(Only 12 digit number) : ");
                adharCardNumber = sc.next();
            }
        }
        
        //account opening amount validation        
        System.out.print("Enter Account Opening Amount(Greater than or equal to 10,000) : ");
        accountOpeningAmount = sc.nextDouble();
        
        
        if (accountOpeningAmount>=10000) {
            System.out.println("\n\t\tRegistration Successfully on Moms Bank Of India(MBI)");            
        }
        
        else
        {
            while (accountOpeningAmount<10000) {            
                System.out.print("Your amount is less than 10,000.\nPlease Enter Greater than or equal to 10,000 :");
                accountOpeningAmount = sc.nextDouble();
            }

            System.out.println("\n\t\tRegistration Successfully on Moms Bank Of India(MBI)");            
        }
        
        accountBalance = accountOpeningAmount;
        System.out.println("\n\t\tSign Up Successfully.Press Enter for Proceed to LogIn");
    }
    
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getAdharCardNumber() {
        return adharCardNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getAccountOpeningAmount() {
        return accountOpeningAmount;
    }

    public void setAccountOpeningAmount(double accountOpeningAmount) {
        this.accountOpeningAmount = accountOpeningAmount;
    }   

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
