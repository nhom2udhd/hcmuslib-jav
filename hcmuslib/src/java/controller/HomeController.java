/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
