Feature: Shout Feature
@tag1
Scenario: Saun and Lucia are within range
Given Saun is 20 meters away from Lucia
When Saun shouts "Free Coffee"
Then Lucia Listens to the message
@tag2
Scenario: Saun and Lucia are not within range
Given Saun is 1000 meters away from Lucia
When Saun shouts "Free Coffee"
Then Lucia cannot Listen to the message