package Model;

public class stringSpace {
    private String str,strResult;

    public stringSpace() {
        str ="";
        strResult="";
    }
    

    public void setStr(String str) {
        this.str = str;
    }


    public String getStr() {
        return str;
    }


    public String getStrResult() {
        return strResult;
    }
    
    public void setStrResult(String strResult) {
        this.strResult = strResult;
    }
    
    public String Space(){
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            strResult=strResult+c+" ";
        }
        return strResult;
    }
    
}
