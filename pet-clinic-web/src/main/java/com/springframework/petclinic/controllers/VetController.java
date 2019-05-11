package com.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shivam (techSavyThor) on 05/11/2019
 */
@Controller
public class VetController {
    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
