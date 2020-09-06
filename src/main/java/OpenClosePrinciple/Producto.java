package OpenClosePrinciple;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@Builder
public class Producto {

    private String nombre;
    private int categoria;
    private double precio;

    @Override
    public String toString(){
        return String.format("El producto %s cuesta %f",nombre,precio);
    }

}
