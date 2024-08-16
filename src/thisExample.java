public class thisExample {
    public static void main (String[] args) throws Exception{
        StudentClass st= new StudentClass("Krima","Bkt");
    }
}
class StudentClass{
    String name;
    int age;
    String address;

    public StudentClass(String name, int age) {
        System.out.println("Name"+ name + "Age"+ age);
    }
    public StudentClass(String name){
         System.out.println("Name"+name+ 21);
    }
    public StudentClass(int age){
        System.out.println("Krima"+age);
    }
    public StudentClass(){
        System.out.println("Krima"+19);
    }
    public StudentClass (String name,String address){
       System.out.println("Name: "+name + "Address: "+address);
    }
}
