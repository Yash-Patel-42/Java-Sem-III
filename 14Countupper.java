 import java.util.Scanner;
 
 class Countupper {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int j=0;

        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch==' ' && (Character.isUpperCase(input.charAt(i))));
            j++;
        }
        System.out.println("The no of words starting with uppercase are = "+j);
    }
}
