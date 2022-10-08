package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.lowerUpper;
import view.form;

public class controlerLowUp implements ActionListener{
    form objectView;
    lowerUpper objectModel;

    public controlerLowUp(){
        objectModel = new lowerUpper();
        objectView = new form();
        objectView.setVisible(true);
        objectView.setBounds(0,0,500,250);
        objectView.setLocationRelativeTo(null);
        objectView.getButton().addActionListener(this);
        objectView.getButtonDele().addActionListener(this);
        objectView.getTxtStr().addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyTyped(java.awt.event.KeyEvent evt){
                objectView.TxtSrtKeyTyped(evt);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == objectView.getButton()){
            objectModel.setStr(objectView.getTxtStr().getText());
            objectModel.UpperAndLower();
            objectView.getTxtResult().setText(objectModel.getResult());
            objectView.getTxtStr().requestFocus();
            objectModel.setResult("");
        }
        if(e.getSource() == objectView.getButtonDele()){
            objectView.getTxtStr().setText("");
            objectView.getTxtResult().setText("");
            objectView.getTxtStr().requestFocus();
            objectModel.setResult("");
        }
    }

    

}