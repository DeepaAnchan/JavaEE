package com.soccer_league.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SharedLeague {
	private String season;
	private String title;
	private int year;
	@Override
	public String toString() {
		return "SharedLeague [season=" + season + ", title=" + title + ", year=" + year + "]";
	}
	

}
