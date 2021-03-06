package view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import layers.PresentationCtrl;

import java.net.URL;
import java.nio.file.Paths;
import javafx.stage.StageStyle;

public class Main  extends Application{

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        URL resource = getClass().getResource("/FXML/LoginView.fxml");
        System.out.print("resource: " + resource + "\n");
        loader.setLocation(resource);
        Parent root = loader.load();
        stage = primaryStage;
        stage.setTitle("Master Mind");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(root, 911, 600));
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.getIcons().addAll(new Image(getClass().getResource("/Images/icon.png").toString()));
        stage.show();
    }

    public static void changeScene(FXMLLoader Loader) {
        Parent root = Loader.getRoot();
        stage.setScene(new Scene(root, 911, 600)); 
    }


    public static void main(String[] args) {

        boolean guiMode = true;

        for (String s : args) {
            switch (s) {
                case "-h":
                    showHelp();
                    return;
                case "--help":
                    showHelp();
                    return;
                case "-cli":
                    guiMode = false;
                    break;
                default:
                    showHelpMin();
                    return;
            }
        }

        //guiMode = false;

        if (guiMode) {
            launch(args);            
        }
        else {
            PresentationCtrl pCtrl = new PresentationCtrl();
            pCtrl.startMasterMind();
        }
        Platform.exit();
    }

    private static void showHelpMin() {
        System.out.println("Argumentos invalidos, utilize -h o --help para mostrar las opciones disponibles");
    }

    private static void showHelp() {
        System.out.println("Bienvenido a MasterMind");
        System.out.println("Opciones disponibles:");
        System.out.println("         -h: muestra esta ayuda\n" +
                           "         --help: muestra esta ayuda\n" +
                           "         -cli: el juego se lanzará en la terminal\n");
        System.out.println("Gracias por jugar");
        System.out.println("Pere, Oriol, Josep");
    }
}