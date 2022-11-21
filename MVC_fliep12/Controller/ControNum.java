package Controller;

import Model.FirtsNum;
import View.Form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControNum implements ActionListener{
    Form objectView;
    FirtsNum objectModel;

    public ControNum() {
        objectView = new Form();
        objectView.setVisible(true);
        objectView.getButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objectView.getButton()){
            int num = Integer.parseInt(objectView.getTxtNum().getText());
            objectModel = new FirtsNum(num, "");
            String aux = String.valueOf(num);
            if(aux.length()==1){
                objectView.getTxtResult().setText(objectModel.WriteUnits());
            }
            if(aux.length()==2){
                objectView.getTxtResult().setText(objectModel.WriteTens());
            }
            if(aux.length()==3){
                objectView.getTxtResult().setText(objectModel.WrtieHundreds());
            }
            else{
                objectView.getTxtResult().setText("El número debe ser menor a mil");
            }
        }
    }

    
}
