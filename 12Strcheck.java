class Strcheck {
    public static void main(String[] args)
    {
        String s1 = "Hello my name is Yash Patel";
        int v=0,c=0;
        int len = s1.length();
        String s2 = s1.toLowerCase();
        for(int i=0;i<len;i++){
            char ch = s2.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                v++;
            else
                c++;
        }
        System.out.println("No of Vowels are = "+v);
        System.out.println("No of Consonent are = "+c);
    }
}
