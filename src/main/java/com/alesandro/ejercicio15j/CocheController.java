package com.alesandro.ejercicio15j;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.net.URL;
import java.util.ResourceBundle;

/**
 * Clase que controla los eventos de la ventana
 */
public class CocheController implements Initializable {
    @FXML // fx:id="btnLuz"
    private Button btnLuz; // Value injected by FXMLLoader

    @FXML // fx:id="colorBlazingRed"
    private ToggleButton colorBlazingRed; // Value injected by FXMLLoader

    @FXML // fx:id="colorElectricBlue"
    private ToggleButton colorElectricBlue; // Value injected by FXMLLoader

    @FXML // fx:id="colorLapisluxuryBlue"
    private ToggleButton colorLapisluxuryBlue; // Value injected by FXMLLoader

    @FXML // fx:id="colorMidnightBlack"
    private ToggleButton colorMidnightBlack; // Value injected by FXMLLoader

    @FXML // fx:id="colorMoonwalkGrey"
    private ToggleButton colorMoonwalkGrey; // Value injected by FXMLLoader

    @FXML // fx:id="colorPepperWhite"
    private ToggleButton colorPepperWhite; // Value injected by FXMLLoader

    @FXML // fx:id="colorThunderGray"
    private ToggleButton colorThunderGray; // Value injected by FXMLLoader

    @FXML // fx:id="colorVolcaninOrange"
    private ToggleButton colorVolcaninOrange; // Value injected by FXMLLoader

    @FXML // fx:id="imagen"
    private ImageView imagen; // Value injected by FXMLLoader

    @FXML // fx:id="imagenLuz"
    private ImageView imagenLuz; // Value injected by FXMLLoader

    @FXML // fx:id="luzImagen"
    private ImageView luzImagen; // Value injected by FXMLLoader

    @FXML // fx:id="toggleColor"
    private ToggleGroup toggleColor; // Value injected by FXMLLoader

    private boolean luces;

    /**
     * Función que se ejecuta cuando se inicia la ventana. Configura la variable "luces" y el listener de los colores
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        luces = false;
        toggleColor.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                ToggleButton selectedButton = (ToggleButton) newValue;
                String image = "";
                if (selectedButton.equals(colorBlazingRed)) {
                    image = "BlazingRed";
                } else if (selectedButton.equals(colorElectricBlue)) {
                    image = "ElectricBlue";
                } else if (selectedButton.equals(colorLapisluxuryBlue)) {
                    image = "LapisluxuryBlue";
                } else if (selectedButton.equals(colorMidnightBlack)) {
                    image = "MidnightBlack";
                } else if (selectedButton.equals(colorMoonwalkGrey)) {
                    image = "MoonwalkGrey";
                } else if (selectedButton.equals(colorPepperWhite)) {
                    image = "PepperWhite";
                } else if (selectedButton.equals(colorThunderGray)) {
                    image = "ThunderGray";
                } else if (selectedButton.equals(colorVolcaninOrange)) {
                    image = "VolcaninOrange";
                }
                Image img = new Image(getClass().getResourceAsStream("/imagenes/coches/mini" + image + ".png"));
                imagen.setImage(img);
            }
        });
    }

    /**
     * Función que controla las luces del coche
     *
     * @param event
     */
    @FXML
    public void luces(ActionEvent event) {
        Image img = null;
        if (luces) {
            // Apagar luces
            img = new Image(getClass().getResourceAsStream("/imagenes/lucesOff.png"));
            luces = false;
        } else {
            // Encender luces
            img = new Image(getClass().getResourceAsStream("/imagenes/lucesOn.png"));
            luces = true;
        }
        imagenLuz.setImage(img);
        luzImagen.setVisible(luces);
    }

}
