package configHook;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class LerProperties {
    String baseUri;
    String register;
    String cadastrarVeiculo;
    String paginaLogin;
    String paginaInventory;
    String chrome;
    String configChromeDriver;
    String caminhoedgedriver;
    String configedgedriver;
    String caminhofirefoxdriver;
    String configfirefoxdriver;
    int drivers;
    private Properties prop = new Properties();
    public LerProperties() throws IOException {
        prop.load(Files.newInputStream(Paths.get("src/test/resources/properties/drivers.properties")));
        prop.load(Files.newInputStream(Paths.get("src/test/resources/properties/url.properties")));

        this.baseUri = prop.getProperty("baseURI");
        this.register = prop.getProperty("register");
        this.cadastrarVeiculo = prop.getProperty("cadastrarVeiculo");
        this.paginaLogin =prop.getProperty("paginaLogin");
        this.paginaInventory = prop.getProperty("paginaInventory");
        this.chrome = prop.getProperty("caminhochromedriver");
        this.configChromeDriver = prop.getProperty("configchromedriver");
        this.caminhoedgedriver = prop.getProperty("configedgedriver");
        this.configedgedriver = prop.getProperty("caminhoedgedriver");
        this.drivers = Integer.parseInt(prop.getProperty("drivers"));
        this.caminhofirefoxdriver = prop.getProperty("caminhofirefoxdriver");
        this.configfirefoxdriver = prop.getProperty("configfirefoxdriver");

}

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getCadastrarVeiculo() {
        return cadastrarVeiculo;
    }

    public void setCadastrarVeiculo(String cadastrarVeiculo) {
        this.cadastrarVeiculo = cadastrarVeiculo;
    }

    public String getPaginaLogin() {
        return paginaLogin;
    }

    public void setPaginaLogin(String paginaLogin) {
        this.paginaLogin = paginaLogin;
    }

    public String getPaginaInventory() {
        return paginaInventory;
    }

    public void setPaginaInventory(String paginaInventory) {
        this.paginaInventory = paginaInventory;
    }

    public String getChrome() {
        return chrome;
    }

    public void setChrome(String chrome) {
        this.chrome = chrome;
    }

    public String getConfigChromeDriver() {
        return configChromeDriver;
    }

    public void setConfigChromeDriver(String configChromeDriver) {
        this.configChromeDriver = configChromeDriver;
    }

    public String getCaminhoedgedriver() {
        return caminhoedgedriver;
    }

    public void setCaminhoedgedriver(String caminhoedgedriver) {
        this.caminhoedgedriver = caminhoedgedriver;
    }

    public String getConfigedgedriver() {
        return configedgedriver;
    }

    public void setConfigedgedriver(String configedgedriver) {
        this.configedgedriver = configedgedriver;
    }

    public String getCaminhofirefoxdriver() {
        return caminhofirefoxdriver;
    }

    public void setCaminhofirefoxdriver(String caminhofirefoxdriver) {
        this.caminhofirefoxdriver = caminhofirefoxdriver;
    }

    public String getConfigfirefoxdriver() {
        return configfirefoxdriver;
    }

    public void setConfigfirefoxdriver(String configfirefoxdriver) {
        this.configfirefoxdriver = configfirefoxdriver;
    }

    public int getDrivers() {
        return drivers;
    }

    public void setDrivers(int drivers) {
        this.drivers = drivers;
    }
}
