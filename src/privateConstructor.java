class mySingleton{
    private static mySingleton instance = null;
    private mySingleton(){}
    public static mySingleton getInstance() {
        if (instance == null) {
            instance = new mySingleton();
        }
        return instance;
    }
    
    public void display() {
        System.out.println("This is a Singleton instance");
    }
}
public class privateConstructor {
    public static void main(String[] args) {
        mySingleton singleInstance = mySingleton.getInstance();
        
        singleInstance.display();
    }
    
}
