package micronaut.swagger.api.controller;

import io.micronaut.context.annotation.Property;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import micronaut.swagger.api.SwaggerClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

/**
 * @author Anton Kurako (GoodforGod)
 * @since 25.9.2020
 */
@Property(name = "swagger.rapidoc.enabled", value = "true")
@MicronautTest
class RapidocControllerTests extends Assertions {

    @Inject
    private SwaggerClient client;

    @Test
    void isPresent() {
        final HttpResponse<?> response = client.getRapidoc();
        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.status());
        assertNotNull(response.body());
    }
}
