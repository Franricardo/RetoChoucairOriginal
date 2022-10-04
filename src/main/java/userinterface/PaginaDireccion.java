package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccion {
    public static Target CIUDAD = Target.the("Ciudad")
            .located(By.id("city"));
    public static Target ZIP = Target.the("Codigo postal")
            .located(By.id("zip"));
    public static Target CONTENEDOR_PAIS = Target.the("Contenedor de pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static Target PAIS = Target.the("Pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static Target BOTON_DISPOSITIVOS = Target.the("Boton de dirigirse a la seccion de dispositivos")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
