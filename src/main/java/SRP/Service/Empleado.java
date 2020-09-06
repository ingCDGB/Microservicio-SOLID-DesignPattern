package SRP.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class Empleado {


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
     * Los métodos de caluclarImpuesto y pagarImpuesto
     * NO SON RESPONSABILIDAD del empleado si no de hacienda,
     * con base a esto se mueven los métodos a dicha clae.
     */
}
