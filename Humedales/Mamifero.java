public class Mamifero extends Especimen {

    private final String tipoAlimentacion;

    // Constructor
    public Mamifero(
        String nombre,
        String especie,
        int poblacion,
        String tipoAlimentacion
    ) {

        super(nombre, especie, poblacion);
        this.tipoAlimentacion = tipoAlimentacion;
    }

    // Getter
    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    // Sobrescritura
    @Override
    public void mostrarInformacion() {

        System.out.println("=== MAMÍFERO ===");
        super.mostrarInformacion();
        System.out.println("Alimentación: " + tipoAlimentacion);
    }
}