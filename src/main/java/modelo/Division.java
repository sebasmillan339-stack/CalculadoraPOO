package modelo;

public class Division extends Operacion {
    public Division() {
        super("División");
    }

    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }
}
