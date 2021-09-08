package com.sweetandsaltystudios.problemdomain;

import java.util.Objects;

public class Coordinate {
    private final int X;
    private final int Y;

    public int GetX() {
        return X;
    }

    public int GetY() {
        return Y;
    }

    public Coordinate(int x, int y) {
        super();

        X = x;
        Y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        var that = (Coordinate) o;
        return (X == that.X && Y == that.Y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }
}