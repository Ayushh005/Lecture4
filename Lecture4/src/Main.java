import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    // Function to fetch exchange rate from a reliable API
    private static double fetchExchangeRate(String baseCurrency, String targetCurrency, String apiKey) throws Exception {
        String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCurrency + "/" + targetCurrency;
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        JSONObject json = new JSONObject(content.toString());
        if (json.getString("result").equals("success")) {
            return json.getDouble("conversion_rate");
        } else {
            throw new Exception("Error fetching exchange rate: " + json.getString("error-type"));
        }
    }

    // Function to perform currency conversion
    private static double convertCurrency(double amount, double rate) {
        return amount * rate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample API key (Replace with your actual API key)
        String apiKey = "your_api_key_here";

        // Step 1: Currency Selection
        System.out.print("Enter the base currency code (e.g., USD, EUR, GBP): ");
        String baseCurrency = scanner.next().toUpperCase();
        System.out.print("Enter the target currency code (e.g., USD, EUR, GBP): ");
        String targetCurrency = scanner.next().toUpperCase();

        // Step 2: Fetch real-time exchange rates
        double exchangeRate;
        try {
            exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency, apiKey);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        // Step 3: Amount Input
        System.out.print("Enter the amount in " + baseCurrency + " to convert: ");
        double amount = scanner.nextDouble();

        // Step 4: Currency Conversion
        double convertedAmount = convertCurrency(amount, exchangeRate);

        // Step 5: Display Result
        System.out.printf("%.2f %s is equal to %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
    }
}
