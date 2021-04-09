/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

// import libraries
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class DeckOfCardsAPI {
    
   public static final String BASE_URL = "https://deckofcardsapi.com/api/deck";
   public static String deckID;
   
    public static void newDeck() {
        String callAction = "/new/shuffle/?deck_count=1";
        String urlString = BASE_URL + callAction;
        URL url;
        try {
            // Make the connection.
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.printf("Error: Could not load deck: " + status);
            } else {
                // Parsing input stream into a text string.
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Close the connections.
                in.close();
                con.disconnect();
                // Parse that object into a usable Java JSON object.
                JSONObject obj = new JSONObject(content.toString());
                // set deck id
                deckID = obj.getString("deck_id");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return;
        }
            
    }
    
    public static void newDeck(int numDecks) {
        String callAction = "/new/shuffle/?deck_count=" + numDecks;
        String urlString = BASE_URL + callAction;
        URL url;
        try {
            // Make the connection.
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.printf("Error: Could not load deck: " + status);
            } else {
                // Parsing input stream into a text string.
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Close the connections.
                in.close();
                con.disconnect();
                // Parse that object into a usable Java JSON object.
                JSONObject obj = new JSONObject(content.toString());
                // set deck id
                deckID = obj.getString("deck_id");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return;
        }
      
                   
    }
    public static void Shuffle(){
           String callAction = "/" + deckID + "/shuffle/";
        String urlString = BASE_URL + callAction;
        URL url;
        try {
            // Make the connection.
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.printf("Error: Could not load deck: " + status);
            } else {
                // Parsing input stream into a text string.
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Close the connections.
                in.close();
                con.disconnect();                
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return;
        } 
    }
    
    public static String DealCard(){
           String callAction = "/" + deckID + "/draw/?count=1";
        String urlString = BASE_URL + callAction;
        URL url;
        try {
            // Make the connection.
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.printf("Error: Could not load deck: " + status);
            } else {
                // Parsing input stream into a text string.
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Close the connections.
                in.close();
                con.disconnect();
                // Parse that object into a usable Java JSON object.
                JSONObject obj = new JSONObject(content.toString());
                // set deck id
                // Get joke data array.
                JSONArray body = obj.getJSONArray("cards");
                // initialize variables
                String cardCode = "";
                // set values
                for (int i = 0; i < body.length(); ++i) {
                    JSONObject rec = body.getJSONObject(i);
                    cardCode = rec.getString("code");
                }
                // Print Setup and Punchline
                return cardCode;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return "";
        } 
       return null;
    }
    
    public static void halfDeck(){
        String callActionP1 = "/" + deckID + "/pile/player1/add/?cards";
        
        for (int i = 0; i < 13; i++){
            while (i !=12) {
            callActionP1 = callActionP1 + DealCard() + ",";
            }
            callActionP1 = callActionP1 + DealCard();
        }        
        String urlString1 = BASE_URL + callActionP1;
        URL url1;
        String callActionP2 = "/" + deckID + "/pile/player2/add/?cards";
        
        for (int i = 0; i < 13; i++){
            while (i !=12) {
            callActionP2 = callActionP2 + DealCard() + ",";
            }
            callActionP2 = callActionP2 + DealCard();
        }        
        String urlString2 = BASE_URL + callActionP2;
        URL url2;        
        
        try {
            // Make the connection.
            url1 = new URL(urlString1);
            HttpURLConnection con = (HttpURLConnection) url1.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.printf("Error: Could not load deck: " + status);
            } else {
                // Parsing input stream into a text string.
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Close the connections.
                in.close();
                con.disconnect();
                
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return;
        }
        try {
            // Make the connection.
            url2 = new URL(urlString2);
            HttpURLConnection con = (HttpURLConnection) url1.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.printf("Error: Could not load deck: " + status);
            } else {
                // Parsing input stream into a text string.
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Close the connections.
                in.close();
                con.disconnect();
                
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return;
        }
    }
    
    
    
    
    
    
    
    
    
    
}
