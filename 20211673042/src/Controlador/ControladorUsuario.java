
package Controlador;

import Modelo.DatosUsuario;
import Modelo.Usuario;
import Vista.FormularioUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorUsuario implements ActionListener {
    String identificacion,nombre,genero,aficion;
    int edad,menor,aux;
    FormularioUsuarios objetoVista;
    Usuario objetoUsuario;
    DatosUsuario objetoModelo;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorUsuario() {
        objetoModelo = new DatosUsuario();
        objetoVista = new FormularioUsuarios();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.getButton()){
            identificacion = objetoVista.getTxtIdentificacion().getText();
            nombre = objetoVista.getTxtNombre().getText();
            genero = String.valueOf(objetoVista.getComboGenero().getSelectedItem());
            aficion = String.valueOf(objetoVista.getCombo().getSelectedItem());
            edad = Integer.parseInt(objetoVista.getTxtEdad().getText());
            DatosUsuario usuario = new DatosUsuario(genero, aficion,  identificacion,  nombre,  edad);
            
            modelo= (DefaultTableModel) objetoVista.getTable().getModel();
            int rows=objetoVista.getTable().getRowCount();
            for(int i=0;rows>i;i++){
                modelo.removeRow(0);
            }
            modelo = objetoModelo.adicionar(usuario);
            objetoVista.getTable().setModel(modelo);
            
            objetoVista.getTxtHombres().setText(String.valueOf(objetoModelo.getTotalH()));
            objetoVista.getTxtMujeres().setText(String.valueOf(objetoModelo.getTotalM()));
            objetoVista.getTxtOtras().setText(String.valueOf(objetoModelo.getTotalOtra()));
            objetoVista.getTxtAficiones().setText(String.valueOf(objetoModelo.getTotalAfi()));
            objetoVista.getTxtMenor().setText(String.valueOf(objetoModelo.getMenor()));
            
            
            
        }
    }
    
}
