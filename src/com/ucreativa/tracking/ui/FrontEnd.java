package com.ucreativa.tracking.ui;

import com.ucreativa.tracking.repositories.FileRepository;
import com.ucreativa.tracking.service.TrackingService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo){
        super(titulo);
    }

    public void build(){
        this.constructorPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void constructorPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(6, 3));
    }
    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
    }

    private void crearComponentes(){

        //Crear Lables
        JLabel lblMeta = new JLabel("Meta");
        JLabel lblPrioridad = new JLabel("Prioridad");
        JLabel lblDuracion = new JLabel("Duracion");
        JLabel lblAnimo = new JLabel("Ánimo");
        JLabel lblEsEstudio = new JLabel("Es Estudio?");
        JLabel lblMateria = new JLabel("Materia");
        JLabel lblTarea = new JLabel("Tarea");
        JLabel lblEjercicio = new JLabel("Ejercicio");
        JLabel lblHogar = new JLabel("Hogar");
        JLabel lblRealizado = new JLabel("Realizado");

        //Crear textos
        JTextField txtMeta = new JTextField();
        JTextField txtPrioridad = new JTextField();
        JTextField txtDuracion = new JTextField();
        JTextField txtAnimo = new JTextField();
        JTextField txtMateria = new JTextField();
        JTextField txtTarea = new JTextField();
        JTextField txtEjercicio = new JTextField();
        JTextField txtHogar = new JTextField();

        JCheckBox txtRealizado = new JCheckBox();
        JCheckBox txtEsEstudio = new JCheckBox();
        txtEsEstudio.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblEjercicio.setVisible(!txtEsEstudio.isSelected());
                txtEjercicio.setVisible(!txtEsEstudio.isSelected());
                lblHogar.setVisible(!txtEsEstudio.isSelected());
                txtHogar.setVisible(!txtEsEstudio.isSelected());
                lblMateria.setVisible(txtEsEstudio.isSelected());
                txtMateria.setVisible(txtEsEstudio.isSelected());
                lblTarea.setVisible(txtEsEstudio.isSelected());
                txtTarea.setVisible(txtEsEstudio.isSelected());
            }
        });

        JButton salvar = new JButton("Salvar");
        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrackingService service = new TrackingService(new FileRepository());
                service.save(txtMeta.getText(),
                        txtPrioridad.getText(),
                        txtDuracion.getText(),
                        txtAnimo.getText(),
                        txtEsEstudio.isSelected(),
                        txtMateria.getText(),
                        txtTarea.getText(),
                        txtEjercicio.getText(),
                        txtHogar.getText(),
                        txtRealizado.isSelected());

                txtMeta.setText("");
                txtPrioridad.setText("");
                txtDuracion.setText("");
                txtAnimo.setText("");
                txtEsEstudio.setText("");
                txtMateria.setText("");
                txtTarea.setText("");
                txtEjercicio.setText("");
                txtHogar.setText("");
                txtRealizado.setText("");

                //Mostrar pop up en la pantalla de los resultados
                String reporte = String.join("\n",service.get());
                JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), reporte);
            }
        });

        //Agregamos al UI
        this.agregarComponente(lblMeta);
        this.agregarComponente(txtMeta);
        this.agregarComponente(lblAnimo);
        this.agregarComponente(txtAnimo);
        this.agregarComponente(lblPrioridad);
        this.agregarComponente(txtPrioridad);
        this.agregarComponente(lblDuracion);
        this.agregarComponente(txtDuracion);
        this.agregarComponente(lblEsEstudio);
        this.agregarComponente(txtEsEstudio);
        this.agregarComponente(lblMateria);
        this.agregarComponente(txtMateria);
        this.agregarComponente(lblTarea);
        this.agregarComponente(txtTarea);
        this.agregarComponente(lblEjercicio);
        this.agregarComponente(txtEjercicio);
        this.agregarComponente(lblHogar);
        this.agregarComponente(txtHogar);
        this.agregarComponente(lblRealizado);
        this.agregarComponente(txtRealizado);
        this.agregarComponente(salvar);
    }

}