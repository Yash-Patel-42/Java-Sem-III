import java.util.Scanner;

class ArraySearch {
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

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] == target) 
            {
                System.out.println(target + " Found at index " +i);
            } else 
                {
                    System.out.println(target + " Not found in the array.");
                }
        }
    }
}