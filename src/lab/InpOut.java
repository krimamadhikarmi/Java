//Write a java program to read from file input.txt and write its contents to output.txt
package lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InpOut {
    public static void main(String[] args) throws Exception{
        FileInputStream in=new FileInputStream( "input.txt");
        FileOutputStream out=new FileOutputStream( "output.txt");
        int c;
        while ((c=in.read())!=-1) {
            out.write(c);
        }
        in.close();
        out.close();

    }
}
