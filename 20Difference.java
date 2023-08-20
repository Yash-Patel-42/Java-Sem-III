class Difference {
    public static void main(String[] args) {
        // Difference between equals() and ==
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = str1;

        System.out.println("Using equals(): " + str1.equals(str2)); // true
        System.out.println("Using ==: " + (str1 == str2)); // false
        System.out.println("Using == (same reference): " + (str1 == str3)); // true

        // Difference between StringBuffer and StringBuilder
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("Hello");

        stringBuffer.append(" World");
        stringBuilder.append(" World");

        System.out.println("StringBuffer: " + stringBuffer); // Hello World
        System.out.println("StringBuilder: " + stringBuilder); // Hello World
    }
}