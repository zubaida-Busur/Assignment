import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month = input.nextInt();
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("31 days in the month");
        else if(month==4 || month==6 || month==9 || month==11 )
            System.out.println("30 days in the month");
        else if(month==2)
            System.out.println("either 28 or 29 days in month");







    }
}

