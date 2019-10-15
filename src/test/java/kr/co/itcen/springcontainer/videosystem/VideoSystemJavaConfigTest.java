package kr.co.itcen.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.videosystem.DVDPlayerConfig;

/*
 *  Explicit(명시적) Configuration - Java Config
 *  @Bean 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DVDPlayerConfig.class})
public class VideoSystemJavaConfigTest {
	
	@Rule // console로 나오는 String 잡아준다.
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd;
	
	@Autowired
	private DVDPlayer player;
	
	@Test
	public void testDVDNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testPlayerNull() {
		assertNotNull(player);
	}
	
	@Test
	public void testPlay() {
		dvd.play();
		assertEquals("Playing Movie MARVEL's Avengers Infinity War", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}
