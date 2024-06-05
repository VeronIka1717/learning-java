package claaroom;

public class PlayWithMetod {
    public static void main(String[] args) {
        greeting("Veronika");
        var x = add(10, 20);
        System.out.println(x);

        System.out.println(add(30, 40));

        //
        System.out.println(isEven(10));
        System.out.println(isEven(10));
        System.out.println(isEven(10));
        System.out.println(isEven(10));
        //
        int numberTwo;
        System.out.println(findMax(20, 40));
        System.out.println(findMax(50, 60));
        System.out.println(findMax(0, 1));
        //
        

    }

    public static void greeting(String name) {
        System.out.println("Hello," + name + "!");

    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int findMax(int numberOne, int numberTwo) {
        return Math.max(numberOne, numberTwo);
    }

    //
    public static boolean isPalindrome(String word) {
        String reversedWord = "";
        for (int i = word.length() i > 0; i--) {
            reversedWord = reversedWord + word.charAt(i);

        }
        return word.equals(reversedWord);
    }
}
