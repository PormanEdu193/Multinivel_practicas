package Model;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class TenSalarys {
    String titles[]={"Nombre","Salario"};
    DefaultTableModel model = new DefaultTableModel(null,titles);
    ArrayList<Workers> workers;
    int higerSal;
    String higerNam;

    public TenSalarys() {
        higerSal=0;
        higerNam="";
        workers = new ArrayList();
    }

    public int getHigerSal() {
        return higerSal;
    }

    public String getHigerNam() {
        return higerNam;
    }

    public DefaultTableModel add (Workers information){
        workers.add(information);
        Object [] row = new Object[2];
        for(int i=0;i<workers.size();i++){
            row[0] = workers.get(i).getName();
            row[1] = workers.get(i).getSalary();
            model.addRow(row);
            if(workers.get(i).getSalary()>higerSal){
                higerSal= workers.get(i).getSalary();
                higerNam= workers.get(i).getName();
            }
        }
        return model;
    }

    
}
