/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import entity.*;
import java.util.List;
import javax.servlet.http.HttpSession;
import model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/account")
public class AccountController {
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(ModelMap m){
        m.put("login", new UserPassword());
        return "account/login";
    }
    
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:index.htm";
    };
    
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String check(@ModelAttribute(value = "login") UserPassword p, 
            HttpSession session){
        
        List<UserPassword> lst=(new UserPasswordModel()).getAll();
        boolean rs=false;
        for (UserPassword u: lst){
            if (u.getUserName().equals(p.getUserName()) && u.getPassword().equals(p.getPassword())){
                rs=true;
                p=u;
                break;
            }
        }
        
        if (rs){
            String role=p.getWebpagesRoles().getRoleName();
            session.setAttribute("user", p);
            session.setAttribute("username", p.getUserName());
            session.setAttribute("role", role);
            if(role.equals("CatalogManager")){
                return "redirect:/catalog/index.htm";
            }
            if (role.equals("JournalManager")){
                return "redirect:/journal/index.htm";
            }
            if (role.equals("SuppleManager")){
                return "redirect:/supplement/index.htm";
            }
        }
        return "redirect:/home/contact.htm";
    }
}
