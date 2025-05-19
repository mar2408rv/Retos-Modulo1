import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;
        int opcion;

        System.out.println("Bienvenido al cajero automático");
        do {

            System.out.println("Selecciona una opción: ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");


            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {

                    System.out.println("Tu saldo actual es: $" + saldo);
                    System.out.println("");
                }
                case 2 -> {

                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor a 0.0");
                        continue;
                    }

                    saldo += deposito; // Aumentar el saldo
                    System.out.println("Depósito realizado. Saldo actualizado: $" + saldo);
                    System.out.println("");
                }
                case 3 -> {
                    // Retirar dinero
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a 0.0");
                        continue;
                    }

                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro; // Restar el monto del saldo
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                        System.out.println("");
                    }
                }
                case 4 -> {
                    System.out.println("Gracias por su preferencia ¡Hasta pronto!");
                }
                default -> {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            }

        } while (opcion != 4);

        scanner.close();




    }
}