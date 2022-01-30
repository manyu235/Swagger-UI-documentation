package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@RestController
public class HelloController {
  @RequestMapping(method = RequestMethod.GET, path = "/name")
  @ApiOperation(value = "Respond Hello <Name> !!", notes = "Returns a JSON object with a string Hello followed by provided name. "+ "Uses 'World' if a name is not specified")
  @ApiResponses(value = { 
      @ApiResponse(code = 200, message = "Success"),
      @ApiResponse(code = 404, message = "Service not available"),
      @ApiResponse(code = 500, message = "Unexpected Runtime error") })
  public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) 
  {
    return "Hello " + name;
  }
}
