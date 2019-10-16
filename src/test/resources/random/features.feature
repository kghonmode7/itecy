Feature: ItecyTestEnvironment

Scenario Outline: validate userid field 

Given Launch the site 
When enter the uid like "<x>" value
And click on the next 
Then Validate the uid output with "<X>" with "<Y>" criteria
When close the site 

Examples: 
|          x            |           y         | 
|                       |         Invalid     |
|madinerief@gmail.com   |         Invalid     |  
|madineni324@gmail.com  |         Valid       |     

Scenario Outline: Validate the password field 

Given Launch the site 
When enter the uid like "madineni324@gmail.com" value 
And click on the next
When enter the pass like "<x>" value 
And click on pass next button 
Then validte pass button "<x>" with "<y>" criteria 
When close the site 

Examples: 

|          x            |           y         | 
|                       |         Invalid     |
|ggggggggggggg          |         Invalid     |  
|lebsonjames23          |          Valid      |



