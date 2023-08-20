import java.util.Scanner;
class Check {
    public static void main(String args[])
    {
            int a;
            // int a = Integer.parseInt(args[0]);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number:");
            a = sc.nextInt();
            sc.close();

            if(a < 0){
                System.out.println("The Entered Number is Negative");}
                else if(a > 0){
                    System.out.println("The Entered Number is Positive");}
                    else{
                        System.out.println("The Entered Number is 0");}
            
    }
}
