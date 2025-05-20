//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Factura factura1 = new Factura("FAC987", "Marlene Rosas", 10000.00);
        Factura factura2 = new Factura("FAC987", "Comercial La Poblana", 2300.50);

        System.out.println(factura1);
        System.out.println(factura2);

        System.out.println("¿Las facturas son iguales?: " + factura1.equals(factura2));


    }
}