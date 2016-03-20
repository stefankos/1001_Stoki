    import java.util.Arrays;
    import java.util.Scanner;
    public class Test {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); String firstWord = scan.nextLine();
            String secondWord = scan.nextLine();int[] firstArray = makeArray(firstWord);
            int[] secondArray = makeArray(secondWord);if (Arrays.equals(firstArray, secondArray)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        private static int[] makeArray(String firstWord) {
            char[] myCharArray = firstWord.toCharArray();
            int[] numberArray = new int[myCharArray.length];
            int counter = 0;
            for (int i = 0; i < myCharArray.length; i++) {
                char currentChar = myCharArray[i];
                myCharArray[i] = '^';
                int firstIndex = new String(myCharArray).indexOf(currentChar);
                if ((firstIndex == -1) || (firstIndex > i)) {
                    counter++;
                    numberArray[i] = counter;
                } else {
                    numberArray[i] = numberArray[firstIndex];
                }
                myCharArray[i] = currentChar;
            }return numberArray;
        }
    }

