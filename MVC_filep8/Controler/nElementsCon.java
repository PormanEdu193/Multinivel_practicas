package Controler;

import Model.nElemenst;
import View.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class nElementsCon implements ActionListener{
    form objectView;
    nElemenst objectModel;
    ArrayList <Integer>numbers;
    public nElementsCon() {
        objectModel = new  nElemenst();
        objectView = new form();
        numbers = new ArrayList<Integer>();
        objectView.setVisible(true);
        objectView.getButton().addActionListener(this);
        objectView.getButtonDel().addActionListener(this);
        objectView.getTxtNum().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objectView.getTxtNum()){
            numbers.add(Integer.parseInt(objectView.getTxtNum().getText()));
            objectView.getTxtNum().setText("");
        }
        if(e.getSource()== objectView.getButton()){
            objectModel.Higer(numbers);
            objectView.getTxtHiger().setText(String.valueOf(objectModel.getLower()));
            objectView.getTxtRepeats().setText(String.valueOf(objectModel.getCount()));
            objectView.getTxtNum().setEditable(false);
            objectView.getTxtNum().setText("");
        }
        if(e.getSource()== objectView.getButtonDel()){
            objectView.getTxtHiger().setText("");
            objectView.getTxtRepeats().setText("");
            objectView.getTxtNum().setEditable(true);
            numbers.clear();
            objectModel.setCount(1);
            objectModel.setLower(0);
        }
        
    }

}