public class Businessman {


    String name;
    int age;
    String time;
    double salary;

    public void name (String name) {
        System.out.println("Function is run.. " + name);
    }

    public void age (int age) {
        System.out.println("Function is run. " + age);
    }

    public void time (String time)
        { System.out.println("Function is run. " + time);
        }
    public void salary(double salary){
            System.out.println("Function is run. " + salary);
        }
        public static void main(String[] args){
            Businessman object=new Businessman();
            object.name("Ravi kumar");
            object.age(26);
            object.time("8 to 4");
            object.salary(5400);



        }

    }

