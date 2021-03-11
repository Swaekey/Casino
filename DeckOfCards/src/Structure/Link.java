package Structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

/**
 * This prototype demonstrates a call to an API.
 *
 */

public class Link {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a HTTP Connection.
        String baseUrl = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";
        String urlString = baseUrl;
        URL url;
        System.out.println("Marker 1");
        try {
            System.out.println("Marker 2");
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            System.out.println("Marker 3");

            int status = con.getResponseCode();
            System.out.println("Response Code: " + status);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
            System.out.println("Output: " + content.toString());
            JSONObject obj = new JSONObject(content.toString());
            String shuffle = obj.getString("shuffle");
            System.out.println("shuffle " + shuffle);
        } catch (Exception ex) {
            Logger.getLogger(Link.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

    }

}
