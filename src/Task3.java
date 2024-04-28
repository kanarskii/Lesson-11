import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
            sum += array[i].length();
        }
        sum = sum / 3;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() < sum){
                System.out.println(array[i] + "; " + array[i].length());
            }else{
                System.out.println("У всех строк длинны больше средней");
            }
        }
    }
}
