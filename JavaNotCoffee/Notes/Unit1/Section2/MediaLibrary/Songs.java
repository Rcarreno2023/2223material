import javax.swing.UIDefaults.ProxyLazyValue;

public class Songs{
    private String name, artist;
    private double rating;






    //Constructor
    public Songs(){
        this.name="untitled";
        this.artist="unknown artist";
    }

    
    
    public Songs(String name, String artist){
        this.name = name;
        this.artist = artist;
    }


    public Songs(String name, String artist, double rating){
        this.name = name;
        this.artist = artist;
        this.rating = rating;
    }



    //getters and setters
    //accessors and mutators

    public String getName(){
        return this.name;
    }

    public String getArtist(){
        return this.artist;
    
    }

    public double getRating(){
        return this.rating;
    } 

    public void setName(String newName){
        this.name = newName;
    }
    public void setArtist(String newArtist){
        this.artist = newArtist;
    }
    public void setRating(double newRating){
        this.rating=newRating;
    }


    //Override methods
    @Override
    public String toString() {
        return this.name+"\t"+this.artist;
    }

    @Override
    public boolean equals(Object o){
        if(o==this){
            return true;
        }
        else{
            return false;
        }
    }
}