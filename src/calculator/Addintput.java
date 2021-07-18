package calculator;

public class Addintput {

    int a=22;
    int b=02;
    int sum=a+b;

    public void addmethod(){
        System.out.println("Sum of a and b: "+sum);
    }
    public  void multi(){
         int a=7;
         int b=8;
         int multiple=a*b;

         System.out.println("Multi of a and b: "+multiple);
         System.out.println(+multiple+sum);
    }
    public void sub(){
        int a=300;
        int b=196;
        int sub=a-b;
        System.out.println("Sub of a and b: "+sub);
    }
    public void div(){
        int a=171;
        int b=18;
        int div=a/b;
        System.out.println("divided of a and b: "+div);
    }
    public static void main (String[] args) {

        Addintput object=new Addintput();
       object.addmethod();
       object.multi();
       object.sub();
       object.div();


    }




}
