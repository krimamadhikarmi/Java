import java.io.File;

public class DirFile {
    public static void main(String[] args) {
        String directoryPath ="C:\\Users\\Krima\\Desktop\\College\\7th sem";
        File directory = new File(directoryPath);
        File[] files=directory.listFiles();
        for (File file: files){
            System.out.println(file.getName());
        }
    }
}
