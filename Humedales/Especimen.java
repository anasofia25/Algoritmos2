public class Especimen {

    protected String nombre;
    protected String especie;
    protected int poblacion;

    // Constructor
    public Especimen(String nombre, String especie, int poblacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.poblacion = poblacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getPoblacion() {
        return poblacion;
    }

    // Método polimórfico
    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Población: " + poblacion);
    }
}