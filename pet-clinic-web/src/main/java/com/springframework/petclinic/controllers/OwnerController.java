package com.springframework.petclinic.controllers;

import com.springframework.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shivam (techSavyThor) on 05/11/2019
 */

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"owners","/owners/index","/owners/index.html   "})
    public String ownerList(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
}
