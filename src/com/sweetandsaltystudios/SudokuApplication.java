package com.sweetandsaltystudios;

import com.sweetandsaltystudios.buildlogic.SudokuBuildLogic;
import com.sweetandsaltystudios.userinterface.IUserInterfaceContract;
import com.sweetandsaltystudios.userinterface.UserInterfaceImpl;

import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
import javafx.stage.Stage;

public class SudokuApplication extends Application {

    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception {
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}