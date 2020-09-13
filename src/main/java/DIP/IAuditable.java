package DIP;

import java.util.Collection;

public interface IAuditable {
    Collection<Producto> obtenerProductos(int tipo);
}
