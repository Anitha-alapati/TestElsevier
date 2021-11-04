# TestElsevier
Complete test
Test Automation task setUp: 

Test Name: TestAuto
In test src/test/java there are three packages (pages, stepDefinition, TestRunners)
In pages package there is CartPage.java class where the actions are defined
In StepDefinition package there is CartSteeps.java class where the step definitions are defined
In TestRunners Package there is CartTestRunner.java class where we can run our test with JUnit runner
In src/test/resources there is Features folder with CartAutomation.feature

![image](https://user-images.githubusercontent.com/57220137/140243923-d661d210-0bba-4010-959c-e6c931e5f4ce.png)


API Test POST and GET Requesrs: 

POST cURL:
curl --location --request POST 'https://accounts.google.com/Login' \
--header 'Content-Type: application/json' \
--header 'Cookie: __Host-GAPS=1:0aP278bC2BWqZSSLsK8b5yj71OdQ9w:m2QA7gw1Du-OQafo' \
--data-raw '{
  "name": "anitha",
  "pass": "passa" 
}'

GET cURL:
curl --location --request GET 'https://accounts.google.com/Login' \
--header 'Content-Type: application/json' \
--header 'Cookie: __Host-GAPS=1:0aP278bC2BWqZSSLsK8b5yj71OdQ9w:m2QA7gw1Du-OQafo; NID=511=IVsFSgT1DIqAQavUFeSOVrFy1bpXSXl2rO8mChVWoku8fYgFZJVBcNlj-61HrVLLEOP9TliAFmPXYqICOILCqITAWabcLLPMlxQVJsrBWRVQ6ElQoxncBlYc6tKYXuMXfa7iL57KsAj78mKzJ3EK-NtvKMC27xuabzu9dCn-ZJY; __Host-GAPS=1:0aP278bC2BWqZSSLsK8b5yj71OdQ9w:m2QA7gw1Du-OQafo' \
--data-raw ''

API Test Setup: 
open postman
Go to File--> Imports--> Raw text--> place the cURL--> continue--> Import--> hit SEND

Here is the manual test Doc:

listed few scenarios and bugs

https://docs.google.com/spreadsheets/d/1RiQJINYpg2JK4TFerXoDGnE5XrDWWxwymd8PBvlZ150/edit?usp=sharing

