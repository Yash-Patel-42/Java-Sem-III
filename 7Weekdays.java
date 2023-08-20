import java.util.Scanner;
class Weekdays {
    public static void main(String args[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to select day:");
        a = sc.nextInt();
        sc.close();

        if(a == 0){
            System.out.println("You have selected Sunday");}
            else if(a == 1){
                System.out.println("You have selcted Monday");}
                else if(a == 2){
                    System.out.println("You have selcted Tuesday");}
                    else if(a == 3){
                        System.out.println("You have selcted Wednesday");}
                        else if(a == 4){
                            System.out.println("You have selcted Thursday");}
                            else if(a == 5){
                                System.out.println("You have selcted Friday");}
                                else if(a == 6){
                                    System.out.println("You have selcted Saturday");}
    }
}