package hust.soict.dsai.aims.media;

public class Track implements Playable{
	
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}

	public Track() {
		// TODO Auto-generated constructor stub
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
        System.out.println("Playing Track: " + title);
        System.out.println("Track length: " + length);
	}
	
    //Override method equals
    public boolean equals (Object obj) {
        if (obj instanceof Track) {
            Track track = (Track)obj;
            return track.title.equals(this.title) && track.length == this.length;
        }
        return false;
    }

}
