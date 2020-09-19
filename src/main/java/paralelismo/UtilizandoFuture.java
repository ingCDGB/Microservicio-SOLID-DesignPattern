package paralelismo;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
@NoArgsConstructor
public class UtilizandoFuture {


    private Future<String> calculateAsync() throws InterruptedException{

        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) { }

            completableFuture.complete("Hello");

            return null;
        });

        return completableFuture;
    }

    public String ejecutarCalculateAsync() {
        try {
            Future<String> completableFuture = this.calculateAsync();
            return completableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            log.error("Error",e);
            return "Error ejecutarCalculateAsync";
        }
    }
}
