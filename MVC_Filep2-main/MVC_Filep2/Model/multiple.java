package Model;

public class multiple{
    private int num1,num2;
    private String multi;

    public multiple() {
        num1=num2=0;
        multi="";
    }
    

    public int getNum1() {
        return num1;
    }


    public int getNum2() {
        return num2;
    }


    public String getMulti() {
        return multi;
    }


    public void setNum1(int num1) {
        this.num1 = num1;
    }


    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }

    public String IsMultiple(){
        if(num2==0){
            multi="El numero "+ num1+" no es multiplo del número "+ num2;
        }
        else if(num1%num2==0){
            multi= "El numero "+ num1+" es multiplo del número "+ num2;
        }
        else{
            multi="El numero "+ num1+" no es multiplo del número "+ num2;
        }
        return multi;
    }
}