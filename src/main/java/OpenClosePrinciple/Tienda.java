package OpenClosePrinciple;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@Getter
@Setter
public class Tienda {
    /**
     * Nuestra lista de producto ahora será
     * de la clase padre (clase abstracta)
     */
    private List<BaseInventario> listaProductos;

    public Tienda(List<BaseInventario> listaProductos){
        this.listaProductos = listaProductos;
    }

    public void calcularInventario(){

        AtomicReference<Double> total = new AtomicReference<>((double) 0);

        listaProductos.forEach(producto ->{
            producto.calcularProducto();
            log.info(producto.toString());
            total.updateAndGet(v -> v + producto.producto.getPrecio());
        });
    }
}
