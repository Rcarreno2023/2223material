public class Main{
    public static void main(String[] args) {
        //created an object of Character Class;
        Character c = new Character();
        Character v = new Character("bboba");
        Character b = new Character("bobby",5);
        Character r = new Character("bobba",5,"Bosse",true);

        System.out.println(v);
        System.out.println(c);
        System.out.println(b.name);
        System.out.println(r.name);
    }
}