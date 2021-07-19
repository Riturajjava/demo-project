package inputparameter;

public class Methodwithretruntyes {

    public String  demotest(String input){
        String result="hello.."+input;

        return result;
    }
    public int intdemo(int input){
        int result=input*input;
        return result;
    }

    public static void main (String[] args) {
        Methodwithretruntyes object=new Methodwithretruntyes();
       String data= object.demotest("java ");
       System.out.println(data);
       int output=object.intdemo(12);
       System.out.println("Square "+output);


    }


}
