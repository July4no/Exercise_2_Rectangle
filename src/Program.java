import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, height, area, perimeter, diagonal;

        System.out.print("Base of the rectangle: ");
        base = sc.nextDouble();

        System.out.print("Height of the rectangle: ");
        height = sc.nextDouble();

        area = base * height;

        System.out.printf("AREA = %.4f\n", area);

        perimeter = 2 * (base + height);

        System.out.printf("PERIMETER = %.4f\n", perimeter);

        diagonal = Math.sqrt(base * base + height * height);

        System.out.printf("DIAGONAL = %.4f\n", diagonal);

        sc.close();
    }
}