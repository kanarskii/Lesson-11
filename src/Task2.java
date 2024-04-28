import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        if(line1.length() > line2.length() && line1.length() > line3.length() && line2.length() > line3.length()){
            System.out.println(line3 + " ; " + line2 + " ; " + line1);
        }else if(line1.length() > line2.length() && line1.length() > line3.length() && line3.length() > line2.length()) {
            System.out.println(line2 + " ; " + line3 + " ; " + line1);
        }else if(line2.length() > line1.length() && line2.length() > line3.length() && line1.length() > line3.length()) {
            System.out.println(line3 + " ; " + line1 + " ; " + line2);
        }else if(line2.length() > line1.length() && line2.length() > line3.length() && line3.length() > line1.length()) {
            System.out.println(line1 + " ; " + line3 + " ; " + line2);
        }else if(line3.length() > line1.length() && line3.length() > line2.length() && line1.length() > line2.length()) {
            System.out.println(line2 + " ; " + line1 + " ; " + line3);
        }else if(line3.length() > line1.length() && line3.length() > line2.length() && line2.length() > line1.length()) {
            System.out.println(line1 + " ; " + line2 + " ; " + line3);
        }else if(line1.length() == line2.length() && line1.length() > line3.length()){
            System.out.println(line3 + " ; " + line1 + " ; " + line2);
        }else if(line1.length() == line2.length() && line3.length() > line1.length()){
            System.out.println(line1 + " ; " + line2 + " ; " + line3);
        }else if(line1.length() == line3.length() && line1.length() > line2.length()){
            System.out.println(line2 + " ; " + line1 + " ; " + line3);
        }else if(line1.length() == line3.length() && line2.length() > line1.length()){
            System.out.println(line1 + " ; " + line3 + " ; " + line2);
        }else if(line2.length() == line3.length() && line2.length() > line1.length()){
            System.out.println(line1 + " ; " + line2 + " ; " + line3);
        }else if(line2.length() == line3.length() && line1.length() > line2.length()){
            System.out.println(line2 + " ; " + line3 + " ; " + line1);
        }else if(line1.length() == line2.length() && line1.length() == line3.length() && line2.length() == line3.length()){
            System.out.println(line1 + " ; " + line2 + " ; " + line3);
        }
    }
}
