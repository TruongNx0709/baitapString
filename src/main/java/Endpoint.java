import java.util.Scanner;

public class Endpoint {
    public static void main(String[] args) {
        checkUpercase(inputString());
        checkNonNumeric(inputString());
    }

    public static String inputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi bất kỳ:");
        String s = input.next();
        return s;
    }

    public static void checkUpercase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                System.out.println("Đây là chữ cái viết hoa: " + s.charAt(i));
            }
        }
    }
    public static void checkNonNumeric(String s){
        for (int i = 0; i< s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                System.out.println("Đây là chữ cái : " + s.charAt(i));
            }
        }
    }
}


