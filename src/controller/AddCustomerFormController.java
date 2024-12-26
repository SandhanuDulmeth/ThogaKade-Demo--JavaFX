package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import model.Item;

import java.util.ArrayList;
import java.util.Objects;

public class AddCustomerFormController {

    public TextField TxtName1;
    public TextField TxtId2;
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

    public void btnRemoveById2OnAction(ActionEvent actionEvent) {
    }


    public void ItemOnKeyReleased(KeyEvent keyEvent) {
        if(Objects.equals(TxtId2.getText(), "l")){
            TxtName1.setText("j"); }else {TxtName1.setText(null);}
    }
}