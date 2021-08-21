package view;

import controller.ControladorRequerimientosReto4;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.awt.*;


public class Requerimiento1GUI extends JFrame {

    private JTable jtRequerimiento1;

    public Requerimiento1GUI (ArrayList<Consulta1VO_19> idproyec, ControladorRequerimientosReto4 controlador){

    setTitle("Requerimiento N°1");

    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    String [] encabezadosColumnas = {"ID Proyecto", "Fecha Inicio", "Constructora","Serial"};

    jtRequerimiento1 = new JTable (this.formatoId (idproyec, encabezadosColumnas.length),encabezadosColumnas);


    JScrollPane desplazamiento = new JScrollPane(jtRequerimiento1);
    JPanel panel = new JPanel();
    panel.add(desplazamiento);
    panel.setBorder(new TitledBorder("Proyectos generados con ID menor a 15"));
    panel.setBackground(Color.CYAN);
    getContentPane().add(panel);
    setSize(600, 310);
    setLocationRelativeTo(null);
    setVisible(true);

    }

    public String [][] formatoId (ArrayList<Consulta1VO_19> idproyec, int numeroColumnas){

        String [][] registros = new String [idproyec.size()] [numeroColumnas];

        for (int x = 0; x < registros.length; x++) {
            registros [x][0] = String.valueOf(idproyec.get(x).getIdProyecto());
            registros [x][1] = idproyec.get(x).getFechaInicio();
            registros [x][2] = idproyec.get(x).getConstrutora();
            registros [x][3] = idproyec.get(x).getSerial();
            
        }

        return registros;

    }

    




    
}
