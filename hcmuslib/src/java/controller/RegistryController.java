/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.*;
import model.*;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/registry")
public class RegistryController {

    @RequestMapping(value = "/index")
    public String index(ModelMap m) {
        m.put("account", new UserPassword());
        return "account/register";
    }

    @RequestMapping(value = "/valid", method = RequestMethod.POST)
    public String check(@ModelAttribute("account") @Valid UserPassword p,
            BindingResult result, ModelMap m) {
        UserPasswordModel model = new UserPasswordModel();
        m.put("account", p);
        if (result.hasErrors()) {
            List<FieldError> lst = result.getFieldErrors();
            for (FieldError fieldError : lst) {
                if (fieldError.getField().equals("userName")) {
                    m.put("username", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equals("password")) {
                    m.put("password", fieldError.getDefaultMessage());
                }

            }
            return "account/register";
        } else {
            WebpageRolesModel roleModel = new WebpageRolesModel();
            List<WebpagesRoles> r = roleModel.getByCondition("RoleName = 'Reader'");
            WebpagesRoles role = r.get(0);

            p.setWebpagesRoles(role);
            model.create(p);
            return "account/regis_success";
        }

    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String isExist(@RequestParam(value = "username") String username) {
        UserPasswordModel model = new UserPasswordModel();
        List<UserPassword> lst = model.getByCondition("USER_NAME = " + username);
        String rs;
        if (lst.size() > 0) {
            rs = "Tài khoản đã tồn tại";
        } else {
            rs = "Tài khoản hợp lệ!";
        }
        return rs;
    }
}
