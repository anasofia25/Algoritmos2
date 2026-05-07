package service;

import java.util.List;
import model.Humedal;
import repository.HumedalRepository;

/**
 * Servicio principal.
 */
public class HumedalService {

    private final HumedalRepository repository;

    public HumedalService() {
        repository = new HumedalRepository();
    }

    public void registrarHumedal(Humedal h) {
        repository.guardar(h);
    }

    public List<Humedal> obtenerHumedales() {
        return repository.cargar();
    }

    public void mostrarHumedales() {

        List<Humedal> lista =
                repository.cargar();

        for (Humedal h : lista) {
            System.out.println(h);
        }
    }
}