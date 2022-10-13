
package Controlador;

import Modelo.ParcialMo;
import Vista.Parcial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

public class ParcialCon implements ActionListener {
    Parcial objetoVista;
    ParcialMo objetoModelo;
    DefaultListModel modelo1 = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();


    public ParcialCon() {
        objetoVista = new Parcial();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objetoVista.getButton()){
           objetoModelo=new ParcialMo();
            objetoModelo.setOracion(objetoVista.getTxtOracion().getText());
            modelo1.clear();
            modelo1 = objetoModelo.invertidas();
            modelo2.clear();
            modelo2 = objetoModelo.contieneI();
            objetoVista.getLsInvertida().setModel(modelo1);
            objetoVista.getLsContiene().setModel(modelo2);
        }
    }
    
}
