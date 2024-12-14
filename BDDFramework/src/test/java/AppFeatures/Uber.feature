Feature: Uber booking feature

Scenario Booking cab
Given User wants to select a car type "sedan" from uber application
When User select car "sedan" and pick up point "Mangalore" and drop location "Bangalore"
Then Driver starts the journey
And Driver ends the journey
Then User pays 5000 rupees
