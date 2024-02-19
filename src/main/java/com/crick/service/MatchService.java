package com.crick.service;

import java.util.List;
import java.util.Map;

import com.crick.entities.Match;

public interface MatchService {

	//get all Matches
	List<Match> getAllMatches();
	
	//get live Matches
	
	List<Match> getLiveMatches();
	
	//get cwc2023 point table
	List<List<String>> getCWC2023PointTable();
	
	
	
}
