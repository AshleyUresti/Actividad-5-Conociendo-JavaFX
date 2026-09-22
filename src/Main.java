import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        System.out.print("R E G I S T R O - E S T U D I A N T E S");

        Estudiante e1 = new Estudiante("Mimi","S2501");
        Estudiante e2 = new Estudiante("Mein", "S2502");
        Estudiante e3 = new Estudiante("Ashe", "S2503");

        System.out.print(e1);
        System.out.print(e2);
        System.out.print(e3);
    }
}