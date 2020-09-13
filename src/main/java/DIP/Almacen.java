package DIP;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Slf4j
public class Almacen {

    private List<Producto> inventario;

    /**
     * Nos vemos forzados a crear la propiedad para que se pueda contar
     * el inventario.
     * Al ser una propiedad de tipo List forzamos a Auditor a trabajar con list
     *
     *
     * Si posteriormente hay cambio en almacen, ejemplo en el nombre del atributo
     * esto implica un cambio en AUDITOR porque estan FUERTEMENTE ACOPLADOS
     *
     * Si por alguna razon se cambia el objeto y no funciona el forEach
     * entonces se rompe el codigo de calcular el total en AUDITOR
     */
    public Almacen(){
        inventario = new ArrayList<>();
    }

    public void adicionaProducto(Producto producto){
        inventario.add(producto);
        log.info(String.format("Adicionamos %s",producto.getNombre()));
    }
}
