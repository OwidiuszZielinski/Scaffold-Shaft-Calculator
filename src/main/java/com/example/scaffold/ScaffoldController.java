package com.example.scaffold;

import com.example.scaffold.scaffold.ScaffoldShaft;
import com.example.scaffold.scaffold.ScaffoldShaftService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ScaffoldController {

    public TextField setwalla;
    public TextField setdima;
    public TextField setwallb;
    public TextField setdimb;
    public TextField resulta;
    public TextField resultb;
    public TextField freeaspace;
    public TextField freebspace;

    public Button calculatea;
    public Button calculateb;
    ScaffoldShaftService shaftService = new ScaffoldShaftService();

    @FXML
    public void onActionButton(ActionEvent eva){
        ScaffoldShaft scaffold = new ScaffoldShaft();

        scaffold.setTempa(Integer.parseInt(setwalla.getText()));
        scaffold.setTemp2a(Integer.parseInt(setdima.getText()));
        shaftService.addscaffolddimensions();
        shaftService.addscaffolddimensionsreal();
        shaftService.scaffoldasideaget(scaffold);
        resulta.setText((scaffold.getScaffloddima())+" [cm]");
        freeaspace.setText((scaffold.getFreesizea())+" [cm]");

    }
    @FXML
    public void onActionButton2(ActionEvent eva){
        ScaffoldShaft scaffold = new ScaffoldShaft();


        scaffold.setTempb(Integer.parseInt(setwallb.getText()));
        scaffold.setTemp2b(Integer.parseInt(setdimb.getText()));
        shaftService.addscaffolddimensions();
        shaftService.addscaffolddimensionsreal();
        shaftService.scaffoldasidebget(scaffold);
        resultb.setText((scaffold.getScaffloddimb())+" [cm]");
        freebspace.setText((scaffold.getFreesizeb())+" [cm]");
    }

}