package sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    
}

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Sign Up");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


        public Signup() {
            initComponents();
        }

        @SuppressWarnings("Incorrecto")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

            String nombre = nombretexto.getText().toString();
            String apellido = apellidotexto.getText().toString();
            String conraseña= contraseñatexto.getText().toString();
            String confirmar = confirmartexto.getText().toString();
            String email = emailtexto.getText().toString();

            if(nombre.equals("")||apellido.equals("")||contraseña.equals("")||confirmar.equals("")||email.equals(""))
            {
                Toast.makeText(getApplicationContext(), "Porfavor llene los espacios", Toast.LENGTH_LONG).show();
                return;

}
