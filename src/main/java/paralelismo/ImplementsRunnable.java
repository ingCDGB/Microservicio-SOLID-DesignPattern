package paralelismo;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class ImplementsRunnable implements Runnable{

    @Override
    public void run(){
        for(int i=0; i<= 100; i++){
//            log.info("Estamos en el Runnable");
        }
        log.info("Termina la ejecución de Runnable");
    }
}
