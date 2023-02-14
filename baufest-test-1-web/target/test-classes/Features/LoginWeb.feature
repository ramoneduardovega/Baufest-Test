
Feature: Iniciar sesión en la tienda online

	@ExamBaufest
  Scenario Outline: Iniciar sesión ingresando user y password
    Given el usuario está en el HomePage de la tienda online
    When el usuario clica en el menu Log in
    And el usuario introduce de forma correcta su user y password que ha registrado previamente 
    And el usuario clica sobre el botón Log in
    Then el usuario es redireccionado a la págna de Welcome
