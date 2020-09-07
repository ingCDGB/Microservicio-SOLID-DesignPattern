package LSP;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
public class Noticiero{
    /**
     * Esta será la clase padre
     */
    protected String mensaje;

    public void muestra(){
        log.info(String.format("Desde el noticiero - %s",mensaje));
    }
}
