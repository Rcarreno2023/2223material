public class Character{
    //1. any and all global variables
    String name;
    int age;
    String school;
    boolean drive;







    //2. any and all constructors
    //Professionally it has to match the file name
    public Character(){}           //no-arg constructor
    
    public Character(String n){
        this.name=n;
    }

    public Character(String n, int a){
        this.name=n;
        this.age=a;
    }

    public Character(String n,int a,String s,boolean d){
        this.name=n;
        this.age=a;
        this.school=s;
        this.drive=d;
    }







    //3. any and all methods

    @Override 
    public String toString(){
        return this.name+"\t"+this.age;
    }



}
    /*
        attributes = nouns and adjective
        health
        armor 
        skin
        food
        inventory
        experience
     */

    /*
        Methods = Verbs
            walk
            sprint
            crouch
            build
            swim
            attack(mine)
     */

