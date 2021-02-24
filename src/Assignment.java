import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {

        int[] contain = {55, 45, 90, 85, 31};

        int num=90;
        boolean check=contains(contain , num);
        System.out.println(check);

            }



    public static boolean contains(int[] contain, int num) {
        for (int i = 0; i < contain.length; i++) {
            if (num == contain[i])
                return true;
        }
        return false;
    }

}