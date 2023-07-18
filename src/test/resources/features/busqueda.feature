Feature: Busqueda en Amazon
  Yo como usuario que ingresa a Amazon
  quiero buscar la palabra nintendo
  para ver las opciones de busqueda

Scenario: Validar busqueda exitosa
  Given El usuario ingresa a Amazon
  When  Realiza la busqueda de la palabra Nintendo
  Then  Se muestran resultados con la palabra animal