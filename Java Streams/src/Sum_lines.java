import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class Sum_lines {
    public static void main(String[] args) {
        try(BufferedReader buffRead=new BufferedReader(
                                        new InputStreamReader(
                                                new FileInputStream("C:\\Users\\Borsh\\IdeaProjects\\Java Streams\\src\\lines.txt"))))
        {

            int sum=0;
            String str;
            while ((str=buffRead.readLine())!=null){
                for (int i = 0; i <str.length() ; i++) {
                    sum=sum+(int)str.charAt(i);
                }
                System.out.println(sum);
                sum=0;
            }
        }
        catch (IOException ioex){
        System.out.print("Драсти май има грешка като липсваш файл :)");
        }







    }
}
