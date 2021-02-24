import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {

        double a = 5.5, b = 98.7, c = 5.6;

       calculateRoots(a,b,c);

    }
    public static void calculateRoots(double a,double b,double c)
    {
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if(determinant > 0){
            root1 = (-b + Math.sqrt(determinant));
            root2 = (-b - Math.sqrt(determinant));
            System.out.println("root1=\t" +root1+ "\t root2=\t" +root2);
        }
        else if (determinant==0){
            root1 = -b/(2*a);
            System.out.println(+root1);

        }
    }

}