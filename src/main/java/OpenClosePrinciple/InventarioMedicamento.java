package OpenClosePrinciple;


public class InventarioMedicamento extends BaseInventario{

    public InventarioMedicamento(Producto producto){

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

        producto.setPrecio(producto.getPrecio() * 0.8);
        return producto.getPrecio();
    }
}
