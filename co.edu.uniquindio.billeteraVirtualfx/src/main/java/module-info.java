module co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx to javafx.fxml;
    exports co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx;

    opens co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.viewController;
    exports co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.viewController;

    opens co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model;
    exports co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model;

    opens co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.factory;
    exports co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.factory;
}