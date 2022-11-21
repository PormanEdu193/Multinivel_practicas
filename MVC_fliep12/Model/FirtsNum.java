package Model;

public class FirtsNum extends Number {
    private String [] UNITS = {"","UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE"};
    private String [] TENS = {"DIEZ","ONCE","DOCE","TRECE","CATORCE","QUINCE","DIECISEIS","DIECISIETE","DIECIOCHO","DIECINUEVE","VEINTI","TREINTA","CUARENTA","CINCUENTA","SESENTA","SETENTA","OCHENTA","NOVENTA"};
    private String [] HUNDREDS ={"","CIENTO","DOCIENTOS","TRECIENTOS","CUATROCIENTOS","QUINIENTOS","SEISCIENTOS","SETECIENTOS","OCHOCIENTOS","NOVECIENTOS"};
    private String aux = String.valueOf(num);
    private String digits[] = aux.split("");

    public FirtsNum(int num, String mensaje) {
        super(num, mensaje);
    }
    
    public String WriteUnits(){
        mensaje = UNITS[Integer.parseInt(digits[0])];
        return mensaje;
    }

    public String WriteTens(){
        if(digits[0].equals("1")){
            mensaje = TENS[Integer.parseInt(digits[1])];
        }
        else if (digits[1].equals("0")&&digits[0].equals("2")){
            mensaje = "VEINTE";
        }
        else if(digits[1].equals("0")){
            mensaje = TENS[Integer.parseInt(digits[0])+8];
        }
        else{
            mensaje = TENS[Integer.parseInt(digits[0])+8]+" Y "+UNITS[Integer.parseInt(digits[1])];
        }
    return mensaje;
    }

    public String WrtieHundreds(){
        if(num==100){
            mensaje="CIEN";
        }
        else if(digits[1].equals("0")&&digits[2].equals("0")){
            mensaje=HUNDREDS[Integer.parseInt(digits[0])];
        }
        else if(digits[1].equals("0")){
            mensaje=HUNDREDS[Integer.parseInt(digits[0])]+ " "+UNITS[Integer.parseInt(digits[2])];
        }
        else if(digits[1].equals("1")){
            mensaje=HUNDREDS[Integer.parseInt(digits[0])]+ " "+ TENS[Integer.parseInt(digits[2])];
        }
        else if(digits[2].equals("0")){
            if(digits[1].equals("2")){
                mensaje =HUNDREDS[Integer.parseInt(digits[0])]+ " VEINTE";
            }
            else{
                mensaje =HUNDREDS[Integer.parseInt(digits[0])]+" "+ TENS[Integer.parseInt(digits[1])+8];
            }
        }
        else{
            mensaje =HUNDREDS[Integer.parseInt(digits[0])]+" "+TENS[Integer.parseInt(digits[1])+8]+" Y "+UNITS[Integer.parseInt(digits[2])];
        }
        return mensaje;
    }
}
