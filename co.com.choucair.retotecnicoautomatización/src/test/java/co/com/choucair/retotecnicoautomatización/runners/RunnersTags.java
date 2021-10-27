package co.com.choucair.retotecnicoautomatización.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/retoJoin.feature",
        tags = "@NewUser",
        glue = "co.com.choucair.retotecnicoautomatización.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnersTags {
}
