import java.util.Scanner;

public class TaskStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();
        }
        int checkWord = scanner.nextByte();
        if (checkWord > array.length) {
            System.out.println("В строке всего " + array.length + " cлов");
            return;
        }
        if (array[checkWord - 1].equals((new StringBuilder(array[checkWord - 1])).reverse().toString())) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
