package DIP;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Slf4j
public class Almacen implements IAuditable{

    /**
     * Con el principio DIP
     * mejoramos el Encapsulamiento
     * dado que ahora no hace falta
     * poder obtenerlo de afuera de la clase
     *
     */
    private List<Producto> inventario;

    public Almacen(){
        inventario = new ArrayList<>();
    }

    public void adicionaProducto(Producto producto){
        inventario.add(producto);
        log.info(String.format("Adicionamos %s",producto.getNombre()));
    }

    /**
     *
     * Ahora almacen le dara una lista que le interesa al Auditor
     * en vez de que Auditor TRABAJE con la lista de almacen
     *
     * esto significa -> DESACOPLAMIENTO
     *
     * almacen le da lo que necesita al auditor.
     *
     * @param tipo
     * @return
     */
    public Collection obtenerProductos(int tipo){
        List<Producto> encontrados = new ArrayList<>();

        inventario.forEach(producto -> {
            if (producto.getTipo() == tipo)
                encontrados.add(producto);
        });

        return encontrados;
    }
}
