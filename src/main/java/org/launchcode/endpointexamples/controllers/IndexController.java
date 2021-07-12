package org.launchcode.endpointexamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping
public class IndexController {

    // endpoint: GET /
    @GetMapping
    @ResponseBody
    public String getIndex() {
        return "GET Index";
    }

    // endpoint: POST /
    @PostMapping
    @ResponseBody
    public HashMap<String, String> postIndex() {
        HashMap<String, String> resp = new HashMap<>();
        resp.put("path", "/");
        resp.put("method", "POST");
        return resp;
    }
}
