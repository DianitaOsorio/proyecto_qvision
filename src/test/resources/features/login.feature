#Languaje: es

Feature: Ingresar a la pagina conduit

  Scenario Outline: El usuario hace un login

    Given que el usuario ingrese a la pagina
    When ingresa los datos de acceso
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Then valida que inicio sesion exitosamente <texto>
    Examples:
      | usuario               | contrasena | texto       |
      | retoqvision@gmail.com | 54321      | New Article |
