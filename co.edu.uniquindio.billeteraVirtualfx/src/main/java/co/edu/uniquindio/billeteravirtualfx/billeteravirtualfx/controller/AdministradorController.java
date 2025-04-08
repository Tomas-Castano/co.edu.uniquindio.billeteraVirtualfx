package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.controller;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.factory.ModelFactory;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Administrador;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Usuario;

import java.util.LinkedList;

public class AdministradorController {
    static ModelFactory modelFactory;

    public AdministradorController() {
        modelFactory = ModelFactory.getInstance();
    }

    public static LinkedList<Administrador> obtenerAdministradores() {
        return modelFactory.obtenerAdministradores();
    }
}
