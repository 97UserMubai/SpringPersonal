package com.wbt.cl2;

import org.springframework.stereotype.Component;

/**
 * Spring实战4 2.2程序清单
 */
@Component
public class SgtPeppers implements CompactDisc {

	@Override
	public void play() {
		String title = "Sgt , Pepper's Lonely Hearts Club Band";
		String artist = "The Beatles";
		System.out.println("Playing " + title + " by " + artist);
	}
}
