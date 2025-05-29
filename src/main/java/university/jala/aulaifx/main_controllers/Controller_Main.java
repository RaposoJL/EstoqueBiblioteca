package university.jala.aulaifx.main_controllers;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;

public class Controller_Main extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Controller_Main.class.getResource("main_views/main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Biblioteca Digital");
        stage.setScene(scene);
        stage.show();
    }

    //
    @FXML
    public void SearchBooks() {
        System.out.println("NO WORKING, YET");
    }
    @FXML
    public void WindowAddBook() throws IOException {
        URL url = getClass().getResource("/university/jala/aulaifx/main_views/addBook-view.fxml");
        FXMLLoader loader = new FXMLLoader(url);

        Parent root = loader.load();
        Stage newWindow = new Stage();
        newWindow.setTitle("Adicionar Livro");

        // Definindo a cena com o layout carregado do FXML
        Scene scene = new Scene(root, 800, 500);
        newWindow.setScene(scene);

        // Mostra a nova janela
        newWindow.show();
    }

    @FXML
    protected void CloseSystemButtonClick() throws IOException {
        System.exit(0);
    }
}

