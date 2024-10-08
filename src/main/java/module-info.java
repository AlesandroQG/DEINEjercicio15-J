module com.alesandro.ejercicio15j {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.alesandro.ejercicio15j to javafx.fxml;
    exports com.alesandro.ejercicio15j;
}