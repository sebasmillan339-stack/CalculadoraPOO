package modelo;

public class Resta extends Operacion {
    public Resta() {
        super("Resta");
    }

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
 