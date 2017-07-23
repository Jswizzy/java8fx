package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    @FXML
    public TextField username;
    @FXML
    public TextField password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void okAction(ActionEvent actionEvent) {
        System.out.println("Clicked ok");

        System.out.printf("user name = %s\npassword = %s",
                username.getText(), password.getText());

        username.clear();
        password.clear();
    }

    public void cancelAction(ActionEvent actionEvent) {
        System.out.println("Clicked cancel");
        System.exit(0);
    }
}
