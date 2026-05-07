public class Ave extends Especimen {

    private final boolean vuela;

    // Constructor
    public Ave(String nombre, String especie, int poblacion, boolean vuela) {

        super(nombre, especie, poblacion);
        this.vuela = vuela;
    }

    // Getter
    public boolean isVuela() {
        return vuela;
    }

    // Sobrescritura
    @Override
    public void mostrarInformacion() {

        System.out.println("=== AVE ===");
        super.mostrarInformacion();
        System.out.println("Vuela: " + vuela);
    }
}