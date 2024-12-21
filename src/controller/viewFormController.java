package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Item;

public class viewFormController  {

    @FXML
    private TableColumn colDescription;

    @FXML
    private TableColumn colId;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn colPrice;

    @FXML
    private TableColumn colQuantity;

    @FXML
    private TableView<Item> table;

    @FXML
    void btnGetOnAction(ActionEvent event) {
        table.setItems(null);
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("Price"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("Description"));

        ObservableList<Item> itemList = FXCollections.observableArrayList();
        for (Item item : AddCustomerFormController.ItemList) {
            System.out.println(item);
            itemList.add(item);
        }
        table.setItems(itemList);

    }



}