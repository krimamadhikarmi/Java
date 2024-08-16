public class superKey {
    public static void main(String args[]) {
        Cat myDog = new Cat(); 
        myDog.animalSound(); 
    }
    
}
class Mammal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
}
class Cat extends Mammal{
    public void animalSound() {
        super.animalSound();
        System.out.println("The cat is mammal");
    }
}
