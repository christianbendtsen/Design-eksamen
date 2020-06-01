package com.design.demo.Controller;

import com.design.demo.Model.Ansat;
import com.design.demo.Service.AnsatService;
import com.design.demo.Service.AnsatteTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AnsatController {

    @Autowired
    private AnsatService ansatService;
    @Autowired
    private AnsatteTypeService ansatteTypeService;


    @GetMapping("/ansatte")
    public String getAnsatte(Model model){
        //model.addAttribute("ansatteType",ansatteTypeService.getAnsatteType());
        model.addAttribute("ansatte", ansatService.getAnsatte());

        return "Ansat";
    }

    @PostMapping("/ansatte/addNew")
    public String addNew(Ansat ansat){
        ansatService.save(ansat);
        return "redirect:/ansatte";
    }


    @RequestMapping("ansatte/findById")
    @ResponseBody
    public Optional<Ansat> findById(int id) {
        return ansatService.findById(id);
    }

    @RequestMapping(value="/ansatte/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Ansat ansat) {
        ansatService.save(ansat);
        return "redirect:/ansatte";
    }

    @RequestMapping(value="/ansatte/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        ansatService.delete(id);
        return "redirect:/ansatte";
    }



}
