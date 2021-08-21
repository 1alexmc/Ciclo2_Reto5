package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

import javax.swing.JButton;

//Modelos (acceso y objetos contenedores)
import model.dao.*;
import model.vo.*;

//Librerías para bases de datos
import java.sql.SQLException;
import view.VistaRequerimientosReto4;
import view.InterfazGUI;
import view.Requerimiento1GUI;
import view.Requerimiento2GUI;
import view.Requerimiento3GUI;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class ControladorRequerimientosReto4 implements ActionListener {       

    private final Consulta1_19Dao consulta1_19Dao;
    private final Consulta2_19Dao consulta2_19Dao;
    private final Consulta3_19Dao consulta3_19Dao;
    private final InterfazGUI interfazGUI;
    private final VistaRequerimientosReto4 vistaRequerimientosReto4;
    private Requerimiento1GUI requerimiento1gui;
    private Requerimiento2GUI requerimiento2gui;
    private Requerimiento3GUI requerimiento3gui;

    public ControladorRequerimientosReto4(){
        this.consulta1_19Dao = new Consulta1_19Dao();
        this.consulta2_19Dao = new Consulta2_19Dao();
        this.consulta3_19Dao = new Consulta3_19Dao();
        this.interfazGUI = new InterfazGUI();
        this.vistaRequerimientosReto4 = new VistaRequerimientosReto4();
        

    }

    public ArrayList <Consulta1VO_19> realizarConsulta1 () throws SQLException{

        return this.consulta1_19Dao.consulta1DAO();

    }
    
    
   
    public ArrayList <Consulta2VO_19> realizarConsulta2 () throws SQLException {
        return this.consulta2_19Dao.consulta2DAO();
    }

   

    public ArrayList <Consulta3VO_19> realizarConsulta3 () throws SQLException {
        return this.consulta3_19Dao.consulta3DAO();

    }

    public void ejecutarAplicacion(){
        this.interfazGUI.diseñarGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
       String actionComand =  ((JButton)e.getSource()).getActionCommand();
       switch (actionComand){
           case "Requerimiento1" :

           try{

            this.requerimiento1gui  = new Requerimiento1GUI(this.realizarConsulta1(),this);


           }catch (SQLException excepcion){
               System.err.println(excepcion);

           }

           break;

           case "Requerimiento2":

           try{

            this.requerimiento2gui  = new Requerimiento2GUI(this.realizarConsulta2(),this);


           }catch (SQLException excepcion){
               System.err.println(excepcion);

           }
           
           break;

           case "Requerimiento3":
           try{

            this.requerimiento3gui  = new Requerimiento3GUI(this.realizarConsulta3(),this);


           }catch (SQLException excepcion){
               System.err.println(excepcion);

           }
           break;
       }
        
    }

    
}
