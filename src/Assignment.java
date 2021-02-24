import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
         double [] arr = new double[]{12.5, 25.0,39.7,46.2,59.8};
         double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total= total + arr[i];
        }
        double average=total / arr.length;
        System.out.println("average is:" +average);
    }
}

