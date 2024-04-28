import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        StringBuilder sb = new StringBuilder("");
        sb.append(line1).append(" ").append(line2).append(" ").append(line3);
        String newLine = sb.toString().replaceAll("[,.()\\-!?;:+*]", "");
        String[] array = newLine.split(" ");
        for (String word : array) {
            if(uniqueLetterWord(word)) {
                System.out.println("Слово состоящее из уникальных символов: " + word);
                return;
            }
        }
        System.out.println("Слов состоящих из разных символов нет");
    }

    private static boolean uniqueLetterWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
