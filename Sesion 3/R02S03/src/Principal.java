

public class Principal {
    public static void main(String[] args) {

        Factura facturaConRFC = new Factura(1500.0, "Consulta Dental", "MARV980812");

        Factura facturaSinRFC = new Factura(2800.0, "Colegiatura", null);

        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());



    }
}