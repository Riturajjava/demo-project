package inputparameter;

public class Inputparameter {

    public void data(int a, int b){
        int sum=a+b;
        System.out.println("Sum of a and b: "+sum);
    }
    public void speech(String name){
       System.out.println("Name of Speech.."+name);
    }
    public void english(int i){
        System.out.println("Marks of English "+i);
    }


    public static void main (String[] args) {
        Inputparameter object=new Inputparameter();
        object.data(44,37);
        object.data(100,98);
        object.speech("Virus");
        object.speech("Environment");
        object.english(49);
    }

}
