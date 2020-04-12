import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double w = input.nextInt();
        double h = input.nextInt();
        double BMI = (w / Math.pow(h,2));
        System.out.println("BMI=" + BMI);
    }
}
