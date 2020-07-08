/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Practicante;

import java.fxml.FXML;
import java.util
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.utils.*;
import java.fxml.*;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MenuConsultarAvanceController implements Initializable {

    @FXML
    private Label labelProgreso;
    @FXML
    private Button botonRegresar;
    @FXML
    private Label labelNombreProyecto;
    @FXML
    private Label labelSetNombreProyecto;
    @FXML
    private Label labelHorasRegistradas;
    @FXML
    private Label labelSetHorasRegistradas;
    @FXML
    private Label labelTotalHoras;
    @FXML
    private Label label200;
    @FXML
    private TableView<?> tablaReportesEntregados;
    @FXML
    private TableColumn<?, ?> columnaNombreReporte;
    @FXML
    private TableColumn<?, ?> comlumnaFechaEntrega;
    @FXML
    private TableColumn<?, ?> ColumnaHorasCubiertas;
    @FXML
    private Label labelSetAvance;
    @FXML
    private Label labelAvance;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void regresar(ActionEvent event) {
        //Prueba 5 para ver que hace
        System.out.println("OTRO COMENTARIO 7:01");
        System.out.println("Prueba 3");
        System.out.println("BY GERARDO");
        System.out.println("by pale");
        System.out.println("Modifico el mensaje jeje");//Atte Pale
        System.out.println("Hola jaja");
        //jnh
        //BKSHJCBHKASBHK
        //HOLAAAA
        //JAJA SHOLO L
    }
    
}
