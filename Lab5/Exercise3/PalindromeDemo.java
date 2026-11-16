import java.util.Scanner;

public class PalindromeDemo {

    public static boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("\\s+", "");

        Stack stack = new Stack(text.length());
        Queue queue = new Queue(text.length());

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            stack.push(c);
            queue.enqueue(c);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.dequeue()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
