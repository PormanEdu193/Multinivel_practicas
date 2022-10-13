
package Modelo;

import javax.swing.DefaultListModel;

public class ParcialMo {
    String oracion,invertida,contiene;
    DefaultListModel modelo = new DefaultListModel();
    DefaultListModel modelo1 = new DefaultListModel();

    public ParcialMo() {
        oracion = "";
        invertida ="";
        contiene = "";
        
    }

    public String getOracion() {
        return oracion;
    }

    public void setOracion(String oracion) {
        this.oracion = oracion;
    }

    public String getInvertida() {
        return invertida;
    }

    public String getContiene() {
        return contiene;
    }
    
    
    
    public DefaultListModel invertidas(){
        String palabras []=oracion.split(" ");
        
        for(int i=0;i<palabras.length;i++){
          if(palabras[i].startsWith("d")){
          for(int j=(palabras[i].length()-1);j>=0;j--)
           {
            invertida = invertida + palabras[i].charAt(j);
           }
            modelo.addElement(invertida);
            invertida=" ";
          }
        }
            return modelo;
    }
    
    public DefaultListModel contieneI(){
        String palabras[]= oracion.split(" ");
        
        for(int i=0;i<palabras.length;i++){
                if(palabras[i].contains("i")){ 
                    contiene=palabras[i];
                    modelo1.addElement(contiene);
                }
            }
        return modelo1;
    }
}
