import java.util.Random;
import java.util.Scanner;

public class Main {
    public void guess(){
        Random r = new Random();
        int randomNumber = r.nextInt(1,100);
        Scanner sc = new Scanner(System.in);
        int attempt = 1;
        System.out.println("Guess the number between 1 to 100.");
        int guess = sc.nextInt();
        while(attempt<3 && guess!=randomNumber){
            if(guess>randomNumber){
                System.out.println("Enter the lower number! "+"attempt-"+attempt);
                guess = sc.nextInt();
                attempt++;
            }
            if(guess<randomNumber) {
                System.out.println("Enter the bigger number! "+"attempt-"+attempt) ;
                guess = sc.nextInt();
                attempt++;
            }
        }
        if(attempt>3){
            System.out.println("Oops,You lost!");
        }
        else if(attempt==1){
            System.out.println("Won!, Your score is 100%");
        }
        else if (attempt==2) {
            System.out.println("Won!, Your score is 70%");
        }
        else if(attempt==3){
            System.out.println("Won!, Your score is 40%");
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.guess();
        System.out.println("Do you want to play again?");
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        if(ans.equals("yes")){
            obj.guess();
        }

    }
}