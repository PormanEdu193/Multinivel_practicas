
package Controlador;

import Modelo.ComboArray;
import Modelo.InfoCombo;
import Vista.FacturaDulces;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class FacturaCon implements ActionListener{
    FacturaDulces objetoVista;
    ComboArray objetoModelo;
    InfoCombo objetoCombo;
    DefaultTableModel modelo=new DefaultTableModel();
    double descuento,total;

    public FacturaCon() {
        objetoVista = new FacturaDulces();
        objetoModelo = new ComboArray();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objetoVista.getButton()){
            objetoCombo = new InfoCombo();
            objetoCombo.setNombre(objetoVista.getComboBox().getSelectedItem().toString());
            objetoCombo.setIndece(objetoVista.getComboBox().getSelectedIndex());
            objetoCombo.setCantidad(Integer.parseInt(objetoVista.getTxtCantidad().getText()));
            modelo=(DefaultTableModel)objetoVista.getTable().getModel();
            int filas=objetoVista.getTable().getRowCount();
            
            for(int i=0;filas>i;i++){
                modelo.removeRow(0);
            }
            modelo= objetoModelo.adicionar(objetoCombo);
            objetoVista.getTable().setModel(modelo);
            objetoVista.getTxtSubtotal().setText(String.valueOf(objetoModelo.getSubtotal()));
            objetoVista.getTxtLva().setText(String.valueOf(objetoModelo.getSubtotal()*0.19));
            if(objetoModelo.getSubtotal()>=12000){
                descuento=objetoModelo.getSubtotal()*0.15;
                total=(objetoModelo.getSubtotal()+objetoModelo.getSubtotal()*0.19)-descuento;
            }
            if(objetoModelo.getSubtotal()>=6000 && objetoModelo.getSubtotal()<12000){
                descuento=objetoModelo.getSubtotal()*0.07;
                total=(objetoModelo.getSubtotal()+objetoModelo.getSubtotal()*0.19)-descuento;
            }
            if(objetoModelo.getSubtotal()<6000){
                descuento=objetoModelo.getSubtotal()*0.03;
                total=(objetoModelo.getSubtotal()+objetoModelo.getSubtotal()*0.19)-descuento;
            }
            objetoVista.getTxtNeto().setText(String.valueOf(total));
            objetoVista.getTxtDescuento().setText(String.valueOf(descuento));
            //objetoCombo.setCantidad(0);
        }
        
    }
    
}