Feature: Login feature for demo webshop
@tag1
Scenario Outline: valid login scenario
Given url of demowebshop "http://demowebshop.tricentis.com/login"
When user enters "<username>" as username
And user enters "<password>" as password
Then user is in webshop as <type>

Examples:
|username         |password|type  |
|askmail@email.com|abc123  |admin |
|askmail@gmail.com|abc123  |guest |
|askmail@bmail.com|abc123  |vendor|

Scenario: Data table example
Given Admin of the testme app enters
|electronics|headphone|1|
|apparels|shirt|2|
|electronics|USB|2|