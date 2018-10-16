package com.grabarski.mateusz.petclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {

    @RequestMapping("", "/", "index", "index.html")
    internal fun index(): String {
        return "index"
    }
}