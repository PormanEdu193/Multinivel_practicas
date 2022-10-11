package Model;

public class tenNumbersShow {
    String result;

    public tenNumbersShow() {
        result="";
    }

    public String Show (String numbers[]){
        for(int i=0;i<numbers.length;i++){
            result = result +" "+numbers[i];
        }
        return result;
    }
}
