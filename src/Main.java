import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int myNumber =  (int) (Math.random()*100);

        int userNumber = 0;

        do {
            System.out.println("Guess The Number (1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber){
                System.out.println("#### WOOHOO You GUESSED NUMBER !!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is large...");
            }
            else {
                System.out.println("Your number is small like your....");
            }
        } while (userNumber >= 0);

        System.out.println(" number was :");
        System.out.println(myNumber);
    }
}