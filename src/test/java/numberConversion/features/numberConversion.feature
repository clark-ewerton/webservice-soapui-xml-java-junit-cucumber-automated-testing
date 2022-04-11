#language: pt
Funcionalidade: WebService numberToDollars

  Contexto: 
    Dado que estou trabalhando com o servico numberToDollars

  Esquema do Cenario: Deve validar conversao de um numero para dollar
    E escolho o <testCase> - numberToDollars
    Quando realizo o POST deste <testCase> e <endpoint> passando os parametros: <dNum> - numberToDollars
    Entao valido que o status code foi "200" - numberToDollars
    E valido o response body atraves do <expectedResult> - numberToDollars

    Exemplos: 
      | testCase          | endpoint          | expectedResult   | dNum |
      | "numberToDollars" | "NumberToDollars" | "twenty dollars" | "20" |
