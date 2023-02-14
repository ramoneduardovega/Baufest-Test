
Feature: Agregar una laptop al carrito en la tienda online

  @ExamBaufest
  Scenario Outline: Agregar una laptop al carrito desde cuenta creada
    Given el usuario se encuentra logeado
    When el usuario clica en la categoría Laptos
    And el usuario clica sobre una laptop de la lista mostrada
    And el usuario clica sobre el botón Add to cart
    And el usuario clica sobre el menú Cart
    Then comprueba que la laptop se agregó al carrito
