package Controler;

import Model.stringSpace;
import View.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controlerSp implements ActionListener{
    form objectView;
    stringSpace objectModel;

    public controlerSp() {
        objectView = new form();
        objectModel = new stringSpace();
        objectView.setVisible(true);
        objectView.setBounds(0,0,500,280);
        objectView.setLocationRelativeTo(null);
        objectView.getButton().addActionListener(this);
        objectView.getButtonDele().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == objectView.getButton()){
            objectModel.setStr(objectView.getTxtStr().getText());
            objectModel.Space();
            objectView.getTxtResult().setText(objectModel.getStrResult());
            objectModel.setStrResult("");
            objectView.getTxtStr().requestFocus();
        }
        if(e.getSource() == objectView.getButtonDele()){
            objectView.getTxtResult().setText("");
            objectView.getTxtStr().setText("");
            objectModel.setStrResult("");
            objectView.getTxtStr().requestFocus();
        }
        
    }

    
}