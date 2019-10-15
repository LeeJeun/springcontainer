package kr.co.itcen.springcontainer.videosystem;

public class IronMan implements DigitalVideoDisc {

	private String title = "IronMan";
	private String studio = "MARVEL";
	
	@Override
	public void play() {
		System.out.println("Playing Movie " + studio + "'s " + title);
	}

	@Override
	public String toString() {
		return "IronMan [title=" + title + ", studio=" + studio + "]";
	}

}
