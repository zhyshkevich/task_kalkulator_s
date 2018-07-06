package com.solanake.kalkulator.business.cloudant.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService){
        this.countryService = countryService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "redirect:/conctracts";
    }

    // list page
    @RequestMapping(value = "/conctracts", method = RequestMethod.GET)
    public String showAllUsers(Model model) {
        model.addAttribute("countries", countryService.findAll());
        return "conctracts/list";
    }

}
