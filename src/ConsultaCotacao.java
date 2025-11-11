import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCotacao {
    public MoedasConversao consultaCotacao() throws IOException {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/97f5990c2d125c5f450b2a30/latest/BRL");

        Gson gson = new Gson();

        //resquest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            //response
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            MoedasConversao moedas = gson.fromJson(json, MoedasConversao.class);
            return moedas;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar cotação: %s".formatted(e.getMessage()));
        }
    }
}
