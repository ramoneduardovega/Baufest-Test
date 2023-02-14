
Feature: Dar de alta a un usuario en la tienda online

  @ExamBaufest
  Scenario Outline: Dar de alta a un usuario correctamente registrando user y password
    Given el usuario está en el HomePage de la tienda online
    When el usuario clica en el menu Sign up
    And el usuario introduce de forma correcta su username y password
    And el usuario clica sobre el botón Sign up
    Then se crea una cuenta en la tienda online
   


