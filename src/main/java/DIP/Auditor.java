package DIP;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicReference;

@Slf4j
public class Auditor {

    /**
     * Ahora miAlmacen puede ser cualquier tipo de objeto
     * siempre y cuando implemente a la interfaz IAuditale
     */
    private  IAuditable miAlmacen;

    /**
     * Ahora Auditor puede trabajar con cualquier cosa
     * Bodega, Almacen, Contenedor: implementado IAuditable
     * @param almacen
     */
    public Auditor(IAuditable almacen){
        this.miAlmacen = almacen;
    }
    public double totalProductosDeUnTipo(int tipo){
        AtomicReference<Double> total = new AtomicReference<>((double) 0);

        miAlmacen.obtenerProductos(tipo).forEach(producto -> {
                log.info(String.format("%s",producto));
                total.getAndUpdate( v -> v + producto.getCosto());
        });

        return total.get();
    }
}
