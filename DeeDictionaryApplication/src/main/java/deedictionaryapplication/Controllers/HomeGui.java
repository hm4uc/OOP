package deedictionaryapplication.Controllers;

import deedictionaryapplication.DictionaryCommandline.DictionaryManagement;
import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeGui implements Initializable {
    @FXML
    private Button minimizeBtn, closeBtn, BtnBurger;
    @FXML
    private ToggleButton HomeMenu, SearchMenu, AddMenu, TranslateMenu, FavouriteMenu, HistoryMenu, GameMenu;
    @FXML
    private Tooltip tooltip1, tooltip2, tooltip3, tooltip4, tooltip5, tooltip6, tooltip7;
    @FXML
    private BorderPane mainPane;
    @FXML
    private VBox vbox;
    @FXML
    boolean vboxVisible = true;
    private DictionaryManagement dictionaryManagement = new DictionaryManagement();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tooltip1.setShowDelay(Duration.seconds(0.5));
        tooltip2.setShowDelay(Duration.seconds(0.5));
        tooltip3.setShowDelay(Duration.seconds(0.5));
        tooltip4.setShowDelay(Duration.seconds(0.5));
        tooltip5.setShowDelay(Duration.seconds(0.5));
        tooltip6.setShowDelay(Duration.seconds(0.5));
        tooltip7.setShowDelay(Duration.seconds(0.5));
        vbox.setVisible(false);
        BtnBurger.setVisible(false);
    }

    public void handleBtnHome(ActionEvent actionEvent) {
        LoaderFxml loaderFxml = new LoaderFxml();
        Pane view = loaderFxml.getScene("HomeGui");
        mainPane.setLeft(null);
        mainPane.setTop(null);
        mainPane.setCenter(view);
        BtnBurger.setVisible(false);
        vbox.setVisible(false);
    }
    @FXML
    public void handleBtnSearch(ActionEvent actionEvent) throws IOException {
        LoaderFxml loaderFxml = new LoaderFxml();
        Pane view = loaderFxml.getScene("SearchGui");
        mainPane.setCenter(view);
        vbox.setVisible(true);
        BtnBurger.setVisible(true);
        for (ToggleButton btn : new ToggleButton[]{SearchMenu, AddMenu, TranslateMenu, FavouriteMenu, HistoryMenu, GameMenu}) {
            btn.getStyleClass().remove("active");
        }
        SearchMenu.getStyleClass().add("active");
    }

    public void handleBtnAdd(ActionEvent actionEvent) {
        LoaderFxml loaderFxml = new LoaderFxml();
        Pane view = loaderFxml.getScene("AddGui");
        mainPane.setCenter(view);
        vbox.setVisible(true);
        BtnBurger.setVisible(true);
        for (ToggleButton btn : new ToggleButton[]{SearchMenu, AddMenu, TranslateMenu, FavouriteMenu, HistoryMenu, GameMenu}) {
            btn.getStyleClass().remove("active");
        }
        AddMenu.getStyleClass().add("active");
    }

    public void handleBtnTranslate(ActionEvent actionEvent) {
        LoaderFxml loaderFxml = new LoaderFxml();
        Pane view = loaderFxml.getScene("TranslateGui");
        mainPane.setCenter(view);
        vbox.setVisible(true);
        BtnBurger.setVisible(true);
        for (ToggleButton btn : new ToggleButton[]{SearchMenu, AddMenu, TranslateMenu, FavouriteMenu, HistoryMenu, GameMenu}) {
            btn.getStyleClass().remove("active");
        }
        TranslateMenu.getStyleClass().add("active");
    }

    public void handleBtnFavourite(ActionEvent actionEvent) {
        LoaderFxml loaderFxml = new LoaderFxml();
        Pane view = loaderFxml.getScene("FavouriteGui");
        mainPane.setCenter(view);
        vbox.setVisible(true);
        BtnBurger.setVisible(true);
        for (ToggleButton btn : new ToggleButton[]{SearchMenu, AddMenu, TranslateMenu, FavouriteMenu, HistoryMenu, GameMenu}) {
            btn.getStyleClass().remove("active");
        }
        FavouriteMenu.getStyleClass().add("active");
    }

    public void handleBtnHistory(ActionEvent actionEvent) {
        LoaderFxml loaderFxml = new LoaderFxml();
        Pane view = loaderFxml.getScene("HistoryGui");
        mainPane.setCenter(view);
        vbox.setVisible(true);
        BtnBurger.setVisible(true);
        for (ToggleButton btn : new ToggleButton[]{SearchMenu, AddMenu, TranslateMenu, FavouriteMenu, HistoryMenu, GameMenu}) {
            btn.getStyleClass().remove("active");
        }
        HistoryMenu.getStyleClass().add("active");
    }

    public void handleBtnGame(ActionEvent actionEvent) {
        vbox.setVisible(true);
        BtnBurger.setVisible(true);
        for (ToggleButton btn : new ToggleButton[]{SearchMenu, AddMenu, TranslateMenu, FavouriteMenu, HistoryMenu, GameMenu}) {
            btn.getStyleClass().remove("active");
        }
        GameMenu.getStyleClass().add("active");
    }

    public void handleBtnBurger(ActionEvent actionEvent) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.5));
        slide.setNode(vbox);
        slide.setInterpolator(Interpolator.EASE_BOTH); // Thêm dòng này

        if (vboxVisible) {
            // Thụt vào (slide in)
            slide.setToX(-70);
            slide.play();
            vbox.setTranslateX(-70);
            slide.setOnFinished(e -> {
                vbox.setVisible(false);
                vboxVisible = false;
            });
        } else {
            // Thụt ra (slide out)
            vbox.setVisible(true);

            vbox.setTranslateX(-70);
            slide.setToX(0);
            slide.play();
            slide.setOnFinished(e -> {
                vboxVisible = true;

            });
        }
    }

    public void handleCloseBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) closeBtn.getScene().getWindow();
        // Đóng sổ ứng dụng
        stage.close();
    }

    @FXML
    private void handleMinimizeBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) minimizeBtn.getScene().getWindow();
        stage.setIconified(true);
    }

}
