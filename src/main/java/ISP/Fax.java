package ISP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fax implements IMultifuncional{
    public void Imprimir(){
        log.info(String.format("%s","NO TENGO SERVICIO Imprimir"));
    }
    public void Escanear(){
        log.info(String.format("%s","NO TENGO SERVICIO Escanear"));
    }
    public void Telefono(){
        log.info(String.format("%s","Telefono"));
    }
    public void Faxear(){
        log.info(String.format("%s","Faxear"));
    }
}
