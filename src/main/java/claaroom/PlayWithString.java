package claaroom;

public class PlayWithString {
    public static void main(String[] args) {
        String name = "Nika";
        String lastName = "Griscuka";

        //My name is: Nika Griscuka

        String myTaxt = "My name is:" + name + " " + lastName;
        System.out.println(myTaxt);

        System.out.print("My name is :" + name + "" + lastName);

        //Interpolation
        //%s-for tex
        //%d- for numberic values

        String interolation = String.format("My name is %s", name, lastName);
        System.out.print(interolation);

        String name2 = "Veronika";
        String lastName2 = "Griscuk";
        int age = 26;
        String citi = "Riga";

        System.out.println(name2 + " " + lastName2);
        //Veonika Griscuka is 26 years old and live in Riga

        System.out.println(name2 + " " + lastName2 + "is" + age + "years old" + citi);
        System.out.println(String.format("%s %s is %d years old and living in %s", name2, lastName2, age, citi));


    }
}
