#language: pt
  Funcionalidade: Testar site da ForwardCar com Reports
    Contexto:
      Dado que estou na pagina inicial da ForwardCar

      @CT001
      Cenario: Realizar primeiro registro
        E clico em Guest
        E clico em Register
        Quando preencho todos os dados solicitados
        Entao sou encaminhado para pagina de login
