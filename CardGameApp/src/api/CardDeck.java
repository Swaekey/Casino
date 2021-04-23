/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/21/2021
 * This class pulls information from the Deck of Cards API (https://deckofcardsapi.com/)
 * Creates new deck, Sets deckID, Shuffles deck, Draws card from deck, Keeps track of current number of cards in deck
 * Divides Deck into piles, Moves cards between piles, Draws card from pile, Keeps track of current number of cards in pile
 */
package api;

// import libraries

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class CardDeck {

    private static final String BASE_URL = "https://deckofcardsapi.com/api/deck";
    private static String deckID;
    private static String player1;
    protected static final String PLAYER_2 = "computer";

    //Creates new shuffled CardDeck of 52 cards and sets deckID
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

    //Shuffles CardDeck
    protected static void shuffle() {
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

    //draws card from CardDeck
    public static Cards drawCardFromDeck() {
        String callAction = "/" + deckID + "/draw/?count=1";
        String urlString = BASE_URL + callAction;
        URL url;
        Cards drawnCard = new Cards("", "", 0);
        try {
            // Make the connection.
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            // Examine the response code.
            int status = con.getResponseCode();
            String message = con.getResponseMessage();
            if (status != 200) {
                System.out.printf("Error: Could not load card: " + status + " " + message);
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
                String cardImage = "";
                String stringValue = "";
                int cardValue = 0;
                // set values
                for (int i = 0; i < body.length(); ++i) {
                    JSONObject rec = body.getJSONObject(i);
                    cardCode = rec.getString("code");
                    drawnCard.setCardCode(cardCode);
                    cardImage = rec.getString("image");
                    drawnCard.setCardImage(cardImage);
                    stringValue = rec.getString("value");
                    switch (stringValue) {
                        case "ACE":
                            cardValue = 14;
                            break;
                        case "KING":
                            cardValue = 13;
                            break;
                        case "QUEEN":
                            cardValue = 12;
                            break;
                        case "JACK":
                            cardValue = 11;
                            break;
                        default:
                            cardValue = Integer.parseInt(stringValue);
                    }
                    drawnCard.setCardValue(cardValue);
                }
                return drawnCard;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return drawnCard;
        }
        return drawCardFromDeck();
    }
    // 4-22-21

    //returns number of cards remaining in CardDeck
    public static int getDeckRemaining() {
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

    //adds one card drawn from deck to pileName returns information on Card added
    public static Cards addToPileFromDeck(String pileName) {
        String callAction = "/" + deckID + "/pile/" + pileName + "/add/?cards=";
        Cards cardInfo = drawCardFromDeck();
        String card = cardInfo.getCardCode();
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
            return cardInfo;
        }
        return cardInfo;

    }

<<<<<<< Updated upstream
    //divides existing deck into two piles, player1 and PLAYER_2
    protected static void halfDeck() {
=======
    //divides exisiting deck into two piles, player1 and PLAYER_2
    public static void halfDeck() {
>>>>>>> Stashed changes
        int pileSize = getDeckRemaining() / 2;
        for (int i = pileSize; i > 0; i--) {
            addToPileFromDeck(player1);
            addToPileFromDeck(PLAYER_2);
        }
        if (getDeckRemaining() == 1){
            addToPileFromDeck(PLAYER_2);
        }
    }
    // 4-22-21

    //returns number of cards remaining in pileName
    public static int getPileRemaining(String pileName) {
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
                JSONObject thisPile = piles.getJSONObject(pileName);
                int remaining = thisPile.getInt("remaining");

                return remaining;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return 100000;
        }
        return 0;
    }

    //draws one card from pileName
    protected static Cards drawCardFromPile(String pileName) {
        String callAction = "/" + deckID + "/pile/" + pileName + "/draw/?count=1";
        String urlString = BASE_URL + callAction;
        URL url;
        Cards drawnCard = new Cards("", "", 0);
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
                JSONObject thisPile = piles.getJSONObject(pileName);
                JSONArray body = obj.getJSONArray("cards");
                // initialize variables
                String cardCode = "";
                String cardImage = "";
                String stringValue = "";
                int cardValue = 0;
                // set values
                for (int i = 0; i < body.length(); ++i) {
                    JSONObject rec = body.getJSONObject(i);
                    cardCode = rec.getString("code");
                    drawnCard.setCardCode(cardCode);
                    cardImage = rec.getString("image");
                    drawnCard.setCardImage(cardImage);
                    stringValue = rec.getString("value");
                    switch (stringValue) {
                        case "ACE":
                            cardValue = 14;
                            break;
                        case "KING":
                            cardValue = 13;
                            break;
                        case "QUEEN":
                            cardValue = 12;
                            break;
                        case "JACK":
                            cardValue = 11;
                            break;
                        default:
                            cardValue = Integer.parseInt(stringValue);
                    }
                    drawnCard.setCardValue(cardValue);
                }
                return drawnCard;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return drawnCard;
        }
        return null;
    }

    //adds one card drawn from pileFrom to pileTo returns information on Card added
    protected static Cards addToPileFromPile(String pileFrom, String pileTo) {
        String callAction = "/" + deckID + "/pile/" + pileTo + "/add/?cards=";
        Cards cardInfo = drawCardFromPile(pileFrom);
        String card = cardInfo.getCardCode();
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
            return cardInfo;
        }
        return cardInfo;
    }

    //name player1
    public static void setPlayer1(String player1) {
        CardDeck.player1 = player1;
    }

}
