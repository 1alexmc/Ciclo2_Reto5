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
import java.awt.*;

public class Requerimiento2GUI extends JFrame {


    private JTable jtRequerimiento2;

    public Requerimiento2GUI (ArrayList<Consulta2VO_19> viviendas, ControladorRequerimientosReto4 controlador){


    setTitle("Requerimiento N°2");

    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    String [] encabezadosColumnas = {"ID Proyecto", "Área Máxima"};

    jtRequerimiento2 = new JTable (this.formatoViviendas(viviendas, encabezadosColumnas.length),encabezadosColumnas);


    JScrollPane desplazamiento = new JScrollPane(jtRequerimiento2);
    JPanel panel = new JPanel();
    panel.add(desplazamiento);
    panel.setBorder(new TitledBorder("Viviendas con dos habitaciones"));
    panel.setBackground(Color.CYAN);
    getContentPane().add(panel);
    setSize(600, 500);
    setLocationRelativeTo(null);
    setVisible(true);

    }

    public String [][] formatoViviendas(ArrayList<Consulta2VO_19> viviendas, int numeroColumnas){

        String [][] registros = new String [viviendas.size()] [numeroColumnas];

        for (int x = 0; x < registros.length; x++) {
            registros [x][0] = String.valueOf(viviendas.get(x).getIdProyecto());
            registros [x][1] = String.valueOf(viviendas.get(x).getAreaMax());
    
        }

        return registros;

    }

    


    
}
