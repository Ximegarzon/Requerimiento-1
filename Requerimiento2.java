package java;

public class AgradecimientosTest {
}
    @Given("estoy en la página principal de la tienda https://www.floristeriamundoflor.com/")
    public void estoyEnLaPaginaPrincipal() {
        openBrowser();
        navigateTo("https://www.floristeriamundoflor.com/");

    @When("selecciono la categoría {string}")
    public void seleccionoLaCategoría(String categoría) {
        clickOnElement(By.xpath("//a[@href='#" + categoría + "']"));


    @Then("se visualizarán los productos para esta categoría")
    public void seVisualizaránLosProductos() {
        waitForElementToBeVisible(By.xpath("//div[@class='product-grid']"));

    @Given("estoy en la categoría {string}")
    public void estoyEnLaCategoría(String categoría) {
        openBrowser();
        navigateTo("https://www.floristeriamundoflor.com/" + categoría);
    }

    @When("de clic en la opción “Añadir al carrito” para dos productos")
    public void deClicEnLaOpciónAñadirAlCarrito() {
        clickOnElement(By.xpath("//button[@class='add-to-cart']"));
        clickOnElement(By.xpath("//button[@class='add-to-cart']"));
    }

    @Then("los productos se agregarán al carrito de compras")
    public void losProductosSeAgregaránAlCarrito() {
        waitForElementToBeVisible(By.xpath("//div[@class='cart-summary']"));
    }
    @Given("he agregado los productos de la categoría {string} al carrito")
    public void heAgregadoLosProductosAlCarrito(String categoría) {
        openBrowser();
        navigateTo("https://www.floristeriamundoflor.com/" + categoría);
        clickOnElement(By.xpath("//button[@class='add-to-cart']"));
        clickOnElement(By.xpath("//button[@class='add-to-cart']"));
    }

    @When("de clic en la opción “CARRO”")
    public void deClicEnLaOpciónCarro() {
        clickOnElement(By.xpath("//a[@href='#carro']"));
    }

    @Then("se deberán visualizar los productos agregados")
    public void seDeberánVisualizarLosProductosAgregados() {
        waitForElementToBeVisible(By.xpath("//div[@class='cart-items']"));


    }
