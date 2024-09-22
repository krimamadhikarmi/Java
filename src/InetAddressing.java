import java.net.*;
public class InetAddressing {
    public static void main(String[] args) throws Exception{
        // InetAddress address = InetAddress.getByName("www.google.com");
        InetAddress address=InetAddress.getLocalHost();
        System.out.println(address);
    }
}
