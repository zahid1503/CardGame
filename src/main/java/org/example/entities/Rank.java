package org.example.entities;

public enum Rank {

    ACE("A",1),TWO("2",2),THREE("3",3), FOUR("4", 4), FIVE("5", 5), SIX("6", 6), SEVEN("7", 7),
    EIGHT("8", 8), NINE("9", 9), TEN("10", 10), JACK("J", 11), QUEEN("Q", 12), KING("K", 13);

    private String rank;
    private int value;
    Rank(String rank , int value){
        this.rank = rank;
        this.value = value;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
