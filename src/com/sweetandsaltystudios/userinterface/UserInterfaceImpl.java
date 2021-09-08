package com.sweetandsaltystudios.userinterface;

import java.util.HashMap;

import com.sweetandsaltystudios.problemdomain.Coordinate;
import com.sweetandsaltystudios.problemdomain.SudokuGame;
import com.sweetandsaltystudios.userinterface.IUserInterfaceContract.EventListener;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UserInterfaceImpl implements IUserInterfaceContract.View, EventHandler<KeyEvent> {

    private final Stage STAGE;
    private final Group ROOT;

    private HashMap<Coordinate, SudokuTextField> textFieldCoordinates;
    private IUserInterfaceContract.EventListener listener;

    private static final double WINDOW_X = 668;
    private static final double WINDOW_Y = 732;
    private static final double BOARD_PADDING = 50;
    private static final double BOARD_X_AND_Y = 576;

    private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(0, 150, 136);
    private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(224, 242, 241);
    public static final String SUDOKU__TITLE = "SUDOKU";
    
    public UserInterfaceImpl(Stage stage) {
        STAGE = stage;
        ROOT = new Group();
        textFieldCoordinates = new HashMap<>();

        initializeUserInterface();
    }

    private void initializeUserInterface() {
        drawBackground(ROOT);
        drawTitle(ROOT);
        drawSudokuBoard(ROOT);
        drawTextFields(ROOT);
        drawGridLines(ROOT);
        STAGE.show();
    }

    private void drawBackground(Group rOOT2) {
    }

    private void drawTitle(Group rOOT2) {
    }

    private void drawSudokuBoard(Group rOOT2) {
    }

    private void drawTextFields(Group rOOT2) {
    }

    private void drawGridLines(Group rOOT2) {
    }

    @Override
    public void setListener(EventListener listener) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateSquare(int x, int y, int input) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateBoard(SudokuGame game) {
        // TODO Auto-generated method stub

    }

    @Override
    public void showDialog(String message) {
        // TODO Auto-generated method stub

    }

    @Override
    public void showError(String message) {
        // TODO Auto-generated method stub

    }

    @Override
    public void handle(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

}