Feature: editar el perfil del usuario

  Background: login

  Scenario: El usuario hace un login

    Given que el usuario ingrese a la pagina
    When ingresa los datos de acceso
      | usuario               | contrasena |
      | retoqvision@gmail.com | 54321      |

  Scenario: El usuario edita sus datos personales

    When el usuario edita el bio de su perfil
    Then podra modificar su informacion correctamente

