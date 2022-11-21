package Controller;

import View.Form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import Model.Info;
import Model.SaleSeller;

public class ControllerComi implements ActionListener {
    Form objectView;
    Info objectInfo;
    DefaultTableModel model=new DefaultTableModel();
    SaleSeller objectSales;
    String name,id;
    int sale=0;

    public ControllerComi() {
        objectView = new Form();
        objectInfo = new Info();
        objectView.setVisible(true);
        objectView.getButton().addActionListener(this);
        objectView.getButtonSale().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objectView.getButtonSale()){
            name=objectView.getTxtName().getText();
            id= objectView.getTxtId().getText();
            switch(objectView.getComboItems().getSelectedIndex()){
                case 0:
                    sale += 400*Integer.parseInt(objectView.getTxtAmount().getText());
                    break;
                case 1:
                    sale += 800*Integer.parseInt(objectView.getTxtAmount().getText());
                    break;
                case 2:
                    sale += 1000*Integer.parseInt(objectView.getTxtAmount().getText());
                    break;
                case 3:
                    sale += 460*Integer.parseInt(objectView.getTxtAmount().getText());
                    break;
                case 4:
                    sale += 753*Integer.parseInt(objectView.getTxtAmount().getText());
                    break;
            }
            objectSales = new SaleSeller(name, id,sale);
            objectSales.CalculateCommission();
        }
        if(e.getSource()==objectView.getButton()){
            model= (DefaultTableModel) objectView.getTable().getModel();
            int rows=objectView.getTable().getRowCount();
            for(int i=0;rows>i;i++){
                model.removeRow(0);
            }
            model = objectInfo.adition(objectSales);
            objectView.getTable().setModel(model);
            name="";
            id="";
            sale=0;
        }
    }
    
}
