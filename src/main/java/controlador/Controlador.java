package controlador;

import modelo.*;

public class Controlador {

    public double sumar(double a, double b) {
        Operacion operacion = new Suma();
        return operacion.calcular(a, b);
    }

    public double restar(double a, double b) {
        Operacion operacion = new Resta();
        return operacion.calcular(a, b);
    }

    public double multiplicar(double a, double b) {
        Operacion operacion = new Multiplicacion();
        return operacion.calcular(a, b);
    }

    public double dividir(double a, double b) {
        Operacion operacion = new Division();
        return operacion.calcular(a, b);
    }

    public double raizCuadrada(double a) {
        Operacion operacion = new RaizCuadrada();
        return operacion.calcular(a, 0);
    }

    public double raizCubica(double a) {
        Operacion operacion = new RaizCubica();
        return operacion.calcular(a, 0);
    }

    public double logaritmoNatural(double a) {
        Operacion operacion = new LogaritmoNatural();
        return operacion.calcular(a, 0);
    }
}
 