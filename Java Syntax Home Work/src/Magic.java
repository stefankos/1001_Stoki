import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Magic {
    private static Boolean magicWord(String str1, String str2){

        String[] arrStr1=str1.split("");
        String[] arrStr2=str2.split("");
        String[] uniqueArr1 = new HashSet<>(Arrays.asList(arrStr1)).toArray(new String[0]);
        String[] uniqueArr2 = new HashSet<>(Arrays.asList(arrStr2)).toArray(new String[0]);

        if(uniqueArr1.length!=uniqueArr2.length){
            return false;
        }
        else {


            for (int i = 0; i < arrStr1.length; i++) {
                for (int j = i + 1; j < arrStr1.length; j++) {
                    if (arrStr1[i].equals(arrStr1[j])) {
                        arrStr1[j] = "|";
                        arrStr1[i] = "|";
                        i++;
                    }
                }
            }

            for (int i = 0; i < arrStr1.length; i++) {
                for (int j = i + 1; j < arrStr1.length; j++) {
                    if (arrStr2[i].equals(arrStr2[j])) {
                        arrStr2[j] = "|";
                        arrStr2[i] = "|";
                        i++;
                    }
                }
            }
            uniqueArr1 = new HashSet<>(Arrays.asList(arrStr1)).toArray(new String[0]);
            uniqueArr2 = new HashSet<>(Arrays.asList(arrStr2)).toArray(new String[0]);
            return uniqueArr1.length == uniqueArr2.length;


        }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String str1=scan.next();
        String str2=scan.next();
        System.out.print(magicWord(str1,str2));
        //System.out.print(magicWord("aaaffaa","aaffaaa"));
    }
}

