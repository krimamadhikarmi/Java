interface Sit{
    void startSit();
}
interface Walk{
    void startWalk(int distance);
}
abstract class AnimalM{
    abstract void eats();

    void sleeps(){
        System.out.println("The animal has slept");
    }
}

class Lion extends AnimalM implements Sit,Walk{
  @Override
  void eats(){
    System.out.println("Lion is eating");
  }

  @Override
   public void startSit(){
    System.out.println("Started sitting");
  }

  @Override
  public void  startWalk(int distance){
    System.out.println("Covered distance"+ distance);
  }
}
public class multipleInheritance {
    public static void main (String[] args){
        Lion li=new Lion();
        li.startSit();
        li.eats();
        li.startWalk(10);
        li.sleeps();
        }
    
}
