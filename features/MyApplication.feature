#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Test PEA Smoke senario
 
  Scenario Outline: Test Login with valid credentials
   Given open Chrome and start application
    When Enter valid "<username>" and valid "<password>"
    Then click on the submit button
    #Then click on patient Tab
    
Examples:
        | username | password |
         | admin | 123.Com! |
          | admin	| 123.Com! |


    