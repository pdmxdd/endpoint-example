package org.launchcode.endpointexamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/name")
public class NameController {

    private static String name = "Paul";

    // GET /name
    @GetMapping
    @ResponseBody
    public String getName() {
        return name;
    }

    // POST /name
    @PostMapping
    @ResponseBody
    public String postName(@RequestParam String n) {
        name = n;
        return "OK";
    }

    // POST /name/{name}
    @PostMapping(value = "/{theName}")
    @ResponseBody
    public String postNamePathVariable(@PathVariable String theName) {
        name = theName;
        return "OK";
    }

    // GET /name/form
    @GetMapping(value = "/form")
    @ResponseBody
    public String getNameForm() {
        String formString = "<html><form method=\"post\">";
        formString += "<label for=\"n\">Name: <input type=\"text\" id=\"n\" name=\"n\"></label>";
        formString += "<input type=\"submit\">";
        formString += "</form></html>";
        return formString;
    }

    // POST /name/form
    @PostMapping(value = "/form")
    @ResponseBody
    public String postNameForm(@RequestParam String n) {
        name = n;
        return "OK";
    }
}
