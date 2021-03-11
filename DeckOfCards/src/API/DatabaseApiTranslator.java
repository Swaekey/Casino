package API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import org.json.JSONObject;

/**
 * The databaseAPI class connects to the deck of cards api
 *
 *
 */

public class DatabaseApiTranslator implements ApiInterface {

    private static final String baseURL = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";

    /**
     *
     *
     */
    @Override
    public String Shuffle(int _cards) {
        // Build the base url string.
        try {
            URL url = new URL(DatabaseApiTranslator.baseURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            // Build the content from the buffered input.
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            // Close the connections.
            in.close();
            con.disconnect();
            // Extract the JSON object.
            JSONObject obj = new JSONObject(content.toString());
            String shuffle = obj.getString("shuffle");
            return shuffle;
        } catch (Exception ex) {
            //Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}