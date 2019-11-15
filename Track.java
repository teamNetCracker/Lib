public class Track {
    private String title;
    private String performer;
    private String albom;
    private Genre genre;
    public Track()
    {
    }
    public Track(String title, String performer, String albom, Genre genre)
    {
        this.title = title;
        this.performer = performer;
        this.albom = albom;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAlbom() {
        return albom;
    }

    public String getPerformer() {
        return performer;
    }

    public String getTitle() {
        return title;
    }

    public void setAlbom(String albom) {
        this.albom = albom;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
