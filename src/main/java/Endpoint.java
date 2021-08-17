import java.util.Scanner;

public class Endpoint {
    public static void main(String[] args) {
        System.out.println("Bài 1:");
        System.out.println("------------------------------");
        checkUpercase(inputString());
        System.out.println("Bài 2:");
        System.out.println("------------------------------");
        checkNonNumeric(inputString());
        System.out.println("Bài 3:");
        System.out.println("------------------------------");
        int number = countChar(inputString(), inputChar());
        System.out.println("Số chữ: " + number);
        System.out.println("Bài 4:");
        System.out.println("------------------------------");
        int numberWords = countWords(inputString());
        System.out.println("Số từ: " + numberWords);
        System.out.println("Bài 5:");
        System.out.println("------------------------------");
        int[] numberTotal = countVowelandConsonant(inputString());
        System.out.println("Số từ nguyên âm: " + numberTotal[0]);
        System.out.println("Số từ phụ âm: " + numberTotal[1]);
    }

    public static String inputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi bất kỳ:");
        String s = input.nextLine();
        return s;
    }

    public static char inputChar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 1 ký tự bất kỳ:");
        char c = input.next().charAt(0);
        return c;
    }

    public static void checkUpercase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                System.out.println("Đây là chữ cái viết hoa: " + s.charAt(i));
            }
        }
    }

    public static void checkNonNumeric(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                System.out.println("Đây là chữ cái : " + s.charAt(i));
            }
        }
    }

    public static int countChar(String s, char c) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                number = number + 1;
            }
        }
        return number;
    }

    public static int countWords(String s) {
        char space = ' ';
        //char tab = '\t';
        // char enter = '\n';
        int number = 0;
        System.out.println("length " + s.length());
        // Nếu chữ đầu tiên # khoảng trắng thì count lên 1
        if (s.charAt(0) != ' ') {
            number = 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                number = number + 1;
            }
        }
        return number;
    }

    public static int[] countVowelandConsonant(String s) {
        int numberVowel = 0;
        int numberConsonant = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'u') {
                numberVowel = numberVowel + 1;
            } else {
                numberConsonant = numberConsonant + 1;
            }
        }
        return new int[]{numberVowel, numberConsonant};
    }
}


