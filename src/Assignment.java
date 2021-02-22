import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if(num1>num2)
             if(num1>num3)
                System.out.println("the greatest is" +num1);
             if(num2>num1)
             if(num2>num3)
                System.out.println("the greatest no is" +num2);
            if(num3>num1)
            if(num3>num2)
                System.out.println("the greatest no is" +num3);






    }
}

