package claaroom;

import java.util.Arrays;

public class PlayWithArrays {
    public static void main(String[] args) {
        //Arrays

        //Declaring Array
        //Emply array with integer date type
        int[] numbers;

        //Creating an Array
        numbers = new int[10];
        //int[] numbers= new int[10];
        System.out.println(Arrays.toString(numbers));

        //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        numbers[1] = 2;
        numbers[3] = 4;
        numbers[5] = 6;
        numbers[7] = 8;
        numbers[9] = 10;
        System.out.println(Arrays.toString(numbers));

        int[] eventNumbers = {2, 4, 6, 8, 10, 12};

        String[] names = {"Jon", "Nika", "Hes" };
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String[] fruit = {"Banana", "Apple", "Citrus" };
        System.out.println(fruit[0]);
        System.out.println(fruit[1]);
        System.out.println(fruit[2]);

    }
}
