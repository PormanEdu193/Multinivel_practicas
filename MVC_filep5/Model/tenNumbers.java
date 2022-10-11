package Model;

public class tenNumbers {
    int higer,lower;
    String pairs;
    public tenNumbers() {
        higer=0;
        lower=0;
    }

    public int Higer(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>higer){
                higer=numbers[i];
            }
        }
        return higer;
    }

    public int Lower(int numbers[]){
        lower= numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<lower){
                lower = numbers[i];
            }
        }
        return lower;
    }

    public String Pairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                pairs=pairs+" "+numbers[i];
            }
        }
        return pairs;
    }

    
    
}
