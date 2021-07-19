package calculator;

public class Calwithintputparameter {

    public void addmethod(int a, int b){
        int sum=a+b;
        System.out.println("value of sum "+sum);
    }
    public void submethod(int a, int b){
        int sub=a-b;

        System.out.println("Sub is "+sub);{
            int multi=a*b;
        System.out.println("multi is "+ multi);}
    }
    public void div(int a,int b){
        int divided=a/b;
        System.out.println("div is "+divided);
    }


    public static void main (String[] args) {
        Calwithintputparameter object=new Calwithintputparameter();
        object.addmethod(89,33);
        object.addmethod(189,76);
        object.submethod(30,10);
        object.div(300,120);
    }

}
