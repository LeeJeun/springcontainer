package config.videosystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import kr.co.itcen.springcontainer.videosystem.DVDPlayer;
import kr.co.itcen.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
@Import(DVDConfig.class)
public class DVDPlayerConfig {
	
//----------------Autowired 쓰는 방법-----------------------
//	@Autowired
//	@Qualifier("avengersInfinityWar")
//	private DigitalVideoDisc dvd;
//	
//	@Bean
//	public DVDPlayer dvdPlayer() { 
//		return new DVDPlayer(dvd);
//	}
//-------------------------------------------------------	
	
	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengersInfinityWar") DigitalVideoDisc dvd) { //method명 아무거나 해도 된다.
		return new DVDPlayer(dvd);
	}
}
