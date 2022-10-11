package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import Model.tenNumbersShow;
import View.form;

public class tenNumbersCon implements ActionListener {
    form objectView;
    tenNumbersShow objectModel;
    int count=0;
    String numbers[]=new String [10];

    public tenNumbersCon() {
        objectView = new form();
        objectModel= new tenNumbersShow();
        objectView.setVisible(true);
        objectView.getTxtNum().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objectView.getTxtNum()){
                numbers [count]=objectView.getTxtNum().getText();
                objectView.getTxtNum().setText("");
                objectView.getTxtNum().requestFocus();
                count++;
            if(count==10){
                JOptionPane.showMessageDialog(null, "Numeros guardados con exíto","Mensage",1 );
                objectView.getTxtNum().setEditable(false);
                objectView.getTxtResult().setText(objectModel.Show(numbers));
                objectView.getTxtNum().setText("");
            }
        }
        
    }
    
}
