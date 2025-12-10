public class Calculator {


    public int add(int a ,int b){
        return a+b;
    }

    public double add(double a,double b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public String add(String a,String b){
        return a+b;
    }

}

class Main{
    public static void main(String[] args) {
        Calculator cal=new Calculator();



        System.out.println("Hello World");
        System.out.println(cal.add(1,2));
        System.out.println(cal.add(2.0,3.0));
        System.out.println(cal.add(1,2,3));

    }
}
