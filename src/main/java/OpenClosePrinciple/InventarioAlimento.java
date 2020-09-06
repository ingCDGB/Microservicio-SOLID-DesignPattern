package OpenClosePrinciple;


public class InventarioAlimento extends BaseInventario{

    public InventarioAlimento(Producto producto){
        super(producto);
    }

    /**
     * Implementamos la lógica por TIPO de producto
     * para realizar el calculo del total.
     * Sin interferir en los otros tipos de productos
     * @return
     */
    @Override
    public Double calcularProducto() {
        producto.setPrecio(producto.getPrecio() * 1.2);
        return producto.getPrecio();
    }
}
