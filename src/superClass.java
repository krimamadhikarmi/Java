public class superClass {
    public static void main(String[] args) throws Exception{
        childClass cls=new childClass();
    }
}
class BaseClass{
    BaseClass(){
        System.out.println("Base class constructor is called");
    }
}
class childClass extends BaseClass{
    childClass(){
        super();
        System.out.println("from base class constructor");
    }
}
