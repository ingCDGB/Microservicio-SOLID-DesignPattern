package LSP;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuperBuilder
public class Noticiero extends Principal{

    public Noticiero(String mensaje){ super(mensaje); }

    @Override
    public void muestra(){
        log.info(String.format("Desde el noticiero - %s",this.getMensaje()));
    }
}
