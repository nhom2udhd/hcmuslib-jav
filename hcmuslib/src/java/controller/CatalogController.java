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
import model.BmtacgiaModel;
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
        
        BmtacgiaModel model = new BmtacgiaModel();  
        int pageSum = model.CountRow();
        if(pageSum%6==0)
            pageSum = pageSum/6+1;
        else
            pageSum = pageSum/6;
        m.addAttribute("pageSum",pageSum);
        //m.put("Bmtacgia", p);
        m.put("jtStartIndex", 0);
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
        BmtacgiaModel model = new BmtacgiaModel();
        if(jtStartIndex < 0)
            jtStartIndex = 0;
        m.addAttribute("lst",model.getAll(jtStartIndex,6));
        m.put("Bmtacgia", p);
        //m.put("jtStartIndex", jtStartIndex);
        return ("catalog/tabletacgia");
    }
    /*
    @RequestMapping(value = "/validtacgia", method = RequestMethod.POST)
    public String validtacgia(@ModelAttribute("Bmtacgia") @Valid Bmtacgia p,
            BindingResult result, ModelMap m)
    {       
        
        
        if(result.hasErrors())
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
            List<FieldError> lst = result.getFieldErrors();
            for(FieldError fieldError : lst){
                if(fieldError.getField().equals("hoTen"))
                    m.put("hoTencheck", fieldError.getDefaultMessage());
                if(fieldError.getField().equals("tinhTrang"))
                    m.put("tinhTrang", fieldError.getDefaultMessage());
                
            }
            return "catalog/bmtacgia";
        }
        else
        {
            BmtacgiaModel model = new BmtacgiaModel();
            model.create(p);
            m.put("Result", "Create Success");
        }
        return "catalog/success";
    }
    @RequestMapping(value="/validtacgia", method = RequestMethod.POST)
    public ValidationResponse processForm (Model model, @Valid Bmtacgia p, BindingResult result ) {
        ValidationResponse res = new ValidationResponse();
        if(!result.hasErrors()){
          res.setStatus("SUCCESS");
        }
        else{
            List<FieldError> lst = result.getFieldErrors();
            res.setErrorMessageList(lst);
        }
        return res;
    }*/
    
    @RequestMapping(value = "successtacgia", method = RequestMethod.POST)    
    public String successtacgia(@ModelAttribute("Bmtacgia") Bmtacgia p, ModelMap m)
    {       
        BmtacgiaModel model = new BmtacgiaModel();
        boolean create = false;
        while(!create)
        {
            //them id tac gia           
            Random rand = new Random();
            int randomInt;
            randomInt = rand.nextInt((99999999 - 10000000) + 1) + 10000000;
            p.setIdTacGia("TG" +  randomInt);
            create = model.create(p);          
        }
        m.put("Result","Tác Giả Đã Được Thêm Vào !");
        m.addAttribute("lst",model.getAll(0,6));
        return "catalog/bienmuctacgia";
    }
    
    @RequestMapping(value = "removetacgia", method = RequestMethod.POST)    
    public String removetacgia(@ModelAttribute("Bmtacgia") Bmtacgia p, ModelMap m)
    {       
        BmtacgiaModel model = new BmtacgiaModel();
        if(model.remove(p))
            m.put("Result","Tác Giả Đã Xóa !");
        else
            m.put("Result","Tác Giả Này Tạm Thời Không Xóa Được Do Vi Phạm Ràng Buộc, "
                    + "Hãy Kiểm Tra Lại Các Sách Liên Quan !");
        
        m.addAttribute("lst",model.getAll(0,6));
        
        return "catalog/bienmuctacgia";
    }
    
    @RequestMapping(value = "edittacgia", method = RequestMethod.POST)    
    public String edittacgia(@ModelAttribute("Bmtacgia") Bmtacgia p, ModelMap m)
    {       
        BmtacgiaModel model = new BmtacgiaModel();
        if(model.edit(p))
            m.put("Result","Tác Giả Đã Được chỉnh sửa !");
        else
            m.put("Result","Lỗi, Xin Thử Lại !");
        
        m.addAttribute("lst",model.getAll(0,6));
        
        return "catalog/bienmuctacgia";
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
