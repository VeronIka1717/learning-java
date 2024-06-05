package claaroom;

public class PlayWhitStaitmants {
    public static void main(String[] args) {
        //If/{if-else}/if-else-if
        /*

        if(condition){
        // code to be excutd
        }
         */
        int a = 10;
        if (a > 5) {
            System.out.print("This is true");

        }

        int y = 11;
        if (y % 2 == 0) {
            System.out.print("y is number");
        }
        int b = 50;
        if (b == 50) {
            System.out.print("b is equal to 50");
        }

        if (b != y) {
            System.out.print("b is not equal to y");
        }
        boolean isSummer = true;
        if (isSummer) {
            System.out.print("It's time to go on vacation!");
        }
        int z = -10;
        if (z >= 0) {
            System.out.print("Z is positive number");
        } else {
            System.out.print("Z is negative number");
        }

        String name = "Havana";
        if (name.equals("Havana")) {
            System.out.println("Variables contains name Havana");

        } else {
            System.out.println("Variables contains name:" + name);

        }
        /*
        If(condition1){
        If condition1 is tru => this code block will be  executed
        }else{
        if no condition is not => this code block will be executed
        }
         */
        //Exercise 6:
        int e = 12;
        if (e > 10) {
            System.out.println("Variables is more than 10");

        } else if (e == 10) {
            System.out.println("Variables is equal to 10");
        } else {
            System.out.println("Variables is less to 10");
        }
        //Exerscise 7: Create array with
        int[] numbers = {10, -5, 25, -30, 15, -10, 5, -28};
        for (int number : numbers) {
            if (number > 0) {
                System.out.printf("Number: %d is positive number\n", number);
            } else if (number < 0) {
                System.out.printf("Number: %d is negative number\n", number);
            } else {
                System.out.printf("Number: %d is equal to 0\n", number);
            }
        }


        //Exerscise 8:Excellented (90-100)/ Good (75-89)/ ok(58-74)/ nok(0-49)

        //Exerscise 9: Create temperature classifier
        //Temperature < -10 (Holodno)/from 0 to 10 (Prohladno)/from 10 to 20 (teplo)/ from 20 to 30 (zharko)/>30 -ochen HOT

        int[] grades = {-10, 0, 10, 10, 20, 30, 30};
        for (int grade : grades) {
            if (grade <= -10 && grade >= 0) {
                System.out.printf("Grade: %d is Holodno\n", grade);

            } else if (grade >= 0 && grade < 10) {
                System.out.printf("Grade: %d is Prohladno \n", grade);
            } else if (grade <= 10 && grade < 20) {
                System.out.printf("Grade: %d is Teplo \n", grade);
            } else if (grade <= 20 && grade < 30) {
                System.out.printf("Grade: %d is zharko \n", grade);
            } else if (grade <= 30 && grade < 40) {
                System.out.printf("Grade: %d is ochen HOT \n", grade);
            }
        }


    }
}
