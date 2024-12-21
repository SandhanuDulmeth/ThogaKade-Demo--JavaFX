package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class dashFormController {
    public void btnaddCustomerOnAction(ActionEvent actionEvent) {

        try {
            Stage stage = new Stage();
            stage.setScene(new Scene(
                    FXMLLoader.load(getClass().getResource("/view/add_customer-form.fxml"))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnViewOnAction(ActionEvent actionEvent) {
        try {
            Stage stage = new Stage();
            stage.setScene(new Scene(
                    FXMLLoader.load(getClass().getResource("/view/view_Form.fxml"))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
