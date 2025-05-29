package university.jala.aulaifx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HelloController {
    @FXML
    private TextField txtuser;
    @FXML
    private PasswordField txtpwd;

    private String userMock = "";
    private String pwdMock  = "";

    private boolean validaLogin(String login, String senha){
        if(login.equals(userMock) && senha.equals(pwdMock)){
            return true;
        }
        return false;
    }



    @FXML
    protected void onLoginButtonClick() throws IOException {
        // Código permanece igual, apenas remova o uso de 'event'
        String login = txtuser.getText();
        String pwd   = txtpwd.getText();

        if(validaLogin(login, pwd)) {
            URL url = getClass().getResource("/university/jala/aulaifx/main_views/main-view.fxml");
            if (url == null) {
                System.err.println("FXML não encontrado!");
                return;
            }
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();

            Stage stage = (Stage) txtuser.getScene().getWindow(); // Obtém a janela pela TextField
            stage.setScene(new Scene(root));
            stage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("LOGIN INVÁLIDO!");
            alert.show();
        }
    }



}