
package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DatosCDT extends UsuarioCDT {
    String ciudad;
    int tiempo,monto,totalMon,totalCdt;
    double interes,totalInte;
    String titulos[]={"Identificación","Nombre","Ciudad","Tiempo CDT","Monto CDT","Interes"};
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    ArrayList <DatosCDT> info;

    public DatosCDT(String ciudad, int tiempo, int monto, String identificacion, String nombre) {
        super(identificacion, nombre);
        this.ciudad = ciudad;
        this.tiempo = tiempo;
        this.monto = monto;
    }
    
    public DatosCDT(){
        info=new ArrayList();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String[] getTitulos() {
        return titulos;
    }

    public void setTitulos(String[] titulos) {
        this.titulos = titulos;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public ArrayList<DatosCDT> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<DatosCDT> info) {
        this.info = info;
    }

    public int getTotalMon() {
        return totalMon;
    }

    public double getTotalInte() {
        return totalInte;
    }

    public int getTotalCdt() {
        return totalCdt;
    }
    
    
    public DefaultTableModel adicionar(DatosCDT obj){
        info.add(obj);
        totalMon =0;
        totalInte=0;
        totalCdt=0;
        
        Object[] filas = new Object[6];
        for(int i=0;i<info.size();i++){
            filas[0]=info.get(i).getIdentificacion();
            filas[1]=info.get(i).getNombre();
            filas[2]=info.get(i).getCiudad();
            filas[3]=info.get(i).getTiempo();
            filas[4]=info.get(i).getMonto();
            totalMon=totalMon+info.get(i).getMonto();
            if(!"MEDELLIN".equals(info.get(i).getCiudad().toUpperCase())){
                totalCdt = totalCdt+1;
            }
            if(info.get(i).getTiempo()==30){
                setInteres((info.get(i).getMonto()*0.5)/100);
                totalInte=totalInte+getInteres();
            }
            if(info.get(i).getTiempo()==60){
                setInteres((info.get(i).getMonto()*1.2)/100);
                totalInte=totalInte+getInteres();
            }
            if(info.get(i).getTiempo()==90){
                setInteres((info.get(i).getMonto()*1.65)/100);
                totalInte=totalInte+getInteres();
            }
            if(info.get(i).getTiempo()==120){
                setInteres((info.get(i).getMonto()*2.15)/100);
                totalInte=totalInte+getInteres();
            }
             filas[5]=getInteres();
             modelo.addRow(filas);
        }
        return modelo;
    }
    
    
}
