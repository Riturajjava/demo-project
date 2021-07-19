package inputparameter;

public class factor {

    public String  Stringdemo(String input){

        String result="Data base "+input;
        return result;
    }
    public int intdemo(int input){
        int data=input*input;
        System.out.println("Value of input "+input);
        return data;
    }


    public static void main (String[] args) {
        factor object=new factor();
        String out=object.Stringdemo( "OF JAVA ");
        System.out.println("output is..."+out);
        int output=object.intdemo(11);
        System.out.println("Square of input  "+output);
    }

}
