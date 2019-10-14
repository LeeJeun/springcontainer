package kr.co.itcen.springcontainer.soundsystem;

import org.springframework.stereotype.Component;

@Component
public final class HighSchoolRapper2Final implements CompactDisc {

	private String title="봉봉";
	private String artist = "김하은";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
