package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import model.Item;

import java.util.ArrayList;

public class AddItemFormController {

    public TextField TxtName1;
    public TextField TxtId2;
    public TextField TxtQuantity1;
    public TextField TxtPrice1;
    public TextField TxtDescription1;
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
        new Alert(Alert.AlertType.INFORMATION,"Added").show();
        System.out.println(ItemList);
    }

    public void btnRemoveByIdOnAction(ActionEvent actionEvent) {
        ItemList.removeIf(item -> item.getId().equals(TxtId.getText()));

        System.out.println(ItemList);
        clearText();
    }

    private void clearTextRemove() {
        TxtId2.setText(null);
        TxtName1.setText(null);
        TxtDescription1.setText(null);
        TxtPrice1.setText(null);
        TxtQuantity1.setText(null);
    }

    private void clearText() {
        TxtId.setText(null);
        TxtName.setText(null);
        TxtDescription.setText(null);
        TxtPrice.setText(null);
        TxtQuantity.setText(null);
    }

    public void btnRemoveById2OnAction(ActionEvent actionEvent) {
        ItemList.removeIf(item -> item.getId().equals(TxtId2.getText()));
        new Alert(Alert.AlertType.INFORMATION,"Removed").show();
        System.out.println(ItemList);
        clearTextRemove();
    }


    public void ItemOnKeyReleased(KeyEvent keyEvent) {

        for (Item item : ItemList) {

            if (item.getId().equals(TxtId2.getText())) {
                TxtName1.setText(item.getName());
                TxtDescription1.setText(item.getDescription());
                TxtPrice1.setText(item.getPrice());
                TxtQuantity1.setText(item.getQuantity());
                return;
            } else {
                TxtName1.setText(null);
                TxtQuantity1.setText(null);
                TxtPrice1.setText(null);
                TxtDescription1.setText(null);
            }


        }
    }
//      ItemList.forEach(item -> {
//
//                    if (item.getId().equals(TxtId2.getText())) {
//                        TxtName1.setText(item.getName());
//                        TxtDescription1.setText(item.getDescription());
//                        TxtPrice1.setText(item.getPrice());
//                        TxtQuantity1.setText(item.getQuantity());
//
//                    }else{
//                        TxtName1.setText(null);
//                        TxtQuantity1.setText(null);
//                        TxtPrice1.setText(null);
//                        TxtDescription1.setText(null);
//                    }
//                }
//
//        );
//
//
//    }
}