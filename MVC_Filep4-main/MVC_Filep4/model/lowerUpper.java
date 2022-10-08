package model;

public class lowerUpper{
    private String str,result;

    public lowerUpper(){
        str=result="";
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String UpperAndLower(){
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        if(str.charAt(0) == upper.charAt(0) ){
            result = "La letra "+str.charAt(0)+" en mayuscula";
        }
        if(str.charAt(0)== lower.charAt(0)){
            result = "La letar "+str.charAt(0)+" en minuscula";
        }
        return result;
    }
}