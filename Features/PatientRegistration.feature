Feature: Patient Registration

  Scenario: Register a new walk-in patient successfully
    Given User launches the browser and opens the RVM application
    When User enters valid credentials and logs in "rvm@gmail.com" and "Admin@123"
    And User navigates to Patient Registration page and click new walk-in registration 
    And User enters patient personal details
    And User enters address details
    And User skips OTP verification
    And User selects specialty, team, doctor, visit type and payment
    Then Registration should complete successfully

