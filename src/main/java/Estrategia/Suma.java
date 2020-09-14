package Estrategia;

public class Suma implements IOperacion{
    @Override
    public double operacion(double num1, double num2) {
        return num1 + num2;
    }
}
