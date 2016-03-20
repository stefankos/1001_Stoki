import java.io.*;
import java.util.ArrayList;

public class ALL_CAPITALS {
    public static void main(String[] args) {

        ArrayList<String> lstFileData=new ArrayList<>();
        String str;

        try(BufferedReader buffRead=new BufferedReader(
                                     new FileReader("C:\\Users\\Borsh\\IdeaProjects\\Java Streams\\src\\lines.txt")))
        {
           while ((str=buffRead.readLine())!=null){
               lstFileData.add(str.toUpperCase());
           }

        }
        catch (IOException ioex){
            System.out.print("Драсти май има грешка като липсваш файл :)");
        }

        try(FileWriter wr =new FileWriter("C:\\Users\\Borsh\\IdeaProjects\\Java Streams\\src\\lines.txt");) {

            for (String s :lstFileData) {
                wr.write(s);
                wr.write('\n');


            }

        }
        catch(IOException ioex){
            System.out.print("Драсти май има грешка като липсваш файл :)");
        }


    }
}
