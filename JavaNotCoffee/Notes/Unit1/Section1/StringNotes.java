public class StringNotes{
    public static void main(String[] args) {
        String name = "bob";
        String name2 = new String("bob");

        int age =0;
        String ages="0";
        
        System.out.println(name+ages);

        String email = "nate.adam@bbobaboom.g0v";
        String email2 = "brandon.spencer@bbobaboom.g0v";

        System.out.println(email.length());
        System.out.println(email.substring(0,9));
        System.out.println(email2.substring(0,email2.indexOf("@")));

        System.out.println(email2.indexOf("@"));
        System.out.println(email2.indexOf("#"));



        String email3 = "canden.rome@bbobaboom.g0v";
        System.out.println(email3.indexOf("e"));

        String email4 = "keenan.mason@bbobaboom.g0v";

        System.out.println(email3.equals(email4));
    }
}