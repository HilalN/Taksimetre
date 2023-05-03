import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define the variables
        int distance;
        double total = 10;

        //get the distance from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        distance = input.nextInt();

        //do the math
        total += distance * 2.20;
        if(total < 20){
            total = 20;
        }

        //print the result
        System.out.println("Total amount: " + total);
    }
}