package Estrategia;

public interface IOperacion {
    /**
     * Con esta interfaz establecemos el protocolo
     * de comunicación del cliente con el algoritmo
     *
     * Cliente: quiero hacer una operación
     */

    double operacion(double num1, double num2);
}
