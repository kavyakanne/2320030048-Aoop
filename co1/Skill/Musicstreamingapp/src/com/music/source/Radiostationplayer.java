package com.music.source;

import com.music.player.Musicplayer;

public class Radiostationplayer implements Musicplayer{
	  @Override
	    public void play() {
	        System.out.println("Playing music from a radio station.");
	    }
}
