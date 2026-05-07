import java.util.ArrayList;

public class Humedal {

    private final String nombre;
    private final Ubicacion ubicacion;

    private final ArrayList<Especimen> especimenes;

    // Constructor
    public Humedal(String nombre, Ubicacion ubicacion) {

        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.especimenes = new ArrayList<>();
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Especimen> getEspecimenes() {
        return especimenes;
    }

    // Agregar espécimen
    public void agregarEspecimen(Especimen e) {
        especimenes.add(e);
    }

    // Mostrar información
    public void mostrarHumedal() {

        System.out.println("\n========================");
        System.out.println("HUMEDAL: " + nombre);

        ubicacion.mostrarUbicacion();

        System.out.println("\n--- ESPECÍMENES ---");

        for (Especimen e : especimenes) {

            e.mostrarInformacion();
            System.out.println("-------------------");
        }
    }
}