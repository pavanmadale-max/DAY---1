class DemoUser{
    String name;

    public DemoUser(String name){
        this.name=name;
    }
}



public class garbageCollection {

    public static void main(String[] args) {

        DemoUser u1=new DemoUser("Pavan");
        DemoUser u2=new DemoUser("Mohit");

        System.out.println(u1.name);
        System.out.println(u2.name);

        u1=u2;
        u2=null;

        System.out.println(u1.name);


System.gc();

    }
}
