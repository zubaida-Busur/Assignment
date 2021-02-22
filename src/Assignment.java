import java.util.Scanner;
public class Assignment {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
         int i,numbers=0, sum=0;
         double avg;
        System.out.println("enter any 5 numbers");

        for( i=0; i<5; i++){
            numbers=in.nextInt();
            sum=sum+numbers;
        }
        avg=sum/5;
        System.out.println("the sum of 5 no is:"+sum+ "\n average is:"+avg);

    }


    }

