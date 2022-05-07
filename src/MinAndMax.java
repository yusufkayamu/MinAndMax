import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter=");
        int NumberCounter = input.nextInt();
        int max=0,min=0;

        for (int i=1 ; i <=NumberCounter ; i++){
            System.out.print(i + ". Number =");
            int x = input.nextInt();

            if (x > max) {
                if (min == 0) {
                    min = x;
                }
                max = x;
            }
            if (x < min) {
                if (max == 0) {
                    max = x;
                }
                min = x;
            }
        }
        System.out.println("Max number " +max);
        System.out.println("Min number " +min);
    }
}
