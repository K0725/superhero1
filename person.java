public class person{
    private String name; 
    private int age; 
    private String food; 

    public person(){
    }

    public person(String name, int age, String food){
        this.name = name; 
        this.age = age; 
        this.food = food; 
    }

    public person(person p){
        this.name = p.name; 
        this.age = p.age; 
        this.food = p.food; 
    }

    public String getName(){
        return name; 
    }
    public int getAge(){
        return age; 
    }
    public String getFood(){
        return food; 
    }

    public void setName(String name){
        this.name = name; 
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setFood(String food){
        this.food = food; 
    }

    public boolean equals(person other){
        if(other == null){
            return false;
        }
        else{
            if(other.getAge() == getAge() && other.getName() == getName() && other.getFood() == getFood()){
                return true; 
            }
        }
        return false; 
    }

    public String toString(){
        return "Name: " + name + " Age: " + age + " Food: " + food; 
    }
}