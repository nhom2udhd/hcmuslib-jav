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
import org.springframework.web.bind.annotation.RequestMethod;
import entity.Bmtacgia;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
@Controller
@RequestMapping(value = "/catalog")
public class CatalogController {

    @RequestMapping(value = "/index")
    public String index(){
        return "catalog/index";

    };
    
    @RequestMapping(value = "/bmtacgia")
    public String bmtacgia()
    {
        
        return "catalog/bmtacgia";
    }
    @RequestMapping(value = "/validtacgia", method = RequestMethod.POST)
    public String check(@ModelAttribute("Bmtacgia") @Valid Bmtacgia p,
            BindingResult result, ModelMap m)
    {
        m.put("Bmtacgia",p);
        m.put("hoTen",p.getHoTen());
        m.put("butDanh",p.getButDanh());
        m.put("thongTinBoSung",p.getThongTinBoSung());
        if(p.getTinhTrang().equals("Hoat Dong"))
        {
            m.put("option1","selected");  
            m.put("option2"," "); 
        }
        if(p.getTinhTrang().equals("Ngung Hoat Dong"))
        {
            m.put("option2","selected");
            m.put("option1"," ");
        }
        if(result.hasErrors())
        {
            List<FieldError> lst = result.getFieldErrors();
            for(FieldError fieldError : lst){
                if(fieldError.getField().equals("hoTen"))
                    m.put("hoTencheck", fieldError.getDefaultMessage());
                if(fieldError.getField().equals("tinhTrang"))
                    m.put("tinhTrang", fieldError.getDefaultMessage());
                
            }
            return "catalog/bmtacgia";
        }
        return "successtacgia";
    }
    
    @RequestMapping(value = "successtacgia", method = RequestMethod.POST)    
    public String successtacgia()
    {
        
        return "successtacgia";
    }
    
    @RequestMapping(value = "/bmnhandechinh")
    public String bmnhandechinh()
    {
        
        return "catalog/bmnhandechinh";
    }
    
    @RequestMapping(value = "/bmsophanloai")
    public String bmsophanloai()
    {
        
        return "catalog/bmsophanloai";
    }
    
    @RequestMapping(value = "/bmtendemuc")
    public String bmtendemuc()
    {
        
        return "catalog/bmtendemuc";
    }
    
    @RequestMapping(value = "/bmnxb")
    public String bmnxb()
    {
        
        return "catalog/bmnxb";
    }
}
