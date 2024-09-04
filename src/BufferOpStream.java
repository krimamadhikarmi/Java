import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOpStream {
    public static void main(String[] args) {
        try{
            String str= "Hello";
            FileOutputStream fos= new FileOutputStream("input.txt");
            BufferedOutputStream bos= new BufferedOutputStream(fos);
            byte b[]=str.getBytes();
            bos.write(b);
            bos.flush();
            System.out.println("Contents written succesfully");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
