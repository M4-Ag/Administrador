import java.util.Scanner;

public class Doctor {
    public static void Doctor(String[] args) {
        Scanner scanD = new Scanner(System.in);
        String NombreDoc;
        String Especialidad;
        int idDoc;

        System.out.println("Nombre de Doctor:");
        NombreDoc = scanD.next();
        System.out.println("Especialidad:");
        Especialidad = scanD.next();
        System.out.println("Id de registro [solo numeros]:");
        idDoc = scanD.nextInt();
        System.out.println("\nDoctor registrado");
    }
}
