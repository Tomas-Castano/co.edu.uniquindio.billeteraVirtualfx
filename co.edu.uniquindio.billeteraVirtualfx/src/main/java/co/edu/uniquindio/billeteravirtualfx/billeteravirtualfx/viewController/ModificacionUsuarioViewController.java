package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ModificacionUsuarioViewController {

    @FXML
    private TableColumn<?, ?> tcbCorreo;

    @FXML
    private TableView<?> tcbNombre;

    @FXML
    private TableColumn<?, ?> tcbNumeroTelefono;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNumeroTelefono;

}
