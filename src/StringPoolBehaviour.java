public class StringPoolBehaviour {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3=new String("String");
        String s4=new String("String");
        String s5=new String("Java");

        //checks whether two references points to the same object
        System.out.println(s1 == s2);//true
        System.out.println(s3 == s4);//false
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s5);//false

        System.out.println();
        //checks the content equality
        System.out.println(s1.equals(s2));//true
        System.out.println(s3.equals(s4));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s2.equals(s5));//true

    }
}
