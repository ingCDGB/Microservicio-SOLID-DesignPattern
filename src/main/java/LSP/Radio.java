package LSP;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Radio extends Noticiero {

    public  Radio(String mensaje){
        super(mensaje);
    }

    /**
     * Esta clase tiene su forma propia de
     * aplicar el método muestra()
     */
    public void muestra(){
        log.info(String.format("Desde el radio - %s",mensaje));
    }
}
