#Languaje: es
Feature: Ingresar articulo nuevo

  Background: login

  Scenario: El usuario hace un login

    Given que el usuario ingrese a la pagina
    When ingresa los datos de acceso
      | usuario               | contrasena |
      | retoqvision@gmail.com | 54321      |

  Scenario: El usuario crea un nuevo articulo

    When el usuario crea un nuevo articulo con la siguiente informacion
    Then publica el articulo exitosamente
