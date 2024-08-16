
public class singleton {
    public  static void main (String[] args) throws Exception{
       SingletonClass slc= SingletonClass.objectCreationMethod();
       slc.display();
    }
}
class SingletonClass{
    private static SingletonClass obj=null;
    private SingletonClass(){

    }
    public static SingletonClass objectCreationMethod(){
        if (obj==null){
            obj = new SingletonClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("Singleton class Example");
    }
}

