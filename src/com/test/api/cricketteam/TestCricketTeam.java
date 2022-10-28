package com.test.api.cricketteam;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import com.data.cricketteam.*;

public class TestCricketTeam {
	
	@BeforeTest
	public void setup() {
		RestAssured.baseURI = "";
	}

	@Test
	public void testNoOfForeignPlayersInCricketTeam() {
		String data = cricketTeamJson.getCricketTeamJson();
		
		JsonPath jdata = new JsonPath(data);
		
		int size = jdata.getInt("player.size()");
		
		
		
		
	}
}
