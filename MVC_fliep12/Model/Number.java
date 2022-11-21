package Model;

public class Number {
    protected int num;
    protected String mensaje;

    
    public Number(int num, String mensaje) {
        this.num = num;
        this.mensaje = mensaje;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
}
