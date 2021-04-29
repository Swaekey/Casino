/*
 * The Four Lokos
 * Created by: Serena Herter, Keshawn Posey, Srushti Honnnenahalli
 * Created on: 4/21/2021
 * This class creates a new game round in a game of war between two players
 */
package Gameplay;

import CardDeck.Cards;

public class GameRound {

    int roundNum;
    Cards player1Card;
    Cards player2Card;
    String gameRoundWinner;

    public GameRound(int _roundNum, Cards _player1Card, Cards _player2Card, String _gameRoundWinner) {
        this.roundNum = _roundNum;
        this.player1Card = _player1Card;
        this.player2Card = _player2Card;
        this.gameRoundWinner = _gameRoundWinner;
    }

    public GameRound(int _roundNum) {
        this.roundNum = _roundNum;
    }

    public Cards getPlayer1Card() {
        return player1Card;
    }

    public void setPlayer1Card(Cards _player1Card) {
        this.player1Card = _player1Card;
    }

    public Cards getPlayer2Card() {
        return player2Card;
    }

    public void setPlayer2Card(Cards _player2Card) {
        this.player2Card = _player2Card;
    }

    public String getGameRoundWinner() {
        return gameRoundWinner;
    }

    public void setGameRoundWinner(String _gameRoundWinner) {
        this.gameRoundWinner = _gameRoundWinner;
    }

}
