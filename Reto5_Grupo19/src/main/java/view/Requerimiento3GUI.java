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

public class Requerimiento3GUI extends JFrame {

    private JTable jtRequerimiento3;

    public Requerimiento3GUI (ArrayList<Consulta3VO_19> proyectosB, ControladorRequerimientosReto4 controlador){

    setTitle("Requerimiento N°3");

    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    String [] encabezadosColumnas = {"Identificación Proyecto", "Nombre del Líder"};

    jtRequerimiento3 = new JTable (this.formatoProyectosB(proyectosB, encabezadosColumnas.length),encabezadosColumnas);


    JScrollPane desplazamiento = new JScrollPane(jtRequerimiento3);
    JPanel panel = new JPanel();
    panel.add(desplazamiento);
    panel.setBorder(new TitledBorder("Proyectos de Bancolombia"));
    panel.setBackground(Color.CYAN);
    getContentPane().add(panel);
    setSize(600, 500);
    setLocationRelativeTo(null);
    setVisible(true);

    }

    public String [][] formatoProyectosB (ArrayList<Consulta3VO_19> proyectosB, int numeroColumnas){

        String [][] registros = new String [proyectosB.size()] [numeroColumnas];

        for (int x = 0; x < registros.length; x++) {
            registros [x][0] = String.valueOf(proyectosB.get(x).getIdProyecto());
            registros [x][1] = proyectosB.get(x).getNombreApellido();
    
        }

        return registros;

    }

    


    
}
