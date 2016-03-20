import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Triangle_Area {

    public static ArrayList<Integer> consoleInput(String input){
        String pattern="\\d+";
        ArrayList<Integer> lst = new ArrayList<Integer>();
        Pattern pat=Pattern.compile(pattern);
        Matcher m=pat.matcher(input);
        while (m.find()){
            Integer num=Integer.parseInt(m.group());
            lst.add(num);
        }
        return lst;
    }
    public static void main(String[] args) {
        Float area;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <6 ; i++) {
          lst.add(scan.nextInt()) ;
        }
        Integer Ax=lst.get(0);
        Integer Ay=lst.get(1);
        Integer Bx=lst.get(2);
        Integer By=lst.get(3);
        Integer Cx=lst.get(4);
        Integer Cy=lst.get(5);

        area	=Math.abs(  (float)	(Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))/2);
        //String areaStr=String.format("%f",area);
        System.out.print(area.intValue());
    }
}
//-5 10  25 30  60 15
