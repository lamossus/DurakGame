package mirea.sipi.durak.game;

/**
 * Класс игровой карты
 */
public class Card {
    /**
     * Энмератор масти карты
     */
    public enum Suit {
        DIAMONDS, CLUBS, HEARTS, SPADES
    }

    /**
     * Масть карты
     */
    private Suit suit;
    /**
     * Значение карты от 6 до 14, где 11 - Валет, 12 - Дама, 13 - Король и 14 - Туз.
     */
    private int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
