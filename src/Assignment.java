import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        double x = 12.5;
        double y = 13.6;
        double z = 18.9;
        double findavg = average(12.5, 13.6, 18.9);
        System.out.println(findavg);

    }


        public static double average(double x, double y, double z)
        {
            double avg=(x + y + z) / 3;
            return avg;
        }








}

