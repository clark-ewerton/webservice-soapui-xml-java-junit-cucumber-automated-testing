#language: en
Feature: WebService numberToDollars

  Background: 
    Given que estou trabalhando com o servico numberToDollars

  Scenario Outline: Deve validar conversao de um numero para dollar
    Then escolho o <testCase> - numberToDollars
    When realizo o POST deste <testCase> e <endpoint> passando os parametros: <dNum> - numberToDollars
    Then valido que o status code foi "200" - numberToDollars
    Then valido o response body atraves do <expectedResult> - numberToDollars

    Examples: 
      | testCase          | endpoint          | expectedResult   | dNum |
      | "numberToDollars" | "NumberToDollars" | "twenty dollars" | "20" |
