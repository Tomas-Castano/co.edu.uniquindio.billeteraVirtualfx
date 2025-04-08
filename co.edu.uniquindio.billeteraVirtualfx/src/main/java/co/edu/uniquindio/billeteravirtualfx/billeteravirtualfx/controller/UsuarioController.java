package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.controller;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.factory.ModelFactory;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Usuario;

import java.util.Collection;
import java.util.LinkedList;

public class UsuarioController {
    static ModelFactory modelFactory;

    public UsuarioController() {
        modelFactory = ModelFactory.getInstance();
    }

    public static LinkedList<Usuario> obtenerUsuarios() {
        return modelFactory.obtenerUsuarios();
    }
}
