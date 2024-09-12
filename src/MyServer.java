import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class MyServer  extends UnicastRemoteObject implements Adder{
    public MyServer() throws Exception{
        super();
    }
    public static void main(String[] args) throws Exception {
        try{
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.rebind("hi_Server",new MyServer());
            System.out.println("Server is ready now");
        }
        catch(RemoteException e){
             System.out.println(e);
        }
    }
   
    @Override
    public int Add(int x, int y) throws RemoteException {
        // TODO Auto-generated method stub
        return x*y;
    }
    
  
    
    
}
