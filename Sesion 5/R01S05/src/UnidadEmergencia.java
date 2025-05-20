

public abstract class UnidadEmergencia {

    String nombre;

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void activarUnidad() {
        System.out.println("Unidad Activada " + nombre);
    }

    public abstract void responder();


}
