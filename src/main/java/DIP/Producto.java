package DIP;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Producto {
    private final String nombre;
    private final int tipo; //0: alimento - 1: medicina - 2: ropa
    private final double costo;

    @Override
    public String toString(){
        String strTipo="";

        strTipo = (tipo == 0 ) ? "Alimento": (tipo == 1) ? "Medicina": "Ropa";

        return String.format("%s, tipo %s, costo %f",nombre,strTipo,costo);
    }
}
