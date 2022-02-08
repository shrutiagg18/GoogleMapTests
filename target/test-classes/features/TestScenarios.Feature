Feature: Google Map Page 

@GoogleMapSearch
Scenario Outline:
Verify User is able to search City on Google map
Given Initialise Driver
When Navigate to WebSite
And Enter "<City>" in the search box
And Click on Search
Then Verify left panel has "<City>" as a headline text
When Click Directions Icon
Then Verify Destination field is "<City>"
And Close the browser

Examples:
|City   |
|Dublin |