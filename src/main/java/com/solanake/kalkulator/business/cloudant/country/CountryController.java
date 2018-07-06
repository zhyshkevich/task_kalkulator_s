package com.solanake.kalkulator.business.cloudant.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService){
        this.countryService = countryService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "redirect:/contracts";
    }

    @RequestMapping(value = "/contracts", method = RequestMethod.GET)
    public String showAllUsers(Model model) {
        model.addAttribute("countries", countryService.findAll());
        return "contracts/list";
    }

    @RequestMapping(value = "/contracts/{uuid}", method = RequestMethod.GET)
    public String showConctract(@PathVariable("uuid") String uuid, Model model) {

        CountryModel countryModel = countryService.findByUuid(uuid);
        if (countryModel == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "User not found");
        }
        model.addAttribute("country", countryModel);

        return "contracts/show";
    }

    @RequestMapping(value = "/contracts", method = RequestMethod.POST)
    public String calculateEarnings(ModelMap model,
                                    @RequestParam String countryName,
                                    @RequestParam String currencyCode,
                                    @RequestParam String tax,
                                    @RequestParam String cost){

        CountryModel countryModel = new CountryModel();
        countryModel.setCountryName(countryName);
        countryModel.setCurrencyCode(currencyCode);
        countryModel.setCost(Double.parseDouble(cost));
        countryModel.setTax(Double.parseDouble(tax));

        model.addAttribute(countryModel);

        countryService.create(countryModel);
        return "redirect:contracts/";
    }

    @RequestMapping(value = "/contracts/add", method = RequestMethod.GET)
    public String showAddUserForm(Model model) {
        return "contracts/contractform";
    }

    @RequestMapping(value = "/contractsCalc", method = RequestMethod.POST)
    public String calculateEarnings(@RequestParam String value,
                                   @RequestParam("uuid") String uuid,
                                   Model model) {

        CountryModel countryModel = countryService.findByUuid(uuid);
        Double result = countryService.calculateEarnings(countryModel.getCountryName(), Double.parseDouble(value));

        model.addAttribute("salary", result);

        return "contracts/calculation";
        }

    @RequestMapping(value = "/contracts/{uuid}/delete", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("uuid") String uuid) {

        countryService.delete(uuid);
        return "redirect:/contracts";

    }
}
