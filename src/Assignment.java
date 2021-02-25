import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("enter 1st numbers:");
//        int m = in.nextInt();
//
//        System.out.println("enter 2nd numbers:");
//        int n = in.nextInt();
//        System.out.println("enter operator");
//        char operator = in.next().charAt(0);
//
//        //calling the FUNCTION void
//        calculator(m,n,operator);
        Vehicle toy=new Vehicle();
        Vehicle tooyo=new Vehicle(3,"red");

        System.out.println(toy.getpass());
        System.out.println(tooyo.getpass());
        Calculator fx99 = new Calculator(12,18);
        int result;

        System.out.println(fx99.getpass());













    }
    public static void calculator(int m, int n,  char operator ) {
        System.out.println();

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

