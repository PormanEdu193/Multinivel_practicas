
package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class DatosUsuario extends Usuario {
    int totalH,totalM,totalAfi,totalOtra,menor,aux;
    String titulos[]={"Identificación","Nombre","Edad","Genero","Afición"};
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    ArrayList <DatosUsuario> info;
    String genero,aficion;

    public DatosUsuario(String genero, String aficion, String identificacion, String nombre, int edad) {
        super(identificacion, nombre, edad);
        this.genero = genero;
        this.aficion = aficion;
    }

    public DatosUsuario() {
        info = new ArrayList();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAficion() {
        return aficion;
    }

    public void setAficion(String aficion) {
        this.aficion = aficion;
    }

    public int getTotalH() {
        return totalH;
    }

    public int getTotalM() {
        return totalM;
    }

    public int getTotalAfi() {
        return totalAfi;
    }

    public int getTotalOtra() {
        return totalOtra;
    }

    public int getMenor() {
        return menor;
    }
    
    
    public DefaultTableModel adicionar(DatosUsuario obj){
        info.add(obj);
        totalH=0;
        totalM=0;
        totalAfi=0;
        totalOtra=0;
        
        Object[] filas = new Object[5];
        for(int i=0;i<info.size();i++){
            filas[0]=info.get(i).getNombre();
            filas[1]=info.get(i).getIdentificacion();
            filas[2]=info.get(i).getEdad();
            filas[3]=info.get(i).getGenero();
            filas[4]=info.get(i).getAficion();
            if(info.get(i).getGenero().equals("Hombre")){
                totalH=totalH+1;
            }if(info.get(i).getGenero().equals("Mujer")){
                totalM=totalM+1;
            }
            if(info.get(i).getAficion().equals("Otras")){
                totalOtra=totalOtra+1;
            }
            else{
                totalAfi = totalAfi+1;
            }

            modelo.addRow(filas);
        }
        return modelo;
    }
    
}
