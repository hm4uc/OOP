package deedictionaryapplication.Controllers;

import deedictionaryapplication.DictionaryCommandline.Dictionary;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchGui implements Initializable {
    public TextField searchTerm;
    public Button cancelBtn;
    public Label notAvailableAlert;
    public TextArea explanation;
    public Label englishWord;
    public Label headerList;
    public ListView listResults;
    private Dictionary dictionary = new Dictionary();
    private DictionaryManagement dictionaryManagement = new DictionaryManagement();
    private final String path = "src/main/resources/dictinary.sql";
    ObservableList<String> list = FXCollections.observableArrayList();
    private int indexOfSelectedWord;
    private int firstIndexOfListFound = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void handleClickDeleteBtn(ActionEvent actionEvent) {
    }

    public void handleClickEditBtn(ActionEvent actionEvent) {
    }

    public void handleClickSoundBtn(ActionEvent actionEvent) {
    }

    public void handleClickSaveBtn(ActionEvent actionEvent) {
    }
}
