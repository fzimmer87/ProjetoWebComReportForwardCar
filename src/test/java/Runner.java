import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "C:\\Fernanda\\ProjetosEstagioJava\\ProjetoWebComReportForwardCar\\src\\test\\resources\\feature\\forward.feature",
        },

        tags = "@CT001"
)
public class Runner {
}
