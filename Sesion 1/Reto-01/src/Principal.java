import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        System.out.println("Escriba los datos del paciente");
        Paciente paciente1 = new Paciente();

        System.out.print("Nombre: ");
        paciente1.nombre = datos.nextLine();

        System.out.print("Edad: ");
        paciente1.edad = datos.nextInt();
        datos.nextLine(); //limpiar el bufer después de cualquier entrada y datos de salida
        //hay varias formas de documentar esto

        System.out.print("No. Expediente: ");
        paciente1.expediente = datos.nextLine();
        datos.close(); // cerrar el scanner

        System.out.println("--------------- Resumen ------------");


        paciente1.mostrarInformacion();

    }
}