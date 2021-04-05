
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class VistaController implements Initializable {

    @FXML
    private Button BtnSi;
    @FXML
    private Button BntNo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }    

    @FXML
    private void BtnSi(ActionEvent event) {
        Alert mensaje = new Alert(Alert.AlertType.INFORMATION);
        mensaje.setTitle("Te amo");
        mensaje.setHeaderText(null);
        mensaje.setContentText("Sabia que dirias que si :´)");
        mensaje.showAndWait();
    }

    @FXML
    private void BtnNo(ActionEvent event) {
        BntNo.setTranslateX(ThreadLocalRandom.current().nextDouble(250));
        BntNo.setTranslateY(ThreadLocalRandom.current().nextDouble(250));
    }
    
}
