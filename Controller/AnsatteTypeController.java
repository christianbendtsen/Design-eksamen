package com.design.demo.Controller;

import com.design.demo.Model.AnsatteType;
import com.design.demo.Service.AnsatteTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class AnsatteTypeController {

    @Autowired
    private AnsatteTypeService ansatteTypeService;

    @GetMapping("/ansatteTyper")
    public String getAnsatteType(Model model) {

        List<AnsatteType> ansatteTypeList = ansatteTypeService.getAnsatteType();

        model.addAttribute("ansatteType", ansatteTypeList);
        return "ansatteType";
    }

    @PostMapping("/ansatteType/addNew")
    public String addNew(AnsatteType ansatteType) {
        ansatteTypeService.save(ansatteType);
        return "redirect:/ansatteType";
    }

    @RequestMapping("ansatteType/findById")
    @ResponseBody
    public Optional<AnsatteType> findById(int id) {
        return ansatteTypeService.findById(id);
    }

    @RequestMapping(value="/ansatteType/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(AnsatteType ansatteType) {
        ansatteTypeService.save(ansatteType);
        return "redirect:/ansatteType";
    }

    @RequestMapping(value="/ansatteType/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        ansatteTypeService.delete(id);
        return "redirect:/ansatteType";
    }
}
