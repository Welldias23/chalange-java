
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        int escolha = 0;
        String valorAConverter = "";


        while (escolha <= 0 && escolha <= 6) {
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

            valorAConverter = ler.next();



            if (escolha == 1) {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/96ed609c3944d773fdab5f61/pair/USD/ARS/" + valorAConverter))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                Gson gson = new Gson();

                MoedasRecord moedasRecord = gson.fromJson(json, MoedasRecord.class);


                Moeda moeda = new Moeda(moedasRecord);
                moeda.setValorAconverter(Double.parseDouble(valorAConverter));

                System.out.println(moeda);

            } else if (escolha == 2) {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/96ed609c3944d773fdab5f61/pair/ARS/USD/" + valorAConverter))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();



                Gson gson = new Gson();

                MoedasRecord moedasRecord = gson.fromJson(json, MoedasRecord.class);


                Moeda moeda = new Moeda(moedasRecord);
                moeda.setValorAconverter(Double.parseDouble(valorAConverter));

                System.out.println(moeda);


            } else if (escolha == 3) {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/96ed609c3944d773fdab5f61/pair/USD/BRL/" + valorAConverter))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                Gson gson = new Gson();

                MoedasRecord moedasRecord = gson.fromJson(json, MoedasRecord.class);


                Moeda moeda = new Moeda(moedasRecord);
                moeda.setValorAconverter(Double.parseDouble(valorAConverter));

                System.out.println(moeda);


            } else if (escolha == 4) {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/96ed609c3944d773fdab5f61/pair/BRL/USD/" + valorAConverter))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                Gson gson = new Gson();

                MoedasRecord moedasRecord = gson.fromJson(json, MoedasRecord.class);


                Moeda moeda = new Moeda(moedasRecord);
                moeda.setValorAconverter(Double.parseDouble(valorAConverter));

                System.out.println(moeda);

            } else if (escolha == 5) {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/96ed609c3944d773fdab5f61/pair/USD/COP/" + valorAConverter))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                Gson gson = new Gson();

                MoedasRecord moedasRecord = gson.fromJson(json, MoedasRecord.class);


                Moeda moeda = new Moeda(moedasRecord);
                moeda.setValorAconverter(Double.parseDouble(valorAConverter));

                System.out.println(moeda);


            } else if (escolha == 6) {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/96ed609c3944d773fdab5f61/pair/COP/USD/" + valorAConverter))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                Gson gson = new Gson();

                MoedasRecord moedasRecord = gson.fromJson(json, MoedasRecord.class);


                Moeda moeda = new Moeda(moedasRecord);
                moeda.setValorAconverter(Double.parseDouble(valorAConverter));

                System.out.println(moeda);


            }

        }
        
        System.out.println("Conversor encerrado.");
    }
}