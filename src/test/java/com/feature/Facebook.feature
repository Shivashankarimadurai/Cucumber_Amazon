Feature: Facebook Login

Scenario Outline: User Login With The Username And Password In Facebook Page

Given User Landed On The Facebook Page

When User Enter Username In The Username Field "<username>"

And User Enter The Password In "<password>" The Password Field 

And User Click The LoginButton  It will navigate To The Homepage

Then User Landed On The Facebook Homepage

Examples:
	|username|password|
	|shivashankari|1234|
	|dev|637|
	|dharanaya|667|
	|Appu|3456|
	|kavi|5793|
	