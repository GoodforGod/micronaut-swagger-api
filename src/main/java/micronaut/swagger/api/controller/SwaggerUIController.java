package micronaut.swagger.api.controller;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Maybe;
import io.swagger.v3.oas.annotations.Hidden;
import micronaut.swagger.api.SwaggerSettings;

/**
 * @author Anton Kurako (GoodforGod)
 * @since 20.9.2020
 */
@Hidden
@Requires(property = SwaggerSettings.PREFIX + ".ui.enabled", value = "true", defaultValue = "true")
@Controller("${swagger.ui.path:/swagger/ui}")
public class SwaggerUIController {

    @Get(produces = MediaType.TEXT_HTML)
    public Maybe<String> getSwagger() {
        return Maybe.empty();
    }
}
