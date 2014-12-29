/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import entity.*;
import entity.Sach;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import model.*;
import model.ValidationResponse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import org.springframework.ui.Model;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/contact")
    public String contact() {
        return "home/contact";
    }

    @RequestMapping(value = "/about")
    public String about() {
        return "home/about";
    }
    
    @RequestMapping(value = "/searchbooks")
    public String searchbooks(@ModelAttribute("Sach") Sach p, 
            @RequestParam("keysearch") String keysearch, ModelMap m) {
        BookModel model = new BookModel();
        List<Sach> lst = new ArrayList<Sach>();
        lst = model.getAllList(keysearch);                     
        m.addAttribute("lst", lst );
        m.put("result",lst.size());
        return "home/searchbooks";
    }
    
    @RequestMapping(value = "/bookdetail", method = RequestMethod.POST)
    public String bookdetail (@ModelAttribute("Sach") Sach p, ModelMap m) {
        BookModel model = new BookModel();
        Sach book = new Sach();
        book = model.Find(p.getIdSach());
        m.put("book",book);
        return "home/bookdetail";
    }
    
}
