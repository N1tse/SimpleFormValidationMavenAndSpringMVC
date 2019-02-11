/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.pojos.User;
import com.pojos.UserDao;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ntsep
 */
@Controller
public class MainController {
    
    
    //trimms every string from form,so whiteSpaces wont pass the validation
    @InitBinder()
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }
    
    
    @RequestMapping("index")
    public ModelAndView homepage(){
        ModelAndView model = new ModelAndView("homepage");
        model.addObject("user", new User());
        return model;
    }
    @PostMapping("registerForm")
    public ModelAndView register(@Valid @ModelAttribute("user") User user,BindingResult theBindingResult){
        if(theBindingResult.hasErrors()){
            return new ModelAndView("homepage");
        }else{
            System.out.println("Binding result: " + theBindingResult);   
            UserDao u = new UserDao();
            ModelAndView model =  new ModelAndView("actionMade");
//            String result = u.registerUser(user.getUsername(), user.getPassword(), user.getFname(), user.getLname(), user.getFreePasses(), user.getPostalCode());
//            model.addObject("result", result);
            return model;
        }
    }
}
