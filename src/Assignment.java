import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        int x = 12;
        int y = 13;
        int  z = 18;
        int minimum = min(12, 13, 18);
        System.out.println(minimum);

    }


        public static int min(int  x, int  y, int  z)
        {

            int s=Math.min(x,y);
            s=Math.min(s,z);
            return s;
        }








}

