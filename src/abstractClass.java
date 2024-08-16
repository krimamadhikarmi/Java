abstract class Utilities{
    abstract void display();
}
public class abstractClass {
    public static void main(String[] args){
        Utilities p=new Utilities() {
            void display(){
                System.out.println("Good Morning");
            }
        };
        p.display();
    }
}
