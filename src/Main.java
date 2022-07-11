import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        int range = 0;
        System.out.println("Chose game diffculty :");
        System.out.println("1. Easy   range (1-100)");
        System.out.println("2. Medium   range (1-300)");
        System.out.println("3. Hard   range (1-500)");
        System.out.println("Enter Your Choice");
        choice = sc.nextInt();

        switch (choice){
            case 1 :
                range = 100;
                break;
            case 2:
                range = 300;
                break;
            case 3:
                range = 500;
                break;
            default:
                System.out.println("invalid choice");
                break;
        }

        int myNumber =  (int) (Math.random()*range);





        int userNumber = 0;

        do {
            System.out.println("Guess The Number (1-"+range+") : ");
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