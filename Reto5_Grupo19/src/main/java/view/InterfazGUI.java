package view;

import controller.ControladorRequerimientosReto4;
import model.vo.*;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Image;
import java.awt.*;


public class InterfazGUI extends JFrame {

    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;

    public void diseñarGUI(){

        setTitle("Formato consulta base de datos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
    ImageIcon grafico = new ImageIcon("iconos/ingreso.png");
    Image img1 = grafico.getImage();
    grafico = new ImageIcon(img1.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));  
    boton1 = new JButton(grafico);
    boton1.setFont(new Font ("Calibri",Font.ROMAN_BASELINE,40));
    boton1.setBackground(Color.green);
    boton1.addActionListener(controlador);
    boton1.setActionCommand("Requerimiento1");
    boton1.setText("Proyectos");

    
    boton2 = new JButton(grafico);
    boton2.setFont(new Font ("Calibri",Font.ROMAN_BASELINE,40));
    boton2.setBackground(Color.green);
    boton2.addActionListener(controlador);
    boton2.setActionCommand("Requerimiento2");
    boton2.setText("Construcción");

    boton3 = new JButton(grafico);
    boton3.setFont(new Font ("Calibri",Font.ROMAN_BASELINE,40));
    boton3.setBackground(Color.green);
    boton3.addActionListener(controlador);
    boton3.setActionCommand("Requerimiento3");
    boton3.setText("Proyectos de Bancolombia");

    JPanel listado = new JPanel();
    listado.setBackground(Color.LIGHT_GRAY);
    listado.add(boton1);
    listado.add(boton2);
    listado.add(boton3);
    
    getContentPane().add(listado);
    
    // establecimiento de propiedades en el Frame

    setSize(600, 350);
    setLocationRelativeTo(null);
    setVisible(true);


    }


    public static void consulta1(){
        System.out.println("-----Consulta 1-------"); 
        try{

            ArrayList<Consulta1VO_19> lista = controlador.realizarConsulta1();

            //Encabezado del resultado

            System.out.println("id_proyecto, Fecha_Inicio , Constructora , serial");
            
            //Cada VO cargado, mostrarlo en la vista

            for (Consulta1VO_19 consulta1vo_19 : lista){

                System.out.printf("%d" +" "+"%s"+ " " +"%s" + " " + "%s" +"%n",
                consulta1vo_19.getIdProyecto(),
                consulta1vo_19.getFechaInicio(),
                consulta1vo_19.getConstrutora(),
                consulta1vo_19.getSerial()
                );

            }
            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }

   public static void consulta2(){
       System.out.println("-----Consulta 2-------"); 
       try{

          ArrayList<Consulta2VO_19> lista = controlador.realizarConsulta2();

            //Encabezado del resultado

            System.out.println("id_proyecto, area_max");
            
            
            //Cada VO cargado, mostrarlo en la vista

            for (Consulta2VO_19 consulta2vo_19 : lista){

                System.out.printf("%d" +" "+"%d"+ "%n",
                consulta2vo_19.getIdProyecto(),
                consulta2vo_19.getAreaMax()
                );

            }

            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }


   public static void consulta3(){
        System.out.println("-----Consulta 3-------"); 
        try{

            ArrayList<Consulta3VO_19> lista = controlador.realizarConsulta3();

            //Encabezado del resultado

            System.out.println("id_proyecto, nombreapellido");
            
            //Cada VO cargado, mostrarlo en la vista

            for (Consulta3VO_19 consulta3vo_19 : lista){

                System.out.printf("%d" +" "+"%s"+ "%n",
                consulta3vo_19.getIdProyecto(),
                consulta3vo_19.getNombreApellido()
                );

            }

            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
       }      
    }

    }


    

    

