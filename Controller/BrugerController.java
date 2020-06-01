package com.design.demo.Controller;


import com.design.demo.Model.Bruger;
import com.design.demo.Service.BrugerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class BrugerController {

    @Autowired
    private BrugerService brugerService;

    @GetMapping("/brugere")
    public String getCountries() {
        return "Bruger";
    }


    //Modified method to Add a new user User
    @PostMapping(value="brugere/addNew")
    public RedirectView addNew(Bruger user, RedirectAttributes redir) {

        brugerService.save(user);

        RedirectView  redirectView= new RedirectView("/login",true);

        redir.addFlashAttribute("message",	"You successfully registered! You can now login");

        return redirectView;
    }
}
