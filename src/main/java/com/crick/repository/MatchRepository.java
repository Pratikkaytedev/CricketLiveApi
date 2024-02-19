package com.crick.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.entities.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {

	

	Optional<Match> findByTeamHeading(String teamHeading);
	
}
