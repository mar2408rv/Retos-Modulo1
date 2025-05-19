import java.util.Scanner;

public class Compra {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca los siguientes datos: ");
        System.out.print("Medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        double totalNeto = cantidad * precio;

        var descuento = totalNeto > 500;
        double aplicarDescuento = descuento ? totalNeto * 0.15 : 0;

        double totalconDescuento = totalNeto - aplicarDescuento;

        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precio);
        System.out.println("¿Aplica descuento?: " + descuento);
        System.out.println("Descuento: $" + aplicarDescuento);
        System.out.println("Total a pagar: $" + totalconDescuento);












    }
}
