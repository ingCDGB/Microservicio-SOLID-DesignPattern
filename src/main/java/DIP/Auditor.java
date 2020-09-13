package DIP;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicReference;

@Slf4j
public class Auditor {

    private  Almacen miAlmacen;

    /**
     * Con este constructor estamos creando
     * una fuerte dependencia de una clase
     * de alto nivel con una de bajo nivel
     *
     * Auditor SOLO PUEDE TRABAJAR con objeto tipo Almacen
     *
     * Si tenemos otro tipo de dato entonces nos implica un
     * cambio en Auditor.
     *
     * Es un problema por el acoplamiento
     *
     * Esto implica que UNICAMENTE puede realizar el
     * calculo del total DEPENDIENDO a inventario
     *
     * @param almacen
     */
    public Auditor(Almacen almacen){
        this.miAlmacen = almacen;
    }
    public double totalesAlimentos(){
        AtomicReference<Double> total = new AtomicReference<>((double) 0);

        /**
         * Otro problema... Auditor necesita conocer el inventario
         * de almacen para poder hacer el calculo del total
         */
        miAlmacen.getInventario().forEach(producto -> {
            if(producto.getTipo() == 0){
                log.info(String.format("%s",producto));
//                total.set(total.get() + producto.getCosto());
                total.getAndUpdate( v -> v + producto.getCosto());
            }
        });

        return total.get();
    }
}
