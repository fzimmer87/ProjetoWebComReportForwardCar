import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = false,
        features = {
                "C:\\Fernanda\\ProjetosEstagioJava\\ProjetoWebComReportForwardCar\\src\\test\\resources\\feature\\forward.feature",
        },
        plugin = {"pretty",
                "html: evidencias.reports/relatorio-html.html"
        },
        tags = "@CT001"
)
public class Runner {
}
