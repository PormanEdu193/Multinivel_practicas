package Controler;

import Model.multiple;
import View.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controlerMul implements ActionListener{
    form objetoView;
    multiple objetoModel;
    public controlerMul() {
        objetoView = new form();
        objetoModel = new multiple();
        objetoView.setVisible(true);
        objetoView.setBounds(0,0,370,325);
        objetoView.setLocationRelativeTo(null);
        objetoView.getButton().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == objetoView.getButton()){
            objetoModel.setNum1(Integer.parseInt(objetoView.getTxtnum1().getText()));
            objetoModel.setNum2(Integer.parseInt(objetoView.getTxtnum2().getText()));
            objetoModel.IsMultiple();
            objetoView.getTxtMulti().setText(objetoModel.getMulti());
            objetoModel.setMulti("");
            objetoView.getTxtnum1().requestFocus();
        }
        
    }
    
}