
public class CajaRegistradora {
    public static void main(String[] args) {

        MetodoPago[] pagos = {
                new PagoEfectivo(250.0),
                new PagoTarjeta(370.0, 800.0),
                new PagoTransferencia(150.0, false)
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("✅ Autenticación exitosa. ✅");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }


    }
}