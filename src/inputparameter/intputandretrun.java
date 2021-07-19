package inputparameter;

import static sun.java2d.cmm.ColorTransform.Out;

public class intputandretrun<enamey> {

    public int addition (int a, int b) {
        int result =a+b;

       return result;
    }
    public int subtraction(int a,int b){
        int sub=a-b;

     return sub;
    }
    public int multiple(int a,int b){
        int multi=a*b ;

        return multi;
    }
    public int divided(int a,int b){
        int total=a/b;

        return total;
    }




    public static void main (String[] args) {
        intputandretrun object=new intputandretrun();
      int fun=object.addition(25,23);
      int data=object.subtraction(120,79);
      System.out.println("output form subtraction method is "+data);
      System.out.println("output form addition method is..."+fun);
       int result=object.multiple(19,9);
       System.out.println( "Output form multiple is " +result);
       int out=object.divided(1221,10);
       System.out.println("Output form divided is "+out);
    }




}