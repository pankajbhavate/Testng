Feature: login
Scenario: succesfully login
    
	When User launch "https://www.facebook.com/"
	And user enter email as "pankaj" and passwors "akssjjj3333"
	And click login button
	Then open they arrive the home page.
	
	

Scenario: check page
	
	When user reach to the home page and log "https://www.facebook.com/"
	And user are click signup button
	