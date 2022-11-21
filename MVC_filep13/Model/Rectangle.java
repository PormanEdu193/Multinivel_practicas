package Model;

public class Rectangle extends Figures{
    Float perimetrer,area;
    String error="";
    public Rectangle(Float large, Float width) {
        super(large, width);
    }

    public String getError() {
        return error;
    }

    public Float getPerimetrer() {
        return perimetrer;
    }

    public void setPerimetrer(Float perimetrer) {
        this.perimetrer = perimetrer;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Float Perimeter(){
        if((large<=20.0&&large>0.0)&&(width<=20.0&&width>0.0)){
            perimetrer= large + width;
        }
        else{
            error="El número no esta en el rango permitido";
        }
        return perimetrer;
    } 
    
    public Float Area(){
        if((large<20.0&&large>0.0)&&(width<20.0&&width>0.0)){
            area= large * width;
        }
        else{
            error="El número no esta en el rango permitido";
        }
        return area;
    }
}
