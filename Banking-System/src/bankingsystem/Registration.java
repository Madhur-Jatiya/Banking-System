package bankingsystem;

import java.util.Scanner;

public class Registration {
    private String username;
    private String password;
    private String confrimPassword;
        
    Operations operations = new Operations();

    Scanner sc = new Scanner(System.in);
    
    final public void ask()
    {
        System.out.println("\t\t\tUser Registration\n\n");
       System.out.print("Are you Existing User (Y/N) : ");
       String ans = sc.next();
       
        if (ans.equals("y") || ans.equals("Y")) {
            logIn();
        }    
        else
        {
            signUp();
        }
    }
    
    
                //Log In
    
    final public void logIn(){        
        String username1;
        String password1;
        
//        sc.next();
        System.out.println("\n\t\t\tLogIn\n");
        System.out.print("Enter Username : ");
        username1 = sc.next();
        System.out.print("Enter Password : ");
        password1 = sc.next();  
        
       
        
            if((username1.equals(username)) && (password1.equals(password))){
                System.out.println("\n\t\tLogin Successfully");
            }
        
             else                
            {
                while ((!username1.equals(username)) && (!password1.equals(password)) || (username1.equals(username)) && (!password1.equals(password)) || (!username1.equals(username)) && (password1.equals(password))) {                    
                    System.out.println("You Enter wrong username or password");
                    
                    System.out.print("Enter Username : ");
                    username1 = sc.next();
                    System.out.print("Enter Password : ");
                    password1 = sc.next();
                    
                    System.out.println("\nDo you want to forget password?? (Yes/No) :");
                    String forget = sc.next();

                    if (forget.equals("yes") || forget.equals("YES") || forget.equals("y") ||forget.equals("Y")) 
                    {
                        forget();
                        logIn();
                    }
                }         
                
                System.out.println("\n\t\tLogin Successfully\n");
            }
        operations.mainMenu();
    }
    
    
                //Sign Up
    
    final public void signUp()
    {
        System.out.println("\n\t\t\tSignUp\n");
        System.out.print("Enter Username : ");
//        sc.next();
        username = sc.next();
        System.out.print("Enter Password : ");
        password = sc.next();        
        System.out.print("Confrim Password : ");
        confrimPassword = sc.next();
        
        
        if(password.equals(confrimPassword))
        {
            operations.userDetails();
            logIn();
        }
        
        else
        {
            while ( !password.equals(confrimPassword)) {                
            System.out.print("Password not matched.\n Please Enter correct password again : ");
            confrimPassword = sc.next();
            }
            
            operations.userDetails();
            logIn();            
        }
        
    }
    
    public final void forget()
    {
        System.out.println("\nPress 1 for forget Username");
        System.out.println("Press 2 for forget Password");
        System.out.println("Press 3 for forget both");
        String forget = sc.next();
        
        if (forget.equals("1")) {
            System.out.println("\nPlease Re-Enter New Username");
            String forgetUsername = sc.next();
            username = forgetUsername;
        }
        
        else if (forget.equals("2")) {
            System.out.println("\nPlease Re-Enter New Password");
            String forgetPassword = sc.next();
            password = forgetPassword;
        }
        
        else{
            System.out.println("\nPlease Re-Enter New Username");
            String forgetUsername = sc.next();
            username = forgetUsername;
            System.out.println("\nPlease Re-Enter New Password");
            String forgetPassword = sc.next();
            password = forgetPassword;
        }
    }
}
