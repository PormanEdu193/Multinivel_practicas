
package Controlador;

import Modelo.DatosCDT;
import Modelo.UsuarioCDT;
import Vista.FormularioCDT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class ControladorCdt implements ActionListener  {
    FormularioCDT objetoVista;
    UsuarioCDT objetoUsuario;
    DatosCDT objetoModelo;
    String identificacion,nombre,ciudad;
    int tiempo,monto,interes;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorCdt() {
        objetoVista = new FormularioCDT();
        objetoModelo = new DatosCDT();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==objetoVista.getButton()){
            identificacion = objetoVista.getTxtIdentificacion().getText();
            nombre = objetoVista.getTxtCliente().getText();
            tiempo =Integer.parseInt(String.valueOf(objetoVista.getjComboBox1().getSelectedItem()));
            monto = Integer.valueOf(objetoVista.getTxtMonto().getText());
            ciudad = objetoVista.getTxtCiudad().getText();
            DatosCDT usuario = new DatosCDT(ciudad, tiempo, monto,  identificacion,  nombre);
            
            modelo= (DefaultTableModel) objetoVista.getTable().getModel();
            int rows=objetoVista.getTable().getRowCount();
            for(int i=0;rows>i;i++){
                modelo.removeRow(0);
            }
            modelo = objetoModelo.adicionar(usuario);
            objetoVista.getTable().setModel(modelo);
            
            objetoVista.getTxtFueraMe().setText(String.valueOf(objetoModelo.getTotalCdt()));
            objetoVista.getTxtTotalCDT().setText(String.valueOf(objetoModelo.getTotalMon()));
            objetoVista.getTxtTotalInteres().setText(String.valueOf(objetoModelo.getTotalInte()));
            
       
       }
    }
    
}
