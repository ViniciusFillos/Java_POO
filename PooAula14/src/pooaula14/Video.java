
package pooaula14;

public class Video implements AcoesVideo{

    private String title;
    private float rating;
    private int views, likes;
    private boolean reproducing;

    public Video(String title) {
        this.title = title;
        this.rating = 1.0f;
        this.views = 0;
        this.reproducing = false;
        this.likes = 0;
    }
    
    @Override
    public void play() {
        this.reproducing = true;
    }

    @Override
    public void pause() {
        this.reproducing = false;
    }

    @Override
    public void like() {
        this.likes ++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating += rating;
        this.rating /= 2;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isReproducing() {
        return reproducing;
    }

    public void setReproducing(boolean reproducing) {
        this.reproducing = reproducing;
    }

    @Override
    public String toString() {
        return "Video{" + "title=" + title + ", rating=" + rating + ", views=" + views + ", likes=" + likes + ", reproducing=" + reproducing + '}';
    }
    
    
}
