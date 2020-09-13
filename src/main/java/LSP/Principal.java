package LSP;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@RequiredArgsConstructor
@Getter
//@Setter
@SuperBuilder
public abstract class Principal {

    @NonNull
    protected String mensaje;

    public abstract void muestra();
}
