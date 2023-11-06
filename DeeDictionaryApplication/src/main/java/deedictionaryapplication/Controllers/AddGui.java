package deedictionaryapplication.Controllers;

import deedictionaryapplication.Alert.Alerts;
import deedictionaryapplication.DictionaryCommandline.Dictionary;
import deedictionaryapplication.DictionaryCommandline.DictionaryManagement;
import deedictionaryapplication.DictionaryCommandline.Word;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class AddGui implements Initializable {
    @FXML
    private Button addBtn;
    @FXML
    private TextField newWord;
    @FXML
    private TextArea newExplaination;
    @FXML
    private Label successAlert;
    private final Dictionary dictionary = new Dictionary();
    private final DictionaryManagement dictionaryManagement = new DictionaryManagement();
    private final Alerts alerts = new Alerts();
    private final String DB_URL = "jdbc:mysql://localhost:3307/deedictionary";

    public void resetField() {
        newWord.setText("");
        newExplaination.setText("");
    }

    public void showSuccessAlert() {
        successAlert.setVisible(true);
        dictionaryManagement.setTimeout(() -> successAlert.setVisible(false), 1500);
    }

    public void handleClickAddBtn(ActionEvent actionEvent) {
        Alert alertConfirmation = alerts.alertConfirmation("Thêm từ!", "Bạn có chắc chắn muốn thêm từ này?");
        Optional<ButtonType> option = alertConfirmation.showAndWait();
        String newEnglishWord = newWord.getText().trim();
        String newMeaning = newExplaination.getText().trim();

        if (option.get() == ButtonType.OK) {
            Word word = new Word(newEnglishWord, newMeaning);
            int indexOfWord = dictionaryManagement.searchWord(dictionary, newEnglishWord);

            if (indexOfWord >= 0) {
                // Từ đã tồn tại
                Alert selectionAlert = alerts.alertConfirmation("Đã tồn tại!", "Từ này đã tồn tại!\nThay thế hoặc bổ sung cho nghĩa cũ.");
                selectionAlert.getButtonTypes().clear();
                ButtonType replaceBtn = new ButtonType("Thay thế");
                ButtonType insertBtn = new ButtonType("Bổ sung");
                selectionAlert.getButtonTypes().addAll(replaceBtn, insertBtn, ButtonType.CANCEL);
                Optional<ButtonType> selection = selectionAlert.showAndWait();

                if (selection.isPresent()) {
                    if (selection.get() == replaceBtn) {
                        dictionary.get(indexOfWord).setWord_explain(newMeaning);
                        dictionaryManagement.exportToFile(dictionary, DB_URL);
                        showSuccessAlert();
                    } else if (selection.get() == insertBtn) {
                        String oldMeaning = dictionary.get(indexOfWord).getWord_explain();
                        dictionary.get(indexOfWord).setWord_explain(oldMeaning + "\n= " + newMeaning);
                        dictionaryManagement.exportToFile(dictionary, DB_URL);
                        showSuccessAlert();
                    } else {
                        alerts.showAlertInfo("Thay đổi!", "Thay đổi không thành công.");
                    }
                }
            } else {
                // Từ chưa tồn tại, thêm vào cơ sở dữ liệu
                dictionary.add(word);
                dictionaryManagement.addWord(dictionary, newEnglishWord, newMeaning);
                showSuccessAlert();
            }
            addBtn.setDisable(true);
            resetField();
        }

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dictionaryManagement.getConnection();
        dictionaryManagement.getAllWords(dictionary);
        if (newExplaination.getText().isEmpty() || newWord.getText().isEmpty()) addBtn.setDisable(true);

        newWord.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (newExplaination.getText().isEmpty() || newWord.getText().isEmpty()) addBtn.setDisable(true);
                else addBtn.setDisable(false);
            }
        });

        newExplaination.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (newExplaination.getText().isEmpty() || newWord.getText().isEmpty()) addBtn.setDisable(true);
                else addBtn.setDisable(false);
            }
        });

        successAlert.setVisible(false);
    }
}
