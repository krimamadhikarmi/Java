public class inherit extends Animal {
    public static void main(String[] args) throws Exception{
        inherit dog=new inherit();
        dog.display();
    }
}
class Animal{
    protected void display(){
        System.out.println("I am an animal");
    }
}