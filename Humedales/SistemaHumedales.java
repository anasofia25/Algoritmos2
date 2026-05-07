import java.util.ArrayList;

public class SistemaHumedales {

    private final ArrayList<Humedal> humedales;

    // Constructor
    public SistemaHumedales() {
        humedales = new ArrayList<>();
    }

    // Agregar humedal
    public void agregarHumedal(Humedal h) {
        humedales.add(h);
    }

    // Mostrar todos
    public void mostrarSistema() {

        for (Humedal h : humedales) {
            h.mostrarHumedal();
        }
    }

    // Contar por humedal
    public void contarPorHumedal() {

        System.out.println("\n===== CONTEO POR HUMEDAL =====");

        for (Humedal h : humedales) {

            System.out.println(
                h.getNombre() +
                ": " +
                h.getEspecimenes().size() +
                " especímenes"
            );
        }
    }

    // Contar por especie
    public void contarPorEspecie() {

        int aves = 0;
        int mamiferos = 0;
        int arboles = 0;

        for (Humedal h : humedales) {

            for (Especimen e : h.getEspecimenes()) {

                if (e instanceof Ave) {
                    aves++;
                }

                else if (e instanceof Mamifero) {
                    mamiferos++;
                }

                else if (e instanceof Arbol) {
                    arboles++;
                }
            }
        }

        System.out.println("\n===== CONTEO POR ESPECIE =====");

        System.out.println("Aves: " + aves);
        System.out.println("Mamíferos: " + mamiferos);
        System.out.println("Árboles: " + arboles);
    }
}