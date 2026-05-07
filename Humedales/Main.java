import java.util.List;
import model.Humedal;
import service.HumedalService;

public class Main {

    public static void main(String[] args) {

        // Crear servicio
        HumedalService service =
                new HumedalService();

        // Crear humedales
        Humedal humedal1 = new Humedal(
                "La Babilla",
                34,
                100,
                54,
                "Ciudad Jardin",
                "En conservacion",
                12.2,
                24.5,
                true,
                120.5,
                110.2
        );

        Humedal humedal2 = new Humedal(
                "Cañasgordas",
                127,
                63,
                90,
                "Pance",
                "Recuperado",
                9.5,
                23.0,
                true,
                150.0,
                142.5
        );

        // Guardar humedales
        service.registrarHumedal(humedal1);
        service.registrarHumedal(humedal2);

        // Leer humedales desde CSV
        List<Humedal> lista =
                service.obtenerHumedales();

        // Mostrar resultados
        System.out.println(
                "\n===== HUMEDALES REGISTRADOS =====");

        for (Humedal h : lista) {

            System.out.println("------------------------");
            System.out.println("Nombre: " + h.getNombre());
            System.out.println("Aves: " + h.getAves());
            System.out.println("Flora: " + h.getFlora());
            System.out.println("Fauna: " + h.getFauna());
            System.out.println("Barrio: " + h.getBarrio());
            System.out.println(
                    "Estado: "
                            + h.getEstadoConservacion());
            System.out.println("Área: " + h.getArea());
            System.out.println(
                    "Temperatura: "
                            + h.getTemperatura());

            System.out.println(
                    "Turismo: "
                            + h.isTurismo());

            System.out.println(
                    "Caudal Entrada: "
                            + h.getCaudalEntrada());

            System.out.println(
                    "Caudal Salida: "
                            + h.getCaudalSalida());
        }
    }
}