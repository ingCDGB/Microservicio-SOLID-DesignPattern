package ISP;

import lombok.extern.slf4j.Slf4j;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Slf4j
public class MultiSencillo implements  IMultifuncional{
    public void Imprimir(){
        log.info(String.format("%s","Imprimir"));
    }
    public void Escanear(){
        log.info(String.format("%s","Escanear"));
    }

    /**
     * Estamos siendo forzados a definir comportamiento
     * a estos métodos  QUE NO NECESITAMOS
     */
    public void Telefono(){
        throw new NotImplementedException();
    }
    public void Faxear(){
        throw new NotImplementedException();
    }
}
