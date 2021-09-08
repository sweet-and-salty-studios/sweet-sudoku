package com.sweetandsaltystudios.problemdomain;

import java.io.Serializable;

import com.sweetandsaltystudios.constants.GAME_STATE;
import com.sweetandsaltystudios.computationlogic.SudokuUtilities;

public class SudokuGame implements Serializable {
    
    private final GAME_STATE GAME_STATE;
    private final int[][] GRID_STATE;

    public static final int GRID_BOUNDRY = 9;

    public GAME_STATE GetGameState() {
        return GAME_STATE;
    }

    public int[][] GetGridStateCopy() {
        return SudokuUtilities.CopyToNewArray(GRID_STATE);
    }

    public SudokuGame(GAME_STATE gameState, int[][] gridState) {
        super();

        this.GAME_STATE = gameState;
        this.GRID_STATE = gridState;
    }
}