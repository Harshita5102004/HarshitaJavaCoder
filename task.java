import java.util.Scanner;
class ATM {
    public static void main(String[] args) {
        int number = 1234 ;
        int Pin = 2345 ;
        int balance =1000;
	    int withdrawAmount,depositAmount;
         System.out.println("ATM machine");
        System.out.println("Enter you moblie Number");
        Scanner scanner = new Scanner (System.in);
        int num = scanner.nextInt();
        System.out.println("Enter your Pin");
        int pin = scanner.nextInt();
          
        if (num == number && pin == Pin)
        {
            System.out.println("your number and pin is correct!");
            
            System.out.println("Enter your choice");
            System.out.println("1. for Withdraw");
            System.out.println("2. for deposite");
            System.out.println("3. for cheak balance");
            System.out.println("4. for EXIT");
        
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                balance = amountWithdrawing();
                break;
            case 2:
                 amountDepositing() ;
                break;
            case 3:
                 displayBalance(balance);
                 break;
            case 4:
                 System.exit(0);  
                 }
                
                
        }
         else 
       {
            System.out.println("Incorrect moblie number and pin");
        }
        }
        
        
        
        
        
        //method of amount withdrawing
        public static int amountWithdrawing(){
            
            int balance =1000;
            System.out.println("Enter your withdraw amount");
            Scanner scann = new Scanner (System.in);
            int withdrawAmount = scann.nextInt();
                        
            if (balance>=withdrawAmount)
            {
                balance-=withdrawAmount;
                 System.out.println("withdraw amount is "+withdrawAmount+"Rs");
                 displayBalance(balance); 
                
            }
               else 
              {
               System.out.println("your amount is not sufficient");  
              }
        return balance;
        }
        // Method of amount Deposite 
        public static void amountDepositing() {
           int balance =1000;
           Scanner scann = new Scanner (System.in);
           System.out.println("Enter your Deposite amount "); 
           int depositAmount = scann.nextInt();
           balance = balance + depositAmount; 
           System.out.println( 
            "Your "+depositAmount+"Rs amount successfully deposited"); 
          System.out.println("current balance is :"+balance+"Rs");
    } 
    // Display current balance in account 
    public static void displayBalance(int balance) 
      { 
        System.out.println("Current Balance : " + balance); 
        System.out.println(); 
      } 
       
      
    }