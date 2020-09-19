package paralelismo;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class ExtendsThread extends Thread{

    @Override
    public void run(){
        for(int i=0; i<= 10; i++){
            log.info("Estamos en el Thread: "+this.getName());

            try{
                ExtendsThread.sleep(1000);
            }catch(InterruptedException e){
                log.error("ERROR",e);
            }
        }
    }

}
