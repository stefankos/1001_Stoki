import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Count_character_types {
    private static ArrayList<String> reader(String filepath){

        ArrayList<String> lstFileData=new ArrayList<>();
        String str;

        try(BufferedReader buffRead=new BufferedReader(
                new FileReader(filepath)))
        {
            while ((str=buffRead.readLine())!=null){
                lstFileData.add(str);
            }

        }
        catch (IOException ioex){
            System.out.print("Драсти май има грешка като липсваш файл :)");
        }
        return lstFileData;



    }

    public static void main(String[] args) {

        ArrayList<String> lstFileData=new ArrayList<>();
        String fileRead="C:\\Users\\Borsh\\IdeaProjects\\Java Streams\\src\\words.txt";
        String fileWrite="C:\\Users\\Borsh\\IdeaProjects\\Java Streams\\src\\count-chars.txt";
        lstFileData=reader(fileRead);
        Character[] arr_vowels={'a', 'e', 'i', 'o', 'u' };
        Character[] arr_punct={'!',',','.','?'};

        int total_vow=0;
        int total_punct=0;
        int total=0;

        for (int i = 0; i < lstFileData.size(); i++) {
            for (int j = 0; j <lstFileData.get(i).length() ; j++) {
                Character ch=lstFileData.get(i).charAt(j);
                for (Character ch_vowels:arr_vowels) {
                    if(ch.equals(ch_vowels)){
                        total_vow++;
                    }
                }
                for (Character ch_punct:arr_punct) {
                    if(ch.equals(ch_punct)){
                        total_punct++;
                    }
                }

                if(!ch.equals(' ')){
                    total++;
                }
            }
        }



        try(FileWriter wr =new FileWriter(fileWrite)){

            wr.write(String.format("Vowels: %d\n",total_vow));
            wr.write(String.format("Consonants: %d\n",total-total_punct-total_vow));
            wr.append(String.format("Punctuation: %d\n",total_punct));

        }
        catch(IOException ioex){
            System.out.print("Драсти май има грешка като липсваш файл :)");
        }


    }
}
