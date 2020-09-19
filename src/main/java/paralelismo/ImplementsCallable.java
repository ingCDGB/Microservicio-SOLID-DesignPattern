package paralelismo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

//NO CONFUNDIR CON CALLABLE STAMENT
@Slf4j
public class ImplementsCallable implements Callable<String> {

    /**
     * Este método debe retornar lo que se indique
     * entre <Objeto a retornar>
     */

    //Diferencia entre Runnable y Callable
    //Es que Callable retorna valor y el otro no
    @Override
    public String call() throws Exception {
        log.info("Ejecución del CAllable");
        return "Callable";
    }
}
