package Model;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;


public class Info {

    String titles[]={"Nombre","Identificación","Ventas del mes","Comisión"};
    DefaultTableModel model = new DefaultTableModel(null,titles);
    ArrayList<SaleSeller> info;

    public Info() {
        info = new ArrayList();
    }
    public DefaultTableModel adition(SaleSeller obj){ 
        info.add(obj);
        Object[] rows = new Object[4];
        for(int i=0;i<info.size();i++){
            rows[0]=info.get(i).getName();
            rows[1]=info.get(i).getId();
            rows[2]=info.get(i).getSale();
            rows[3]=info.get(i).getCommission();
            model.addRow(rows);
        }
        return model;
    }
}
