package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {

    public static final Target CLAVE = Target.the("Clave de usuario")
            .located(By.id("password"));
    public static final Target CONFIRMAR_CLAVE = Target.the("Confirmacion de la clave de usuario")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_01 =Target.the("Caja de texto 01")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_02 =Target.the("Caja de texto 02")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_03 =Target.the("Caja de texto 03")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_FINAL = Target.the("Boton para terminar el registro del usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
