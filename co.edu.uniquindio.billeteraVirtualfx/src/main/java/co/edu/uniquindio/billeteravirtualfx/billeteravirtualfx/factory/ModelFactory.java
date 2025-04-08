package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.factory;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Administrador;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Usuario;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.builder.AdministradorBuilder;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.BilleteraVirtual;

import java.util.LinkedList;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private BilleteraVirtual billeteraVirtual;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public void inicializarDatos() {
        billeteraVirtual = new BilleteraVirtual();
        Administrador Juan = new AdministradorBuilder()
                .nombre("Juan")
                .correo("Juan@gmail.com")
                .contraseña("Juan123")
                .build();

    }

    public LinkedList<Usuario> obtenerUsuarios() {
        return billeteraVirtual.obtenerUsuarios();
    }

    public LinkedList<Administrador> obtenerAdministradores() {
        return billeteraVirtual.obtenerAdministradores();
    }
}
