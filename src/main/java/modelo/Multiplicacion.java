package modelo;

public class Multiplicacion extends Operacion {
    public Multiplicacion() {
        super("Multiplicación");
    }

    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}
 