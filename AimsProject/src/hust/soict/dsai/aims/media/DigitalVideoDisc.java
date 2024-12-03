package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc( String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
    	super(title, category, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category,director, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	super(title, category, director, length, cost);
    }
    
    @Override
    public String toString() {
        return "ID: " + this.getId() + " - DVD: " + this.getTitle() + " - Category: " + this.getCategory() +
                " - Director: " + this.getDirector() + " - DVD length: " + this.getLength() +
                " - Cost: " + this.getCost() + "$";
    }

	@Override
	public void play() {
		// TODO Auto-generated method stub
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
		
	}
}
