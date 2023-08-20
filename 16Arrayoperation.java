import java.util.Scanner;

class Arrayoperation {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int sum = 0;
        int max = array[0];
        int min = array[0];
        for (int num : array) 
        {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        double mean = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
