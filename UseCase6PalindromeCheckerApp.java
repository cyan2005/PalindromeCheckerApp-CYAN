import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("UC6: Queue + Stack Palindrome Checker");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}