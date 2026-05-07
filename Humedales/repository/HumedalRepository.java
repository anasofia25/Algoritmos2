package repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import model.Humedal;

/**
 * Repositorio encargado de la persistencia
 * en archivos CSV.
 */
public class HumedalRepository {

    private static final String ARCHIVO =
            "humedales.csv";

    /**
     * Guarda un humedal en CSV.
     */
    public void guardar(Humedal humedal) {

        File archivo = new File(ARCHIVO);

        boolean existe = archivo.exists();

        try (BufferedWriter bw =
                     new BufferedWriter(
                             new FileWriter(archivo, true))) {

            // Crear encabezado
            if (!existe) {

                bw.write(
                    "nombre,aves,flora,fauna,barrio," +
                    "estadoConservacion,area,temperatura," +
                    "turismo,caudalEntrada,caudalSalida"
                );

                bw.newLine();
            }

            // Guardar datos
            bw.write(convertirACSV(humedal));
            bw.newLine();

        } catch (IOException e) {

            System.out.println(
                    "Error guardando humedal: "
                            + e.getMessage());
        }
    }

    /**
     * Carga humedales desde CSV.
     */
    public List<Humedal> cargar() {

        List<Humedal> humedales =
                new ArrayList<>();

        File archivo = new File(ARCHIVO);

        if (!archivo.exists()) {
            return humedales;
        }

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(archivo))) {

            String linea;

            // Saltar encabezado
            br.readLine();

            while ((linea = br.readLine()) != null) {

                Humedal humedal =
                        convertirDesdeCSV(linea);

                humedales.add(humedal);
            }

        } catch (IOException e) {

            System.out.println(
                    "Error leyendo CSV: "
                            + e.getMessage());
        }

        return humedales;
    }

    /**
     * Convierte objeto a línea CSV.
     */
    private String convertirACSV(Humedal h) {

        return h.getNombre() + "," +
                h.getAves() + "," +
                h.getFlora() + "," +
                h.getFauna() + "," +
                h.getBarrio() + "," +
                h.getEstadoConservacion() + "," +
                h.getArea() + "," +
                h.getTemperatura() + "," +
                h.isTurismo() + "," +
                h.getCaudalEntrada() + "," +
                h.getCaudalSalida();
    }

    /**
     * Convierte línea CSV a objeto Humedal.
     */
    private Humedal convertirDesdeCSV(String linea) {

        String[] datos = linea.split(",");

        return new Humedal(
                datos[0],
                Integer.parseInt(datos[1]),
                Integer.parseInt(datos[2]),
                Integer.parseInt(datos[3]),
                datos[4],
                datos[5],
                Double.parseDouble(datos[6]),
                Double.parseDouble(datos[7]),
                Boolean.parseBoolean(datos[8]),
                Double.parseDouble(datos[9]),
                Double.parseDouble(datos[10])
        );
    }
}