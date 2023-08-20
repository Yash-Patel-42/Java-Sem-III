// import java.util.Scanner;

class Calculator {
    public static void main(String args[])
    {
        int a = Integer.parseInt(args[0]);
        String op = String.format(args[1]);
        // Scanner sc = new Scanner(System.in);
        // op = sc.next();
        // sc.close();
        int b = Integer.parseInt(args[2]);

        switch(op){
            case "+":System.out.println(a+b);break;
            case "-":System.out.println(a-b);break;
            case "*":System.out.println(a*b);break;
            case "/":System.out.println(a/b);break;
        }
    }
}
