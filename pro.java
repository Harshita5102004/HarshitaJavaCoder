 import java.util.Random;
import java.util.Scanner;
// Now we declare class name NumberGuessingGame
public class NumberGuessingGame {

    public static void main(String[] args) {

Random Num = new Random(); // here Num is object of Random class 

Scanner scanner = new Scanner(System.in);// here scanner is object of of Scanner class
System.out.println("welcome to Guess Number Game");
System.out.println("You have maximum 5 Attemp Limit");
System.out.println("Good luck");

int randomNumber =Num.nextInt(100) + 1;



for (int i=0; i<5; i++)// limit of attemp
 {

System.out.println("Enter a guess number betweem 0 to 100");
int playerGuess = scanner.nextInt();

if (playerGuess == randomNumber)  
    {  System.out.println("Correct!");
       System.out.println("OOhhOO! Your Number is Correct You  Win the Game");
       break;// for stop the programm
    }

else if(randomNumber > playerGuess) 
    {
      System.out.println("Your Gusee number is smaller");
    }
else 
   {
      System.out.println("Your Guess number is Greater");
   }
  
 } 
 
 
//scanner.close();
System.out.println("!!!!!!DO YOU WANT TO PLAY AGAIN!!!!!!!! ");
System.out.println("If yes type true");
System.out.println("If No type false");
boolean bn = scanner.nextBoolean();  
if (bn ==  true){
    Random Num2 = new Random(); // here Num2 is object of Random class 

Scanner scan = new Scanner(System.in);// Here scan is object of of Scanner class
System.out.println("welcome to Guess Number Game");
System.out.println("You have maximum 5 Attemp Limit");

int randomNum = Nu.nextInt(100) + 1;// RandomNumber range between 0 to 100
for (int i=0; i<5; i++)// limit of attemp
 {

System.out.println("Enter a guess number betweem 0 to 100");
int playerGuess = scan.nextInt();

if (playerGuess == randomNum)  
    {  System.out.println("Correct!");
       System.out.println("OOhhOO! Your Number is Correct You  Win the Game");
       break;// for stop the programm
    }

else if(randomNum > playerGuess) 
    {
      System.out.println("Your Gusee number is smaller");
    }
else 
   {
      System.out.println("Your Guess number is Greater");
   }
  
 
}
}
else if (bn == false){
    System.out.println("I'm not want to play again");
}

                           }
     
                      }
