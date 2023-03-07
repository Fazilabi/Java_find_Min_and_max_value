import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? :");
        int count = scanner.nextInt();
        System.out.println("Enter " + count + " numbers orderly :");
        int[] list = new int[count];
        // First version
        for (int i = 0; i < count; i++) {
            System.out.print("Enter " + (i + 1) + ". number :");
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Full list is : " + Arrays.toString(list));
        System.out.println("Min value of list is :" + list[0]);
        System.out.println("Max value of list is :" + list[count - 1]);
        System.out.println("==============================");



    }
}