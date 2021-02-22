import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();


        if (n < 0)
        {
            System.out.println("number is negative");
        }
          else if (n > 0) {
            System.out.println("number is positive");

        } else {

            System.out.println("number is zero");
        }


    }
}

