package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Brady on 3/23/17.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value="", method = RequestMethod.GET)
    public String add(Model model){
        return "users/add";
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String add(Model model, @RequestParam("username") String username,
                      @RequestParam("password") String password, @RequestParam("verify") String verify,
                      @RequestParam("email") String email){
        if(password.equals(verify)){
            model.addAttribute("username", username);
            return "users/index";
        }else
            return "users/add";
    }

}
