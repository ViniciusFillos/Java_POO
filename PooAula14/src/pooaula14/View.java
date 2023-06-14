
package pooaula14;

public class View {
    
    private Gafanhoto viewer;
    private Video video;

    public View(Gafanhoto viewer, Video video) {
        this.viewer = viewer;
        this.video = video;
        this.viewer.setTotWatched(this.viewer.getTotWatched()+1);
        this.video.setViews(this.video.getViews()+1);
    }

    public void rating(){
        this.video.setRating(5);
    }
    public void rating(int note){
        this.video.setRating(note);
    }
    public void rating(float perc){
        int tot = 0;
        if(perc<=20){
            tot = 3;
        } else if(perc<=50){
            tot = 5;
        } else if(perc<=90){
            tot = 8;
        } else{
            tot = 10;
        }
        this.video.setRating(tot);
    }
        
    public Gafanhoto getViewer() {
        return viewer;
    }

    public void setViewer(Gafanhoto viewer) {
        this.viewer = viewer;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "View{" + "viewer=" + viewer + ", video=" + video + '}';
    }
    
    
}
