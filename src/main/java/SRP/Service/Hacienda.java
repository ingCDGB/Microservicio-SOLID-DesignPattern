package SRP.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hacienda {

    /**
     * Esta clase nace debido a que es la responsable
     * de hacer el calculo y el pago de impuesto
     * y no Empleado como estaba anteriormente.
     */

    public static Double calcularImpuesto(Empleado empleado){
        return empleado.getSueldo() * 0.35;
    }

    public static void pagarImpuesto(Empleado empleado){
        Double impuesto = calcularImpuesto(empleado);
        log.info(String.format("Se pago %f en impuestos por parte de %s",impuesto,empleado.getNombre()));

    }
}
