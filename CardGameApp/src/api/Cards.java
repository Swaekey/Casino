/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/21/2021
 * This class creates cards with :
 *          code ("2D", "AS", "0C", ect.), 
 *          image (.png file) 
 *          and value (2D = 2, AS = 14, 0C = 10, etc)
 */
package api;

public class Cards {
    public String cardCode;
    public String cardImage;
    public int cardValue;

    public Cards(String cardCode, String cardImage, int cardValue) {
        this.cardCode = cardCode;
        this.cardImage = cardImage;
        this.cardValue = cardValue;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardImage() {
        return cardImage;
    }

    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cards other = (Cards) obj;
        if (this.cardValue != other.cardValue) {
            return false;
        }
        return true;
    }
    
    
    
}
