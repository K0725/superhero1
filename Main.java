public class Main{
    public static void main(String args[]){
        person p1 = new person("Koki", 19, "dog"); 
        person p2 = new person("Juna", 18, "cat"); 
        Superhero s1 = new Superhero("Superman", "flight", "Justice!", "Clark Kent", 25, "Burritos"); 
        Superhero s2 = new Superhero("Batman", "money", "I am the Batman!", "Bruce Wayne", 27, "Curry"); 

        System.out.println(p1.toString()); 
        System.out.println(p2.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString()); 

        s1.catchVillain(5); 
        s1.villainsCaught();
        s2.villainsCaught();
        
        //hello world

        System.out.println(p1.equals(p2)); 
        System.out.println(s1.equals(s2)); 

        s1.speak("oomph"); 
        s2.speak("argh"); 
    }
}