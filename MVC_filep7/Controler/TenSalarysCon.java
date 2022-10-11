package Controler;

import View.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Model.TenSalarys;
import Model.Workers;

public class TenSalarysCon implements ActionListener {
    form objectView;
    TenSalarys objectModelo;
    Workers objectWorkers;
    DefaultTableModel model = new DefaultTableModel();
    String name;
    int salary,count;
    public TenSalarysCon() {
        objectView = new form();
        objectModelo = new TenSalarys();
        objectView.setVisible(true);
        objectView.getButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objectView.getButton()){
            name = objectView.getTxtName().getText();
            salary = Integer.parseInt(objectView.getTxtSalary().getText());
            objectWorkers = new Workers();
            objectWorkers.setName(name);
            objectWorkers.setSalary(salary);

            model = (DefaultTableModel) objectView.getjTable1().getModel();
            int rows = objectView.getjTable1().getRowCount();

            for(int i=0;rows>i;i++){
                model.removeRow(0);
            }
            model =objectModelo.add(objectWorkers);
            objectView.getjTable1().setModel(model);
            objectView.getTxtName().setText("");
            objectView.getTxtSalary().setText("");
            objectView.getTxtName().requestFocus();
            count++;
            objectView.getLbCount().setText("Datos ingresados"+" "+count);
            if(count==10){
                JOptionPane.showMessageDialog(null,"Datos ingresados con exíto","Mensaje",1);
                objectView.getTxtHigerName().setText(objectModelo.getHigerNam());
                objectView.getTxtHigerSal().setText(String.valueOf(objectModelo.getHigerSal()));
                objectView.getTxtName().setEditable(false);
                objectView.getTxtSalary().setEditable(false);
            }
        }
    }
    
}
