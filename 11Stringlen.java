class Stringlen{
    public static void main(String[] args){
        String s1 = "Hello How Are You";
        int len = s1.length();

        String s2 = s1.substring(len/2);
        System.out.println("Length of string = "+len);
        System.out.println("Half of string = "+s2);

    }
}