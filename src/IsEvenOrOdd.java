import java.util.Scanner;

public class IsEvenOrOdd {

    public static boolean isEven(int n) {// boolean here returns true or false value.
        return n%2==0; // int n will use the first integer declared in main class.
        // here int n = userNum.
        // % is modulo (finds remainder), here %2 finds remainder when input is
        // divided by 2. if == 0, number is even.
        // if result ==0, returns true. if result =>1, returns false
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();
        System.out.println("Is the number even? " + isEven(userNum));
    }
}
