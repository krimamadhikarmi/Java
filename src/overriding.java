public class overriding {
    public static void main (String[] args){
        Dog obj= new Dog();
        obj.displayInfo();
    }
}
class AnimalB{
    public void displayInfo(){
        System.out.println("I am an animal");
    }
}
class Dog extends AnimalB{
    @Override
    public void displayInfo(){
        System.out.println("I am a dog");
    }
}
