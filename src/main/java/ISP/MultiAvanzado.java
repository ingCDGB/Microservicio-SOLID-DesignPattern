package ISP;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultiAvanzado implements IMultifuncional{

    public void Imprimir(){
        log.info(String.format("%s","Imprimir"));
    }
    public void Escanear(){
        log.info(String.format("%s","Escanear"));
    }
    public void Telefono(){ log.info(String.format("%s","Telefono"));}
    public void Faxear(){
        log.info(String.format("%s","Faxear"));
    }
}
