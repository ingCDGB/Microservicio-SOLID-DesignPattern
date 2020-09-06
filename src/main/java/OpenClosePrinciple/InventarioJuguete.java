package OpenClosePrinciple;

public class InventarioJuguete extends BaseInventario{


    public InventarioJuguete(Producto producto){
        super(producto);
    }

    @Override
    public Double calcularProducto() {
        producto.setPrecio(producto.getPrecio() * 3);
        return producto.getPrecio();
    }
}
