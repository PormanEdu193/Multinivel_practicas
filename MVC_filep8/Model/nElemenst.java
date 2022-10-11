package Model;

import java.util.ArrayList;

public class nElemenst {
    int lower,count;
    public nElemenst() {
        lower=0;
        count=1;
    }

    public int getLower() {
        return lower;
    }

    public void setLower(int higer) {
        this.lower = higer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int Higer( ArrayList<Integer> number){
        lower = number.get(0);
        for(int i=0;i<number.size();i++){
            if(number.get(i)== lower){
                count++;
            }
            if(number.get(i)<lower){
                lower=number.get(i);
            }
        }
        return lower;
    }

}
