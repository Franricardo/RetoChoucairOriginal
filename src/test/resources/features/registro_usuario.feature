#Autor: Ricardo Herrera

@Stories
  Feature: Registro de usuario en utest
    @Scenario1:
    Scenario: Registro de Ricardo en la pagina de utest
      Given : Ricardo desea registrarse en la pagina de utest
      When : cuando el usuario ingresa los datos requeridos por el sistema
        | strNombre | strApellido | strEmail       | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad     | strZip   | strPais    | strDispositivoMovil |  strModeloMovil  |   strSistemaOperativoMovil | strClave  |
        | Ricardo   | Herrera     | fran@utest.com | July             |  07              |     1991         |  PanamaOeste  | 507      |   Panama   |      Apple          |  iphone 4        |  iOS 11.1.2                | Turke0830. |
      Then : El registro se completa al ver el boton de complete setup
      |  strTextoFinal |
      |Complete Setup  |