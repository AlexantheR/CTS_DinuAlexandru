import classes.Administrator;
import classes.Soare;

public class Main {
    public static void main(String[] args) {
        Administrator a1 = Administrator.getInstance();
        Administrator a2 = Administrator.getInstance();

        System.out.println(a1.toString());
        System.out.println(a2.toString());

        Soare s1 = Soare.getInstance("Galben", 1000);
        Soare s2 = Soare.getInstance("Portocaliu", 1500);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}