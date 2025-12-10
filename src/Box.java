class Box {

    int value;


}

class demoMain{

    public static void changePrimitive(int x){
        x=100;
        System.out.println("Inside changePrimitive: "+x);
    }

    public static void changeObject(Box b){
        b.value=100;
        System.out.println("Inside change Object :"+b.value);
    }

    public static void main(String[] args) {
        //Primitive example

        int x=10;
        System.out.println("Before changePrimitive: "+x);
        changePrimitive(x);
        System.out.println("After changePrimitive: "+x);

        System.out.println();

        //reference Exaple
        Box b=new Box();
        b.value=10;
        System.out.println("Before changeObject: "+b.value);
        changeObject(b);
        System.out.println("After changeObject: "+b.value);


    }

}
