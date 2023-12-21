package constantes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.*;
import static org.openqa.selenium.By.xpath;

public class ConstantesCampoBy {
    private  By CampoSearch = xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[2]/a");
    private  By BotaoSearch = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/a[2]/label/input");
    private By CampoDeRetornodosCarros = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[3]/div/div[1]");
    private By CampoCorViewsDetails = xpath("/html/body/div[4]/div/div/div/div[2]/table/tbody/tr[5]/td[2]");
    private By CampoYearNaTelaDePesquisa = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[1]/div/div[2]/p[1]");
    private String BotaoViewsDetailsInicio = "/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[";
    private String BotaoViewsDetailsFim = "]/div/div[3]/button[1]";
    private By BotaoClear = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/a[2]/button");
    private By BotaoDelete = cssSelector("body.ng-scope:nth-child(2) div.container.site:nth-child(1) div.ng-scope:nth-child(2) div.row.ng-scope div.ng-scope div.container div.row div.col-sm-9 div.col-sm-4.ng-scope:nth-child(1) div.panel.panel-primary.text-center div.panel-footer > button.center-block.btn.btn-primary.btn-block.btn-xs:nth-child(3)");
    private By botaoAddCar = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/button");
    private By BotaoPopulationFrom = xpath("/html/body/div[4]/div/div/div/div[2]/div/button");
    private By BotaoCreate = xpath("/html/body/div[4]/div/div/div/div[2]/div/form/div[17]/div/button[2]");
    private By MensagemCarCreated = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div/span");
    private By NumerodeCarrosInvenctory = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/text()");
    private By BotaoPrice = cssSelector("#price");
    private By TelacomNomedeTodosCarros = className("panel-heading");
    public By paneltitle = cssSelector(".panel-title");
    private By TelaAdmin = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div");
    private By BotaoOkViewsDetaisls = xpath("/html/body/div[4]/div/div/div/div[3]/button[3]");
    private By botaoCadeado = cssSelector("#admin");
    private By MensagemCarDeleted = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div/span");
    private By BotaoCampoSearch = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/a[2]/label/input");
    private By botaoGuestPrincipal = xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/a/span[1]");
    private By getBotaoGuestComMeunome = xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/a/span[1]");
    private By BotaoMake = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[3]/a[2]");
    private By BotaoModelRLXAWD = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[4]/a[3]");
    private By BotaoLogin = xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/ul/li[1]/a");
    private By campoUsarnameLogin = xpath("//*[@id='login-form']/fieldset/div[1]/input");
    private By campoPassowordLogin = xpath("//*[@id='login-form']/fieldset/div[2]/input");
    private By botaoSignInPagLogin = xpath("//*[@id='login-form']/fieldset/div[3]/button");
    private By BotaoLoanStatus = xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/ul/li[3]/a");
    private By botaoRegister = xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/ul/li[2]/a");
    private By Campoprice = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[1]/div/div[1]");
    private By campoFirstName = xpath("//*[@id=\"registration-form\"]/fieldset/div[1]/input");
    private By campoLastName = xpath("//*[@id=\"registration-form\"]/fieldset/div[2]/input");
    private By campoUsername = xpath("//*[@id=\"registration-form\"]/fieldset/div[3]/input");
    private By campoPassword = xpath("//*[@id=\"registration-form\"]/fieldset/div[4]/input");
    private By botaoRegisterPagRegistro = xpath("//*[@id=\"registration-form\"]/fieldset/div[5]/button");
    private By CampoResultadoBusca = xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]");
    private String CampoYearTelaPesquisaInicio = "/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[";
    private String CampoYearTelaPesquisaFim = "]/div/div[2]/p[1]";
    private By CampoCartaoCarro = xpath("//div[contains(@class, 'panel panel-primary text-center')]");
    private By imagemCarroPagInicial = xpath("/html/body/div[1]/div[2]/div[1]/img");
    private By botaoDealer = xpath("//*[@id=\"field_dealer\"]");
    private By campoModelYear= xpath("//*[@id=\"modelYear\"]");
    private String url_esperada = ConstantesFordWardCar.URL_PAGINA_INICIAL;
    private By botaoLogout = xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/ul/li[4]/a");

    public void clicarBotaoGuest(WebDriver driver){
        driver.findElement(botaoGuestPrincipal).click();
    }
    public void clicarRegister(WebDriver driver){
        driver.findElement(botaoRegister).click();
    }
    public void preencherCamposRegister(WebDriver driver) throws InterruptedException {
        driver.findElement(campoFirstName).sendKeys("Fernanda");
        Thread.sleep(1000);
        driver.findElement(campoLastName).sendKeys("Zimmer");
        Thread.sleep(1000);
        driver.findElement(campoUsername).sendKeys("zimmer13");
        Thread.sleep(1000);
        driver.findElement(campoPassword).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(botaoRegisterPagRegistro).click();
    }

}
