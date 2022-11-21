package Controller;

import Model.Rectangle;
import View.Form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FigController implements ActionListener{
    Form objectView ;
    Rectangle objectFig;
    public FigController() {
        objectView = new Form();
        objectView.setVisible(true);
        objectView.getButton().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objectView.getButton()){
            Float large,width;
            large = Float.parseFloat(objectView.getTxtLarge().getText());
            width = Float.parseFloat(objectView.getTxtwidth().getText());
            objectFig = new Rectangle(large, width);
            objectFig.Perimeter();
            objectFig.Area();
            if(objectFig.getError().equals("")){
                objectView.getTxtArea().setText(String.valueOf(objectFig.Area()));
                objectView.getTxtPerimeter().setText(String.valueOf(objectFig.Perimeter()));
            }
            else{
                objectView.getTxtArea().setText(objectFig.getError());
                objectView.getTxtPerimeter().setText(objectFig.getError());
                objectView.getTxtLarge().setText("");
                objectView.getTxtwidth().setText("");
                objectView.getTxtLarge().requestFocus();
            }
        }
        
    }
    
}