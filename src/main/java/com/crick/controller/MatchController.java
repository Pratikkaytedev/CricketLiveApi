package com.crick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.entities.Match;
import com.crick.service.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	private MatchService matchService;
	
	
	//get Live Matches
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		
	List<Match> list =	matchService.getLiveMatches();
	
	if(list.isEmpty()) {
		return (ResponseEntity<List<Match>>) ResponseEntity.status(HttpStatus.NOT_FOUND);
	}else {
		return ResponseEntity.ok(list);
	}
		
	}
	
	// get all Matches
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches() {

		List<Match> list = this.matchService.getAllMatches();

		if (list.isEmpty()) {
			return (ResponseEntity<List<Match>>) ResponseEntity.status(HttpStatus.NOT_FOUND);
		} else {
			return ResponseEntity.ok(list);
		}

	}
	 
	
	// get point table
	@GetMapping("/getPoint")
	public ResponseEntity<List<List<String>>> getPointTable() {

		  List<List<String>> pointTable = this.matchService.getCWC2023PointTable();

		if (pointTable.isEmpty()) {
			return (ResponseEntity<List<List<String>>>) ResponseEntity.status(HttpStatus.NOT_FOUND);
		} else {
			return ResponseEntity.ok(pointTable);
		}

	}
	
}
