
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        int escolha = 1;
        int valorAConverter = 0;

        while (escolha > 0 && escolha <= 6) {
            System.out.println("""
                    *********************************************************
                    Seja bem vindo/a ao corversor de moedas.
                    
                    
                    1) Dolar =>> Peso Argetino
                    2) Peso Argentino =>> Dolar
                    3) Dolar =>> Real Brasileiro
                    4) Real Brasileiro =>> Dolar
                    5) Dolar =>> Peso Colombiano
                    6) Peso Colombiano =>> Dolar
                    7) Sair
                    
                    
                    Escolha uma opcao valida:
                    *********************************************************
                    """);
            escolha = ler.nextInt();

            System.out.println("Digite o valor que deja corverter:");
            valorAConverter = ler.nextInt();


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/96ed609c3944d773fdab5f61/latest/USD"))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            if (escolha == 1) {

            } else if (escolha == 2) {

            } else if (escolha == 3) {

            } else if (escolha == 4) {

            } else if (escolha == 5) {

            } else if (escolha == 6) {

            }

        }
        
        System.out.println("thcau");
    }
}