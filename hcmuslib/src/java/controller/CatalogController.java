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
import entity.Bmtacgia;
import java.util.List;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import model.BmTacGiaSachModel;
import model.ValidationResponse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import org.springframework.ui.Model;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/catalog")
public class CatalogController {

    @RequestMapping(value = "/index")
    public String index(){
        return "catalog/index";

    };
    
    @RequestMapping(value = "/bienmuctacgia")
    public String bienmuctacgia(@ModelAttribute("Bmtacgia") Bmtacgia p,ModelMap m)
    {
        
        BmTacGiaSachModel model = new BmTacGiaSachModel();  
        int pageSum = model.CountRow();
        if(pageSum%5 == 0)
            pageSum = pageSum/5-1;
        else 
            pageSum = pageSum/5;
        m.addAttribute("pageSum",pageSum);
        //m.put("Bmtacgia", p);
        //m.put("jtStartIndex", 0);
        return "catalog/bienmuctacgia";
    }
    @RequestMapping(value = "/bmtacgia")
    public String bmtacgia(@ModelAttribute("Bmtacgia") Bmtacgia p, ModelMap m)
    {             
        m.put("Bmtacgia", p);
        return ("catalog/bmtacgia");
    }
    @RequestMapping(value = "/tabletacgia")
    public String tabletacgia(@ModelAttribute("Bmtacgia") Bmtacgia p, ModelMap m,
            @RequestParam("jtStartIndex") int jtStartIndex)
    {             
        BmTacGiaSachModel model = new BmTacGiaSachModel();
        if(jtStartIndex < 0)
            jtStartIndex = 0;
        m.addAttribute("lst",model.getAll(jtStartIndex,5));
        m.put("Bmtacgia", p);
        //m.put("jtStartIndex", jtStartIndex);
        return ("catalog/tabletacgia");
    } 
    
    @RequestMapping(value = "successtacgia", method = RequestMethod.POST)    
    public String successtacgia(@ModelAttribute("Bmtacgia") Bmtacgia p, ModelMap m)
    {       
        BmTacGiaSachModel model = new BmTacGiaSachModel();       
        p.setIdTacGia(model.createID());
        model.Create(p);
        
        m.put("Result","Tác Giả Đã Được Thêm Vào !");
        //m.addAttribute("lst",model.getAll(0,6));
        int pageSum = model.CountRow();
        if(pageSum%5 == 0)
            pageSum = pageSum/5-1;
        else 
            pageSum = pageSum/5;
        m.addAttribute("pageSum",pageSum);
        return "catalog/bienmuctacgia";
    }
    
    @RequestMapping(value = "removetacgia", method = RequestMethod.POST)    
    public String removetacgia(@ModelAttribute("Bmtacgia") Bmtacgia p, ModelMap m)
    {       
        BmTacGiaSachModel model = new BmTacGiaSachModel();
        if(model.Remove(p))
            m.put("Result","Tác Giả Đã Xóa !");
        else
            m.put("Result","Tác Giả Này Tạm Thời Không Xóa Được Do Vi Phạm Ràng Buộc, "
                    + "Hãy Kiểm Tra Lại Các Sách Liên Quan !");
        
        //m.addAttribute("lst",model.getAll(0,6));
        int pageSum = model.CountRow();
        if(pageSum%5 == 0)
            pageSum = pageSum/5-1;
        else 
            pageSum = pageSum/5;
        m.addAttribute("pageSum",pageSum);
        return "catalog/bienmuctacgia";
    }
    
    @RequestMapping(value = "edittacgia", method = RequestMethod.POST)    
    public String edittacgia(@ModelAttribute("Bmtacgia") Bmtacgia p, ModelMap m)
    {       
        BmTacGiaSachModel model = new BmTacGiaSachModel();
        if(model.Edit(p))
            m.put("Result","Tác Giả Đã Được chỉnh sửa !");
        else
            m.put("Result","Lỗi, Xin Thử Lại !");
        int pageSum = model.CountRow();
        if(pageSum%5 == 0)
            pageSum = pageSum/5-1;
        else 
            pageSum = pageSum/5;
        m.addAttribute("pageSum",pageSum);
        //m.addAttribute("lst",model.getAll(0,6));
        
        return  "catalog/bienmuctacgia";
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
