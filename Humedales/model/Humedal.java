package model;

import java.util.Objects;

/**
 * Modelo que representa un humedal urbano.
 * Aplica encapsulamiento y validaciones.
 */
public final class Humedal {

    private String nombre;
    private int aves;
    private int flora;
    private int fauna;
    private String barrio;
    private String estadoConservacion;
    private double area;
    private double temperatura;
    private boolean turismo;
    private double caudalEntrada;
    private double caudalSalida;

    /**
     * Constructor vacío.
     */
    public Humedal() {
    }

    /**
     * Constructor parametrizado.
     */
    public Humedal(
            String nombre,
            int aves,
            int flora,
            int fauna,
            String barrio,
            String estadoConservacion,
            double area,
            double temperatura,
            boolean turismo,
            double caudalEntrada,
            double caudalSalida) {

        setNombre(nombre);
        setAves(aves);
        setFlora(flora);
        setFauna(fauna);
        setBarrio(barrio);
        setEstadoConservacion(estadoConservacion);
        setArea(area);
        setTemperatura(temperatura);
        setTurismo(turismo);
        setCaudalEntrada(caudalEntrada);
        setCaudalSalida(caudalSalida);
    }

    /**
     * Constructor copia.
     */
    public Humedal(Humedal otro) {

        this.nombre = otro.nombre;
        this.aves = otro.aves;
        this.flora = otro.flora;
        this.fauna = otro.fauna;
        this.barrio = otro.barrio;
        this.estadoConservacion = otro.estadoConservacion;
        this.area = otro.area;
        this.temperatura = otro.temperatura;
        this.turismo = otro.turismo;
        this.caudalEntrada = otro.caudalEntrada;
        this.caudalSalida = otro.caudalSalida;
    }

    // =========================
    // VALIDACIONES
    // =========================

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío");
        }

        this.nombre = nombre;
    }

    public void setAves(int aves) {

        if (aves < 0) {
            throw new IllegalArgumentException(
                    "La cantidad de aves no puede ser negativa");
        }

        this.aves = aves;
    }

    public void setFlora(int flora) {

        if (flora < 0) {
            throw new IllegalArgumentException(
                    "La flora no puede ser negativa");
        }

        this.flora = flora;
    }

    public void setFauna(int fauna) {

        if (fauna < 0) {
            throw new IllegalArgumentException(
                    "La fauna no puede ser negativa");
        }

        this.fauna = fauna;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public void setArea(double area) {

        if (area <= 0) {
            throw new IllegalArgumentException(
                    "El área debe ser positiva");
        }

        this.area = area;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setTurismo(boolean turismo) {
        this.turismo = turismo;
    }

    public void setCaudalEntrada(double caudalEntrada) {
        this.caudalEntrada = caudalEntrada;
    }

    public void setCaudalSalida(double caudalSalida) {
        this.caudalSalida = caudalSalida;
    }

    // =========================
    // GETTERS
    // =========================

    public String getNombre() {
        return nombre;
    }

    public int getAves() {
        return aves;
    }

    public int getFlora() {
        return flora;
    }

    public int getFauna() {
        return fauna;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public double getArea() {
        return area;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public boolean isTurismo() {
        return turismo;
    }

    public double getCaudalEntrada() {
        return caudalEntrada;
    }

    public double getCaudalSalida() {
        return caudalSalida;
    }

    // =========================
    // MÉTODOS SOBRESCRITOS
    // =========================

    @Override
    public String toString() {

        return nombre + "," +
                aves + "," +
                flora + "," +
                fauna + "," +
                barrio + "," +
                estadoConservacion + "," +
                area + "," +
                temperatura + "," +
                turismo + "," +
                caudalEntrada + "," +
                caudalSalida;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Humedal)) return false;

        Humedal otro = (Humedal) obj;

        return Objects.equals(nombre, otro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}