package OpenClosePrinciple;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@Getter
@Setter
@Builder
public class Tienda {

    private List<Producto> productos;

    public void calcularInventario(){
        AtomicReference<Double> total = new AtomicReference<>((double) 0);

        /**
         * HDU #1
         * Esto es con base al 1er requerimiento
         */
        /*productos.forEach(producto -> {
            log.info(producto.toString());
            total.updateAndGet(v -> v + producto.getPrecio());
        });*/

        /**
         * HDU #2
         * Ahora hay descuentos según el tipo de producto
         * y aumento en otro tipo de producto
         */
        productos.forEach(producto -> {
            if(producto.getCategoria() == 1){
                producto.setPrecio(producto.getPrecio() * 0.8);
                log.info(producto.toString());
                total.updateAndGet(v -> v + producto.getPrecio());
            }else
                if(producto.getCategoria() == 2){
                    producto.setPrecio(producto.getPrecio() * 1.2);
                    log.info(producto.toString());
                    total.updateAndGet(v -> v + producto.getPrecio());
                }
        });

        log.info(String.format("El total en el inventario es de %f",total.get()));
    }


}
