package com.example.scaffold;

import com.example.scaffold.scaffold.ScaffoldShaft;
import com.example.scaffold.scaffold.ScaffoldShaftService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ScaffoldController {

    public TextField setwalla;
    public TextField setwallb;
    public TextField setfreewallb;
    public TextField setfreewalla;
    public TextField resulta;
    public TextField resultb;
    public TextField freeaspace;
    public TextField freebspace;


    ScaffoldShaftService shaftService = new ScaffoldShaftService();

    @FXML
    public void onActionButton(ActionEvent eva){
        ScaffoldShaft scaffold = new ScaffoldShaft();

        scaffold.setDeclaredwalla(Integer.parseInt(setwalla.getText()));
        scaffold.setDeclaredfreespacewalla(Integer.parseInt(setfreewalla.getText()));
        shaftService.addscaffolddimensions();
        shaftService.addscaffolddimensionsreal();
        shaftService.scaffoldasideaget(scaffold);
        resulta.setText((scaffold.getResulta())+" cm");
        freeaspace.setText(Integer.toString(scaffold.getFreespacea())+" [cm]");

    }
    @FXML
    public void onActionButton2(ActionEvent eva){
        ScaffoldShaft scaffold = new ScaffoldShaft();


        scaffold.setDeclaredwallb(Integer.parseInt(setwallb.getText()));
        scaffold.setDeclaredfreespacewallb(Integer.parseInt(setfreewallb.getText()));
        shaftService.addscaffolddimensions();
        shaftService.addscaffolddimensionsreal();
        shaftService.scaffoldasidebget(scaffold);
        resultb.setText((scaffold.getResultb())+" cm");
        freebspace.setText(Integer.toString(scaffold.getFreespaceb())+" [cm]");
    }

}