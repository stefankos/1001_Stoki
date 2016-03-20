

import com.sun.xml.internal.ws.util.StringUtils;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Scanner;


public class Formatting_Numbers {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Integer a = scan.nextInt();
        Float b = scan.nextFloat();
        Float c = scan.nextFloat();

        String aHex = Integer.toHexString(a).toUpperCase();
        String bBin=Integer.toBinaryString(a);
        String bDec=String.format("%.2f",b);
        String cDec=String.format("%.3f",c);


        String result1=String.format(aHex+String.join("", Collections.nCopies(10-aHex.length(), " ")));
        String result2=String.format(String.join("", Collections.nCopies(10-bBin.length(), "0"))+bBin);
        String result3=String.format(String.join("", Collections.nCopies(10-bDec.length(), " "))+bDec);
        String result4=String.format(cDec+String.join("", Collections.nCopies(10-cDec.length(), " ")));
        System.out.print("|"+result1+"|"+result2+"|"+result3+"|"+result4+"|");


    }
}
//254	11.6	0.5	|FE        |0011111110|     11.60|0.500     |
//0	3	-0.1234	|0         |0000000000|      3.00|-0.123    |
//444	-7.5	7.5	|1BC       |0110111100|     -7.50|7.500     |