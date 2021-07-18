public class book {



     public void readbook(){
         System.out.println("This is read method.. " );
     }
     public void writebook(){
         System.out.println("This is write method.. ");
     }
    public static void main (String[] args) {
        book object=new book();
        object.readbook();
        object.writebook();
    }


}
