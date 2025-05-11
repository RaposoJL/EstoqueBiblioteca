package university.jala.aulaifx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class SegundaTela extends Application {
    @FXML
    private TextField titletxt;
    @FXML
    private TextField authortxt;
    @FXML
    private TextField publishertxt;


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SegundaTela.class.getResource("segunda-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Biblioteca Digital");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void SearchBooks() {
        String title = titletxt.getText();
        String author = authortxt.getText();
        String publisher = publishertxt.getText();

        String[] Checknull = {title, author, publisher};
        ArrayList<String> Search = new ArrayList<>();

        for (int i = 0; i < Checknull.length; i++){
            if (Checknull[i] != null){
                Search.add(Checknull[i]);
            }
        }
    }

}
