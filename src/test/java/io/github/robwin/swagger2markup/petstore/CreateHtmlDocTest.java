package io.github.robwin.swagger2markup.petstore;

import io.github.robwin.swagger2markup.SwaggerConfig;

import org.junit.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.swagger2html.Swagger2Html;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@SpringBootTest(classes = {Application.class, SwaggerConfig.class})
public class CreateHtmlDocTest {

    @Test
    public void createHtml() throws IOException {
        Swagger2Html s2h = new Swagger2Html();
        Writer writer = new FileWriter("global-case.html");
        s2h.toHtml("http://59.110.157.190:8080/api/swagger.json", writer);
    }
}
