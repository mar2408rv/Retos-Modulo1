import java.util.*;

public class RegistrosMuestras {
    public static void main(String[] args) {

        ArrayList<String> especies = new ArrayList<>();

        especies.add("Homo sapiens");
        especies.add("Mus musculus");
        especies.add("Arabidopsis thaliana");
        especies.add("Homo sapiens");

        System.out.println("------------------------");
        System.out.println("Especies recibidas:");
        for (int i = 0; i < especies.size(); i++) {
            System.out.println((i + 1) + ". " + especies.get(i));
        }

        HashSet<String> especiesUnicas = new HashSet<>(especies);

        System.out.println("------------------------");
        System.out.println("Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        HashMap<String, String> Investigador = new HashMap<>();

        // TODO: Agrega aquí las asociaciones ID → Investigador
        Investigador.put("M-001", "Dra. López");
        Investigador.put("M-002", "Dr. Hernández");
        Investigador.put("M-003", "Dra. Rosas");


        System.out.println("------------------------");
        System.out.println("Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : Investigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        String idBuscar = "M-003";
        System.out.println("------------------------");
        System.out.println("Investigador responsable de la muestra " + idBuscar + ": " + Investigador.get(idBuscar));




    }
}