import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter 1st numbers:");
        int m = in.nextInt();

        System.out.println("enter 2nd numbers:");
        int n = in.nextInt();
        System.out.println("enter operator");
        char operator = in.next().charAt(0);

        //calling the FUNCTION void
        calculator(m,n,operator);

    }
    public static void calculator(int m, int n,  char operator ) {


        double result;

        switch (operator) {
            case '+':
                result = m + n;
                System.out.println("result:" + result);
                break;
            case '-':
                result = m - n;
                System.out.println("result:" + result);
                break;
            case '*':
                result = m * n;
                System.out.println("result:" + result);
                break;
            case '/':
                result = m / n;
                System.out.println("result:" + result);
                break;
        }
    }
    }

