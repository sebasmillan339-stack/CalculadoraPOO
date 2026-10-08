package modelo;

public class RaizCubica extends Operacion {
    public RaizCubica() {
        super("Raíz cúbica");
    }

    @Override
    public double calcular(double a, double b) {
        return Math.cbrt(a);
    }
}
 
