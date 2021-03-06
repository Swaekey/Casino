package CardDeck;

/*
 * The Four Lokos
 * Created by: Serena Herter
 * Created on: 4/21/2021
 * This class creates cards with :
 *          code ("2D", "AS", "0C", ect.), 
 *          image (.png file) 
 *          and value (2D = 2, AS = 14, 0C = 10, etc)
 * These cards are translated from the API to be used throughout the app
 */
public class Cards {

    public String cardCode;
    public String cardImage;
    public int cardValue;

    public Cards(apiTranslators.CardsAPITranslator _card) {
        cardCode = _card.getCardCode();
        cardImage = _card.getCardImage();
        cardValue = _card.getCardValue();
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String _cardCode) {
        this.cardCode = _cardCode;
    }

    public String getCardImage() {
        return cardImage;
    }

    public void setCardImage(String _cardImage) {
        this.cardImage = _cardImage;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int _cardValue) {
        this.cardValue = _cardValue;
    }

    @Override
    public boolean equals(Object _obj) {
        if (this == _obj) {
            return true;
        }
        if (_obj == null) {
            return false;
        }
        if (getClass() != _obj.getClass()) {
            return false;
        }
        final Cards other = (Cards) _obj;
        if (this.cardValue != other.cardValue) {
            return false;
        }
        return true;
    }

    public int compareTo(Cards _card) {
        if (this.equals(_card)) {
            return 0;
        } else if (this.getCardValue() > _card.getCardValue()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Cards{" + "cardCode=" + cardCode + ", cardImage=" + cardImage + ", cardValue=" + cardValue + '}';
    }

}
