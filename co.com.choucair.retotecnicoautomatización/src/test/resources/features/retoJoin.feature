#Author: Valeria Rivera Diossa

  Feature: carry out the completion of the form in order to create a new username.

    @NewUser
    Scenario Outline: fill out the form to create a new user
      Given Valeria going to create a new user
        |firstname  |lastname  |email  |languages   |city  |postal  |model  |syos  |password  |
        |<firstname>|<lastname>|<email>|<languages> |<city>|<postal>|<model>|<syos>|<password>|

      When Valeria going to into sign in
        |email  |password  |
        |<email>|<password>|

      Then Valeria going to  verify her account
        |email|
        |<email>|
      Examples:
        |firstname|lastname|email                      |languages|city                         |postal|model   |syos    |password        |
        |Valeria |Diossa  |vriveradi@choucairtesting.com|Span     |Medellin, Antioquia, Colombia|050001|iPhone 4 |iOS 11.3|Retotecnico2021+|