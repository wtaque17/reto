package com.capsula.reto.busqueda.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.capsula.reto.busqueda.drivers.Chromedriver.chrome;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class busquedaAmazon {

    @Before
    public void usuario() {
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled("usuario");
    }
    @Given("El usuario ingresa a Amazon")
    public void elUsuarioIngresaAAmazon() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(chrome().conURL("www.amazon.com")));
    }

    @When("Realiza la busqueda de la palabra Nintendo")
    public void realizaLaBusquedaDeLaPalabraNintendo() {
    }

    @Then("Se muestran resultados con la palabra animal")
    public void seMuestranResultadosConLaPalabraAnimal() {
    }
}
