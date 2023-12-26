import com.aventstack.extentreports.reporter.FileUtil;
import configHook.Hook;
import configHook.LerProperties;
import constantes.ConstantesCampoBy;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyStepdefs {
    private ConstantesCampoBy constantesCampoBy= new ConstantesCampoBy();

    @Dado("que estou na pagina inicial da ForwardCar")
    public void queEstouNaPaginaInicialDaForwardCar() throws IOException, InterruptedException {
        LerProperties manipulador = new LerProperties();
        Hook.driver.get(manipulador.getBaseUri());
        Thread.sleep(1000);
    }

    @E("clico em Guest")
    public void clicoEmGuest() {
        constantesCampoBy.clicarBotaoGuest(Hook.driver);
    }

    @E("clico em Register")
    public void clicoEmRegister() {
        constantesCampoBy.clicarRegister(Hook.driver);
    }

    @Quando("preencho todos os dados solicitados")
    public void preenchoTodosOsDadosSolicitados() throws InterruptedException {
        constantesCampoBy.preencherCamposRegister(Hook.driver);
    }

    @Entao("sou encaminhado para pagina de login")
    public void souEncaminhadoParaPaginaDeLogin() throws IOException, InterruptedException {
        LerProperties manipulador = new LerProperties();
        Hook.driver.getCurrentUrl();
        Thread.sleep(1000);
        String URL_esperada = manipulador.getPaginaLogin();
        Assert.assertEquals(URL_esperada, manipulador.getPaginaLogin());
        Thread.sleep(1000);
        assertThat(Hook.driver.findElement(By.cssSelector(".panel-title")).getText(), is("Please sign in"));
        impressao_evidecias();
    }
    public void impressao_evidecias() throws IOException {
        File print = ((TakesScreenshot)Hook.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(print, new File("reports.print/evidencias.png"));
    }
}
