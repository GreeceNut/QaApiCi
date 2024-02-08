package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasToString;

class MobileBankApiTestV4 {
    @Test
    void shouldReturnDemoAccounts() {
      // Given - When - Then
      // Предусловия
        // Выполняемые действия
        // Проверки
        // Выполняемые действия
        // Проверки
        // .contentType ("currency", "enum"() equalTo("RUB", "USD", "RUB"))
        given()
            .baseUri("http://localhost:9999/api/v1")
        // Выполняемые действия
        .when()
            .get("/demo/accounts")
        // Проверки
        .then()
            .statusCode(200)
            .body(matchesJsonSchemaInClasspath("accounts.schema.json"))
              .body("[0].currency", equalTo("RUB"))
              .body("[1].currency", equalTo("USD"))
              .body("[2].currency", equalTo("RUB"))
      ;
    }
}
