package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Controller2{

    //All nine buttons for tic tac toe
    //Buttons can NOT BE STATIC
    @FXML
    protected Button btnTL, btnTM, btnTR;
    @FXML
    protected Button btnML, btnMM, btnMR;
    @FXML
    protected Button btnBL, btnBM, btnBR;
    @FXML
    protected Label lblStatus;

    protected int aiOption = 0;

    protected TicTacToe game;

    @FXML
    void initialize() {
        assert btnML != null : "fx:id=\"btnML\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnTR != null : "fx:id=\"btnTR\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnMM != null : "fx:id=\"btnMM\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnBR != null : "fx:id=\"btnBR\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnMR != null : "fx:id=\"btnMR\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnBM != null : "fx:id=\"btnBM\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnBL != null : "fx:id=\"btnBL\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnTM != null : "fx:id=\"btnTM\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnTL != null : "fx:id=\"btnTL\" was not injected: check your FXML file 'scene2.fxml'.";
        assert lblStatus != null : "fx:id\"lblStatus\" was not injected: check your FXML file 'scene2.fxml'.";

        //TicTacToe game;

        if (aiOption==0){
            game = new TicTacToe();
        }else if(aiOption==1){
            game = new TicTacToeAIEasy();
        }else if(aiOption==2) {
            game = new TicTacToeAINormal();
        }else{ //aiOption==3
            game = new TicTacToeAIHard();
        }

        game.setController(this);
        game.resetBoard();

        btnTL.setOnAction(event -> game.genericBtnClick(0, 0));
        
        btnTM.setOnAction(event -> game.genericBtnClick(1, 0));

        btnTR.setOnAction(event -> game.genericBtnClick(2, 0));

        btnML.setOnAction(event -> game.genericBtnClick(0, 1));

        btnMM.setOnAction(event -> game.genericBtnClick(1, 1));

        btnMR.setOnAction(event -> game.genericBtnClick(2, 1));

        btnBL.setOnAction(event -> game.genericBtnClick(0, 2));

        btnBM.setOnAction(event -> game.genericBtnClick(1, 2));

        btnBR.setOnAction(event -> game.genericBtnClick(2, 2));

    }

    protected void createOverlay(String strMessage){

        //Creates buttons, label, original scene, and original window for overlay
        Button btnMainMenu = new Button("Main Menu");
        Button btnPlayAgain= new Button("Play Again");
        Label lblMessage = new Label(strMessage);
        Scene origScene = btnBL.getScene();
        Stage window = (Stage) origScene.getWindow();

        //Setting up the buttons
        btnMainMenu.setMaxWidth(200);
        btnPlayAgain.setMaxWidth(200);

        //This section for setting the display of buttons
        VBox layout = new VBox(lblMessage, btnMainMenu, btnPlayAgain);
        layout.setStyle("-fx-background-color: rgba(0, 0, 0, 0.3);");
        layout.getStylesheets().add(getClass().getResource("styleScene4-overlay.css").toExternalForm());
        layout.setMaxWidth(btnBL.getScene().getWidth());
        layout.setMaxHeight(btnBL.getScene().getHeight());
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        //End section


        //This gets a snapshot of the game, then blurs it and sets it as the background
        //Maybe use fade animation?
        ImageView imageView = new ImageView(btnBL.getScene().snapshot(null));
        imageView.setEffect(new GaussianBlur(5));

        //This combines the blurred background with the buttons
        StackPane background = new StackPane(imageView,layout);

        //Creates a new scene for the overlay
        Scene scene4Overlay = new Scene(background);

        //Displays overlay to user (replaces game board scene)
        window.setScene(scene4Overlay);


        //User chooses play again, game board resets and scene is switched
        //to game board
        btnPlayAgain.setOnAction(event -> {
            game.resetBoard();
            window.setScene(origScene);
        });


        //User chooses Main Menu, scene for main menu is created and then switched too.
        btnMainMenu.setOnAction(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
                Scene scene1 = new Scene((Parent) loader.load());
                scene1.getStylesheets().add(getClass().getResource("styleScene1.css").toExternalForm());
                window.setScene(scene1);
            } catch (Exception ignored){}
        });


    }

    protected void resetButtons() {

        String blank = "";
        lblStatus.setText(blank);
        btnTL.setText(blank);
        btnTM.setText(blank);
        btnTR.setText(blank);
        btnML.setText(blank);
        btnMM.setText(blank);
        btnMR.setText(blank);
        btnBL.setText(blank);
        btnBM.setText(blank);
        btnBR.setText(blank);
    }

    public void setBtnText(int i, int j,String text){
        if (i == 0 && j==0) btnTL.setText(text);
        else if (i == 1 && j==0) btnTM.setText(text);
        else if (i == 2 && j==0) btnTR.setText(text);
        else if (i == 0 && j==1) btnML.setText(text);
        else if (i == 1 && j==1) btnMM.setText(text);
        else if (i == 2 && j==1) btnMR.setText(text);
        else if (i == 0 && j==2) btnBL.setText(text);
        else if (i == 1 && j==2) btnBM.setText(text);
        else if (i == 2 && j==2) btnBR.setText(text);
    }

    public void setLblText(String text){lblStatus.setText(text);}


    public void setAiOption(int x){aiOption=x;}

    public int getAiOption(){return aiOption;}


}

