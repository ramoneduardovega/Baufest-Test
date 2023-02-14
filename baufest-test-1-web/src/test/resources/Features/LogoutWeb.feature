
Feature: Cerrar sesión en la tienda online

	@ExamBaufest
  Scenario Outline: Cerrar sesión mediante el botón Log out
    Given el usuario se encuentra logeado
    When el usuario clica sobre el botón Log out
    Then el usuario es redireccionado al HomePage


