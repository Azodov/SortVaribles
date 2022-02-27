import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num1 ni kiriting: ");
        int num1 = scanner.nextInt();
        System.out.print("Num2 ni kiriting: ");
        int num2 = scanner.nextInt();
        System.out.print("Num3 ni kiriting: ");
        int num3 = scanner.nextInt();
        int minimum, middle, maximum;


        if (num1>num2) {
            maximum = num1;
            middle = num2;
        }
        else {
            maximum = num2;
            middle = num1;
        }
        if (num3>maximum) {
            minimum = middle;
            middle = maximum;
            maximum = num3;
        } else if (num3>middle) {
            minimum = middle;
            middle = num3;
        } else {
            minimum = num3;
        }
        System.out.println("Eng kattasi: " + maximum + ", O'rtachasi: " + middle + ", Eng kichigi: " + minimum);
    }
}