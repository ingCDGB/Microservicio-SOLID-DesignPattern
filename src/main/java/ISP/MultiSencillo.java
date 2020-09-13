package ISP;

import lombok.extern.slf4j.Slf4j;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Slf4j
public class MultiSencillo implements  IMultiBasico{
    public void Imprimir(){
        log.info(String.format("%s","Imprimir"));
    }
    public void Escanear(){
        log.info(String.format("%s","Escanear"));
    }
}
