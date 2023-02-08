Feature: As a user I want get information with relation to clients

   Scenario Outline: Get response

    When I send a get request with the user 2
    Then I can see the dates of the user
    |First Name| <First Name> |
    |Last Name | <Last Name>  |
    | Id       | <Id>         |

    Examples:
    | First Name | Last Name | Id |
    |Janet       |Weaver     |2   |

