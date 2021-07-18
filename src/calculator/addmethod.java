package calculator;

public class addmethod {

    // properties
    // add, sub, multiply, div

    public void add(int a, int b) {
        int sum=a+b;
        System.out.println("This is add method. "+sum);
    }
    public void sub(int a,int b){
        int sub=a-b;
        int multi=a*b;
        int div=a/b;
        System.out.println("sub of a and b: "+sub);
        System.out.println("multiple of a and b: "+multi);
        System.out.println("Divided of a and b: "+div);

    }
    public void multi(){
        int a=4;
        int b=90;
        int multi=a*b;

        System.out.println("multiple of a and b: " +multi);

    }




    public static void main (String[] args) {
        addmethod object = new addmethod();
        object.add(44, 90);
        object.add(22,44);
        object.sub(111,11);
        object.multi();

    }





}
