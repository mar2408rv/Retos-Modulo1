public class Main {
    public static void main(String[] args) {

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("MARV981224", 8500.0);

        CuentaFiscal cuenta = new CuentaFiscal("MARV981224", 9500.60);

        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);


    }
}