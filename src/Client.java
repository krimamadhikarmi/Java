import java.net.*;
import java.io.*;
public class Client  {
    public static void main(String[] args) throws Exception {
        Socket s= new Socket("localhost",4999);
        PrintWriter pr =new PrintWriter(s.getOutputStream());
        pr.println("hello");
        pr.flush();
        s.close();
    }
}
