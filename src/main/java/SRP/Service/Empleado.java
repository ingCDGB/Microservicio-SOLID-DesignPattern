package SRP.Service;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConstructorBinding;

@Slf4j
@Getter
@Setter
public class Empleado {

    private static final org.slf4j.Logger log =
            org.slf4j.LoggerFactory.getLogger(Empleado.class);

    private String nombre;
    private String puesto;
    private int edad;
    private Double sueldo;

    public Empleado (String nombre, String puesto, int edad, Double sueldo){
        this.nombre = nombre;
        this.puesto = puesto;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    @Override
    public String toString(){
        return String.format("%s, %s, %d, %f", nombre,puesto,edad,sueldo);
    }

    /**
     * No es responsabilidad del empleado
     * @return
     */
    public Double calcularImpuesto(){
        return sueldo * 0.35;
    }

    /**
     * No es responsabilidad del empleado
     */
    public void pagarImpuesto(){
        Double impuesto = calcularImpuesto();
        log.info(String.format("Se pago %f en impuestos por parte de %s",impuesto,nombre));

    }
}
