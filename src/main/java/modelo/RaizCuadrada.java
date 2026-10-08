package modelo;

public class RaizCuadrada extends Operacion {
    public RaizCuadrada() {
        super("Raíz cuadrada");
    }

    @Override
    public double calcular(double a, double b) {
        if (a < 0) {
            throw new ArithmeticException("No existe la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}
 
