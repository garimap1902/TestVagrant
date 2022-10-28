package com.test.api.cricketteam;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestCricketTeam {
	
	@BeforeTest
	public void setup() {
		RestAssured.baseURI = "";
	}

	@Test
	public void testNoOfForeignPlayersInCricketTeam() {
		
	}
}
