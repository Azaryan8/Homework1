package Hw_2;

import java.util.Comparator;
import java.util.concurrent.CompletionException;

public class Flat implements Comparable<Flat> {
    private Integer room;
    private double square;

    public Flat(Integer room,double square) {
        this.room = room;
        this.square = square;
    }

    public Integer getRoom() {
        return room;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "room=" + room +
                ", square=" + square +
                '}';
    }

    @Override
    public int compareTo(Flat other) {
        return Integer.compare(this.room, other.room);
    }
}
