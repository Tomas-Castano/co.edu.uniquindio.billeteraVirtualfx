package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.viewController;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.controller.AdministradorController;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.controller.BilleteraVirtualController;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.controller.UsuarioController;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Administrador;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.BilleteraVirtual;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.LinkedList;

public class BilleteraVirtualViewController {
    BilleteraVirtualController billeteraVirtualController;
    public LinkedList<Usuario> listaUsuarios;
    public LinkedList<Administrador> listaAdministradores;

    @FXML
    private TextField TxtContrasena;

    @FXML
    private Button btnConfirmar;

    @FXML
    private TextField txtUsuario;

    public void initialize() {
        billeteraVirtualController = new BilleteraVirtualController();
        initView();
    }

    private void initView() {
        obtenerUsuarios();
        obtenerAdministradores();
    }

    private void obtenerUsuarios() {
        listaUsuarios.addAll(UsuarioController.obtenerUsuarios());
    }

    private void obtenerAdministradores() {
        listaAdministradores.addAll(AdministradorController.obtenerAdministradores());
    }
}