package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Item;

import java.util.ArrayList;

public class AddCustomerFormController {

    @FXML
    private TextField TxtDescription;

    @FXML
    private TextField TxtId;

    @FXML
    private TextField TxtName;

    @FXML
    private TextField TxtPrice;

    @FXML
    private TextField TxtQuantity;

    static ArrayList<Item> ItemList = new ArrayList<>();

    @FXML
    void btnClickOnAction(ActionEvent event) {
        ItemList.add(new Item(TxtId.getText(), TxtName.getText(), TxtQuantity.getText(), TxtPrice.getText(), TxtDescription.getText()));
        clearText();
        System.out.println(ItemList);
    }

    public void btnRemoveByIdOnAction(ActionEvent actionEvent) {
        ItemList.removeIf(item -> item.getId().equals(TxtId.getText()));

        System.out.println(ItemList); // Updated list
        clearText(); // Clear the input fields
    }


    private void clearText() {
        TxtId.setText("");
        TxtName.setText("");
        TxtDescription.setText("");
        TxtPrice.setText("");
        TxtQuantity.setText("");
    }
}