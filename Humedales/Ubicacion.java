public class Ubicacion {

    private String ciudad;
    private String barrio;

    // Constructor
    public Ubicacion(String ciudad, String barrio) {
        this.ciudad = ciudad;
        this.barrio = barrio;
    }

    // Getters y Setters
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    // Mostrar ubicación
    public void mostrarUbicacion() {
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Barrio: " + barrio);
    }
}