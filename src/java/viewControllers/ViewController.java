package viewControllers;

import game.DiffEnum;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.StageStyle;
import layers.DomainCtrl;
import view.Main;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Optional;

public class ViewController {

    public static void newBoardView(DomainCtrl domainCtrl) throws MalformedURLException {
        Optional<DiffEnum> difficulty = askCodeBreakerDifficulty();
        if (difficulty.isPresent()) {
            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(ViewController.class.getResource("/FXML/CodeBreakerView.fxml"));
            try {
                Loader.load();
                CodeBreakerViewController codeBreakerViewController = Loader.getController();
                codeBreakerViewController.setDomainCtrl(domainCtrl);
                codeBreakerViewController.newGame(difficulty.get());
                Main.changeScene(Loader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void loadBoardView(DomainCtrl domainCtrl, int gameId) throws MalformedURLException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(ViewController.class.getResource("/FXML/CodeBreakerView.fxml"));
        try {
            Loader.load();
            CodeBreakerViewController codeBreakerViewController = Loader.getController();
            codeBreakerViewController.setDomainCtrl(domainCtrl);
            codeBreakerViewController.loadGame(gameId);
            Main.changeScene(Loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void signUpView(DomainCtrl domainCtrl) throws MalformedURLException, MalformedURLException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(ViewController.class.getResource("/FXML/SignUpView.fxml"));
        try {
            Loader.load();
            SignUpViewController signUpViewController = Loader.getController();
            signUpViewController.setDomainCtrl(domainCtrl);
            Main.changeScene(Loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loginView(DomainCtrl domainCtrl) throws MalformedURLException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(ViewController.class.getResource("/FXML/LoginView.fxml"));
        try {
            Loader.load();
            LoginViewController loginViewController = Loader.getController();
            loginViewController.setDomainCtrl(domainCtrl);
            Main.changeScene(Loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void resetPasswordView(DomainCtrl domainCtrl) throws MalformedURLException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(ViewController.class.getResource("/FXML/ResetPasswordView.fxml"));
        try {
            Loader.load();
            ResetPasswordViewController resetPasswordViewController = Loader.getController();
            resetPasswordViewController.setDomainCtrl(domainCtrl);
            Main.changeScene(Loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mainMenuView(DomainCtrl domainCtrl) throws MalformedURLException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(ViewController.class.getResource("/FXML/MainMenuView.fxml"));
        try {
            Loader.load();
            MainMenuViewController mainMenuViewController = Loader.getController();
            mainMenuViewController.setDomainCtrl(domainCtrl);
            Main.changeScene(Loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void rankingsView(DomainCtrl domainCtrl) throws MalformedURLException {
        Optional<DiffEnum> difficulty = askCodeBreakerDifficulty();
        if (difficulty.isPresent()) {
            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(ViewController.class.getResource("/FXML/RankingView.fxml"));
            try {
                Loader.load();
                RankingViewController rankingViewController = Loader.getController();
                rankingViewController.setDomainCtrl(domainCtrl);
                rankingViewController.buildRankingsGridPane(difficulty.get());
                Main.changeScene(Loader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void recordsView(DomainCtrl domainCtrl) throws MalformedURLException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(ViewController.class.getResource("/FXML/RecordView.fxml"));
        try {
            Loader.load();
            RecordViewController recordViewController = Loader.getController();
            recordViewController.setDomainCtrl(domainCtrl);
            Main.changeScene(Loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void userView(DomainCtrl domainCtrl) throws MalformedURLException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(ViewController.class.getResource("/FXML/UserView.fxml"));
        try {
            Loader.load();
            UserViewController userViewController = Loader.getController();
            userViewController.setDomainCtrl(domainCtrl);
            Main.changeScene(Loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void settingsView(DomainCtrl domainCtrl) throws MalformedURLException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(ViewController.class.getResource("/FXML/SettingsView.fxml"));
        try {
            Loader.load();
            SettingsViewController settingsViewController = Loader.getController();
            settingsViewController.setDomainCtrl(domainCtrl);
            Main.changeScene(Loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void codeMakerView(DomainCtrl domainCtrl) throws MalformedURLException {
        Optional<DiffEnum> difficulty = askCodeMakerDifficulty();
        if (difficulty.isPresent()) {
            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(ViewController.class.getResource("/FXML/CodeMakerView.fxml"));
            try {
                Loader.load();
                CodeMakerViewController codeMakerViewController = Loader.getController();
                codeMakerViewController.setDomainCtrl(domainCtrl);
                codeMakerViewController.newGame(difficulty.get());
                Main.changeScene(Loader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void loadGameView(DomainCtrl domainCtrl) throws MalformedURLException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(ViewController.class.getResource("/FXML/LoadGameView.fxml"));
        try {
            Loader.load();
            LoadGameViewController loadGameViewController = Loader.getController();
            loadGameViewController.setDomainCtrl(domainCtrl);
            Main.changeScene(Loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Optional<DiffEnum> askCodeBreakerDifficulty() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initStyle(StageStyle.UNDECORATED);
        alert.setTitle("Seleccion de nivel");
        alert.setHeaderText(null);
        alert.setContentText("Selecciona un nivel");

        ButtonType easy = new ButtonType("Fácil");
        ButtonType original = new ButtonType("Original");
        ButtonType hard = new ButtonType("Dificil");
        ButtonType cancel = new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(easy, original, hard, cancel);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == easy) return Optional.of(DiffEnum.EASY);
        else if (result.get() == original) return Optional.of(DiffEnum.ORIGINAL);
        else if (result.get() == hard) return Optional.of(DiffEnum.HARD);
        else return Optional.empty();
    }

    public static Optional<DiffEnum> askCodeMakerDifficulty() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initStyle(StageStyle.UNDECORATED);
        alert.setTitle("Seleccion de nivel");
        alert.setHeaderText(null);
        alert.setContentText("Selecciona un nivel");

        ButtonType original = new ButtonType("Original");
        ButtonType hard = new ButtonType("Dificil");
        ButtonType cancel = new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(original, hard, cancel);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == original) return Optional.of(DiffEnum.ORIGINAL);
        else if (result.get() == hard) return Optional.of(DiffEnum.HARD);
        else return Optional.empty();
    }

    public static void showErrorMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initStyle(StageStyle.UNDECORATED);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void showInformationMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initStyle(StageStyle.UNDECORATED);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
