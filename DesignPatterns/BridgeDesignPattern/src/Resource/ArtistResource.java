package Resource;

public class ArtistResource implements IResource{

    Artist artist;

    ArtistResource(Artist artist){
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return artist.bio();
    }

    @Override
    public String title() {
        return artist.fName()+ " "+ artist.lName();
    }

    @Override
    public String image() {
        return null;
    }


    @Override
    public String url() {
        return null;
    }
}
