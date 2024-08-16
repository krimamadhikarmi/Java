import java.lang.reflect.Constructor;

public class constructorChaining {
    public static void main(String[] args) throws Exception{
        nextClass constr=new nextClass();

    }
}
class ConstructorChain{
    ConstructorChain(){
        // this("Samriddhi");
        System.out.println("Default constructor called");
    }
    ConstructorChain(String str){
        this();
        System.out.println("Parameterized constrcutor called");
    }
}
class nextClass extends ConstructorChain{
  public nextClass(){
    super("called");
  }
}
