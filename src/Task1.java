import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        if(line1.length() > line2.length() && line1.length() > line3.length() && line2.length() > line3.length()){
            System.out.println("Cамая длинная строка: " + line1 + "; ее длина " + line1.length());
            System.out.println("Cамая короткая строка: " + line3 + "; ее длина " + line3.length());
        }else if(line1.length() > line2.length() && line1.length() > line3.length() && line3.length() > line2.length()){
            System.out.println("Cамая длинная строка: " + line1 + "; ее длина " + line1.length());
            System.out.println("Cамая короткая строка: " + line2 + "; ее длина " + line2.length());
        }else if(line2.length() > line1.length() && line2.length() > line3.length() && line1.length() > line3.length()) {
            System.out.println("Cамая длинная строка: " + line2 + "; ее длина " + line2.length());
            System.out.println("Cамая короткая строка: " + line3 + "; ее длина " + line3.length());
        }else if(line2.length() > line1.length() && line2.length() > line3.length() && line3.length() > line1.length()) {
            System.out.println("Cамая длинная строка: " + line2 + "; ее длина " + line2.length());
            System.out.println("Cамая короткая строка: " + line1 + "; ее длина " + line1.length());
        }else if(line3.length() > line1.length() && line3.length() > line2.length() && line1.length() > line2.length()) {
            System.out.println("Cамая длинная строка: " + line3 + "; ее длина " + line3.length());
            System.out.println("Cамая короткая строка: " + line2 + "; ее длина " + line2.length());
        }else if(line3.length() > line1.length() && line3.length() > line2.length() && line2.length() > line1.length()) {
            System.out.println("Cамая длинная строка: " + line3 + "; ее длина " + line3.length());
            System.out.println("Cамая короткая строка: " + line1 + "; ее длина " + line1.length());
        }else if(line1.length() == line2.length() && line1.length() > line3.length()){
            System.out.println("Две строки равны: " + line1 + ", " + line2 + ", длина строк " + line1.length());
            System.out.println("Cамая короткая строка: " + line3 + "; ее длина " + line3.length());
        }else if(line1.length() == line2.length() && line3.length() > line1.length()){
            System.out.println("Cамая длинная строка: " + line3 + "; ее длина " + line3.length());
            System.out.println("Две строки равны: " + line1 + ", " + line2 + ", длина строк " + line1.length());
        }else if(line1.length() == line3.length() && line1.length() > line2.length()){
            System.out.println("Две строки равны: " + line1 + ", " + line3 + ", длина строк " + line1.length());
            System.out.println("Cамая короткая строка: " + line2 + "; ее длина " + line2.length());
        }else if(line1.length() == line3.length() && line2.length() > line1.length()){
            System.out.println("Cамая длинная строка: " + line2 + "; ее длина " + line2.length());
            System.out.println("Две строки равны: " + line1 + ", " + line3 + ", длина строк " + line1.length());
        }else if(line2.length() == line3.length() && line2.length() > line1.length()){
            System.out.println("Две строки равны: " + line2 + ", " + line3 + ", длина строк " + line2.length());
            System.out.println("Cамая короткая строка: " + line1 + "; ее длина " + line1.length());
        }else if(line2.length() == line3.length() && line1.length() > line2.length()){
            System.out.println("Cамая длинная строка: " + line1 + "; ее длина " + line1.length());
            System.out.println("Две строки равны: " + line2 + ", " + line3 + ", длина строк " + line2.length());
        }else if(line1.length() == line2.length() && line1.length() == line3.length() && line2.length() == line3.length()){
            System.out.println("Длины трех строк равны: " + line1 + ", " + line2 + ", " + line3 +", длина строк равнв " +line1.length());
        }
    }
}
