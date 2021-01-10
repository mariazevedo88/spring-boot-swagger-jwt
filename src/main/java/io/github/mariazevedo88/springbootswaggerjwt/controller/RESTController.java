package io.github.mariazevedo88.springbootswaggerjwt.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Clients")
@RestController(value = "/clients")
public class RESTController {
	
    @GetMapping
    @ApiOperation(value = "This method is used to get the clients.")
    public List<String> getClients() {
        return Arrays.asList("First Client", "Second Client");
    }

}
