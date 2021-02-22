import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();

        boolean leapyear = leap( year);
        System.out.println(leapyear);

    }


        public static boolean leap(int year)
        {

           if((year%4)==0)
               return true;
           else
               return false;

        }








}

