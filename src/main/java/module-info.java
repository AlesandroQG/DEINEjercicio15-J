module com.alesandro.ejercicio15j {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alesandro.ejercicio15j to javafx.fxml;
    exports com.alesandro.ejercicio15j;
}