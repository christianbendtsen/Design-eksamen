package com.design.demo.Controller;


import com.design.demo.Model.Kunde;
import com.design.demo.Service.KundeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class KundeController {
    @Autowired
    private KundeService kundeService;


    @GetMapping("/kunder")
    public String getKunder(Model model){
        //List<Kunde> kundeList = kundeService.getKunder();
        model.addAttribute("kunder", kundeService.getKunder());
        return "Kunde";
    }

    @PostMapping("/kunder/addNew")
    public String addNew(Kunde kunde){
        kundeService.save(kunde);
        return "redirect:/kunder";
    }


    @RequestMapping("/kunder/findById")
    @ResponseBody
    public Optional<Kunde> findById(int id){
        return kundeService.findById(id);
    }

    @RequestMapping (value="/kunder/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Kunde kunde){
        kundeService.save(kunde);
        return "redirect:/kunder";
    }

    @RequestMapping (value="/kunder/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        kundeService.delete(id);
        return "redirect:/kunder";
    }
}
