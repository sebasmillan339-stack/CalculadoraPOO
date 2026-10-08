package modelo;

public class LogaritmoNatural extends Operacion {
    public LogaritmoNatural() {
        super("Logaritmo natural");
    }

    @Override
    public double calcular(double a, double b) {
        if (a <= 0) {
            throw new ArithmeticException("El logaritmo natural necesita un número mayor que 0");
        }
        return Math.log(a);
    }
}
