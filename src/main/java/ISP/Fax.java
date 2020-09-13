package ISP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fax implements IFax{
    public void Telefono(){
        log.info(String.format("%s","Telefono"));
    }
    public void Faxear(){
        log.info(String.format("%s","Faxear"));
    }
}
