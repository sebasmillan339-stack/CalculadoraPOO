package modelo;

public class Suma extends Operacion {
    public Suma() {
        super("Suma");
    }

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
 