package com.sweetandsaltystudios.userinterface;

import javafx.scene.control.TextField;

public class SudokuTextField extends TextField {
    private final int X;
    private final int Y;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public SudokuTextField(int x, int y) {
        super();

        X = x;
        Y = y;
    }

    @Override
    public void replaceText(int i, int i1, String s) {
        if (!s.matches("[0-9]")) {
            super.replaceText(i, i1, s);
        }
    }

    @Override
    public void replaceSelection(String s) {
        if (!s.matches("[0-9]")) {
            super.replaceSelection(s);
        }
    }
}