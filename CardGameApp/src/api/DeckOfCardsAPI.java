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
    
   private static final String BASE_URL = "https://deckofcardsapi.com/api/deck";
   private static String deckID;
   
    //Creates new shuffled deck of 52 cards
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
    
    //Shuffles exsisting deck
    public static void shuffle(){
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
    
    //draws card from deck
    public static String drawCardFromDeck(){
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
                System.out.printf("Error: Could not load card: " + status);
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
                // Get deck data array.
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
    
    //adds one card drawn from deck to pileName
    public static void addToPileFromDeck(String pileName){
        String callAction = "/" + deckID + "/pile/" + pileName + "/add/?cards=";
        String card = drawCardFromDeck();
        String urlString = BASE_URL + callAction + card;
        URL url;
         try {
            // Make the connection.
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.printf("Error: Could not load pile: " + status);
            } else {
                // Parsing input stream into a text string.
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                //System.out.println(card + " is in " + pileName);
                // Close the connections.
                in.close();
                con.disconnect();
                
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return;
        }
        
    }
    
    //divides exisiting deck into two piles, player1 and player2
    public static void halfDeck(){
        int pileSize = getDeckRemaining() / 2;
        
        for (int i = pileSize; i > 0 ; i--){
            addToPileFromDeck("player1");
            addToPileFromDeck("player2");
        }
        
        
    }
    
    //returns value of cards remaining in deck
    public static int getDeckRemaining(){
        String callAction = "/" + deckID;
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
                int remaining = obj.getInt("remaining");                              
                return remaining;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return 100000;
        }
       return 0;
    }
    
    //returns value of cards remaining in pileName
    public static int getPileRemaining(String pileName){
        String callAction = "/" + deckID + "/pile/" + pileName + "/list";
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
                JSONObject piles = obj.getJSONObject("piles");
                // initialize variables
                JSONObject thisPile =  piles.getJSONObject(pileName);
                int remaining= thisPile.getInt("remaining");
                
                return remaining;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return 100000;
        }
       return 0;
    }
    
    //draws one card from pileName
    public static String drawCardFromPile(String pileName){
        String callAction = "/" + deckID + "/pile/" + pileName + "/draw/?count=1";
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
                System.out.printf("Error: Could not load card: " + status);
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
                // Get deck data array.
                JSONObject piles = obj.getJSONObject("piles");
                // initialize variables
                JSONObject thisPile =  piles.getJSONObject(pileName);
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
    
    //adds one card drawn from pileFrom to pileTo
    public static void addToPileFromPile(String pileFrom, String pileTo){
        String callAction = "/" + deckID + "/pile/" + pileTo + "/add/?cards=";
        String card = drawCardFromPile(pileFrom);
        String urlString = BASE_URL + callAction + card;
        URL url;
         try {
            // Make the connection.
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.printf("Error: Could not load pile: " + status);
            } else {
                // Parsing input stream into a text string.
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                //System.out.println(card + " is in " + pileName);
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
