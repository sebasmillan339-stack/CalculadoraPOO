package modelo;

public abstract class Operacion {
    private String nombre;

    public Operacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcular(double a, double b);
}
