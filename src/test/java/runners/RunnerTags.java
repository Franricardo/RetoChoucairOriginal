package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/Test/resources/features/registro_usuario.feature",
                            tags= "@Stories",
                            glue = "co.com.choucair.certification.pruebautest",
                           snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
