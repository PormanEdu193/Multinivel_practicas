
package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ComboArray {
    String titulos[] = {"Producto","Cantidad","Valor Unitario","Precio Venta"};
    int subtotal,count=0;
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    ArrayList<InfoCombo> info;

    public ComboArray() {
        info = new ArrayList();
    }

    public int getSubtotal() {
        return subtotal;
    }
    

    public DefaultTableModel adicionar(InfoCombo objN){
        info.add(objN);
        Object[] filas = new Object[4]; 
        for(int i=0;i<info.size();i++){
            switch(info.get(i).getIndice()){
                case 0:
                    info.get(i).setPrecio(3000);
                    break;
                case 1:
                    info.get(i).setPrecio(800);
                    break;
                case 2:
                    info.get(i).setPrecio(500);
                    break;
                case 3:
                    info.get(i).setPrecio(400);
                    break;
                case 4:
                    info.get(i).setPrecio(4000);
                    break;
                case 5:
                    info.get(i).setPrecio(1000);
                    break;
            }
                filas[0]=info.get(i).getNombre();
                filas[1]=info.get(i).getCantidad();
                filas[2]=info.get(i).getPrecio();
                filas[3]=(info.get(i).getPrecio()*info.get(i).getCantidad());
                modelo.addRow(filas);
        }
        subtotal=subtotal+(info.get(count).getPrecio()*info.get(count).getCantidad());
        count++;
        return modelo;
    }
}