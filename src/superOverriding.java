public class superOverriding {
    public static void main(String[] args) throws Exception{
        childCls obj = new childCls();
        obj.myMethod();  // Change this to call myMethod instead of display
    }
}

class baseCls {
    public void display() {
        System.out.println("Overridden method");
    }
}

class childCls extends baseCls {
    public void myMethod() {
        super.display();
        System.out.println("Overriding method");
    }
}
