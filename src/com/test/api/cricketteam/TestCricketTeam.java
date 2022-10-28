package com.test.api.cricketteam;

import org.testng.Assert;
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
		int noOfForeignCountries = 0;
		for(int i=0;i<size;i++) {
			String country = jdata.getString("player["+ i +"].country");
			if(!country.equalsIgnoreCase("india")) {
				noOfForeignCountries++;
			}
		}
		
		Assert.assertEquals(noOfForeignCountries, 4);
	}
	
	@Test
	public void testNoOfWicketKeepersInCricketTeam() {
		String data = cricketTeamJson.getCricketTeamJson();
		
		JsonPath jdata = new JsonPath(data);
		
		int size = jdata.getInt("player.size()");
		int noOfWicketKeepers = 0;
		for(int i=0;i<size;i++) {
			String country = jdata.getString("player["+ i +"].role");
			if(!country.equalsIgnoreCase("Wicket-keeper")) {
				noOfWicketKeepers++;
			}
		}
		
		Assert.assertTrue(noOfWicketKeepers >= 1);
	}
}
