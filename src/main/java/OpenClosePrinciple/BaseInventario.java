package OpenClosePrinciple;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
public abstract class BaseInventario {

    protected Producto producto;

    @Override
    public String toString(){
        return producto.toString();
    }

    //estamos indicando que la clases hijas deben implementar este método
    public abstract Double calcularProducto();
}
