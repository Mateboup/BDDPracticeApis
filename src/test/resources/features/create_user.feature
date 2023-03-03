Feature: As a user I want create an account1

Scenario Outline:Create user in the app


    When I send a get request for create user with the dates
    |Name| <Name> |
    |Job | <Job>  |
    Then I can see the dates of the user created

    Examples:
    | Name  | Job          |
    #|Sam    |QA AUTOMATION |
    |Jota   |QA AUTOMATION |

