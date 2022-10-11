package Controler;

import View.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.tenNumbers;

public class tenNumbersCon implements ActionListener {
    form objectView;
    tenNumbers objectModel;
    int count=0;
    int numbers[]=new int [10];

    public tenNumbersCon() {
        objectView = new form();
        objectModel= new tenNumbers();
        objectView.setVisible(true);
        objectView.getTxtNum().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objectView.getTxtNum()){
                numbers [count]=Integer.parseInt(objectView.getTxtNum().getText());
                objectView.getTxtNum().setText("");
                objectView.getTxtNum().requestFocus();
                count++;
            if(count==10){
                JOptionPane.showMessageDialog(null,"Numeros guardados con exíto","Mensaje",1);
                objectView.getTxtNum().setEditable(false);
                objectView.getTxtHiger().setText(String.valueOf(objectModel.Higer(numbers)));
                objectView.getTxtLower().setText(String.valueOf(objectModel.Lower(numbers)));
                objectView.getTxtPairs().setText(objectModel.Pairs(numbers));
                objectView.getTxtNum().setText("");
            }
        }
        
    }
    
}
