//Koki Yamaguchi
//CS1400
//Assignment 5
//11/11

public class Superhero extends person{
    private static int totalNumberVillainsCaught; 
    private String sn; 
    private String sp; 
    private String cp; 

    public Superhero(String sn, String sp, String cp, String name, int age, String food){ 
        super(name, age, food); 
        this.sn = sn;
        this.sp = sp; 
        this.cp = cp; 
    }

    public String getSn(){
        return sn; 
    }
    public String getSp(){
        return sp; 
    }
    public String getcp(){
        return cp; 
    }

    public void setSn(String sn){
        this.sn = sn; 
    }
    public void setSP(String sp){
        this.sp = sp; 
    }
    public void setCp(String cp){
        this.cp = cp; 
    }

    public void speak(String sf){
        System.out.println(cp + ". " + sf); 
    }

    public void villainsCaught(){
        System.out.println(totalNumberVillainsCaught); 
    }

    public void catchVillain(int villains){
        totalNumberVillainsCaught += 5; 
    }

    public String toString(){
        return "Superhero Name: " + sn + " Super Power: " + sp + " Catchphrase: " + cp; 
    }
}