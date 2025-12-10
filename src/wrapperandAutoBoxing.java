import java.util.ArrayList;

public class wrapperandAutoBoxing {

    public static void main(String[] args) {



                //autoboxing : convert primitive data type to wrapper class object
                //it is an object stored int the heap
                int x=10;
                Integer obj=x;
                System.out.println(obj);

                //unboxing: converts wrapper class object to primitive
                Integer a=20;
                int b=a;
                System.out.println(b);

                //Primitive types (int, double, etc.) are not objects
                //Collections like ArrayList, HashMap, etc., store objects only
                //Wrapper classes allow primitives to interact with object-based features

           //wrapper class in collection.

        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);


        //Using wrapper methods :convert string to Integer
        Integer val=Integer.valueOf("123");
        System.out.println(val);


            }
        }


