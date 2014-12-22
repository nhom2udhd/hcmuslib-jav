/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import entity.CtDonhang;
import entity.Donhang;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/supplement")
public class SupplementController {
    

    @RequestMapping(value = "/order/index")
    public String index(Model m) {
        OrderModel model = new OrderModel();
        m.addAttribute("orders",model.getAll());
        return "supplement/index";
    }
    
    @RequestMapping(value = "/order/create",method = RequestMethod.GET)
    public String order() {
        return "supplement/order";
    }
    
    @RequestMapping(value = "/order/create",method = RequestMethod.POST)
    public String create(HttpServletRequest request) {
        OrderModel order = new OrderModel();
        
        Donhang dh = new Donhang();
        String iddh = order.createID();
        dh.setIdDonHang(iddh);
        Date dateobj = new Date();
        dh.setNgayLap(dateobj);
        dh.setTinhTrang("0");
        dh.setDiaChiGoi(request.getParameter("order-des"));
        dh.setHinhThucThanhToan(request.getParameter("payment-type"));
        dh.setDonViTienTe(request.getParameter("currency-type"));
        order.create(dh);
        int number = Integer.parseInt(request.getParameter("number-items"));
        for (int i = 1; i <= number; i++ ) {
            OrderDetailModel orderdl = new OrderDetailModel(); 
            CtDonhang ct = new CtDonhang();
            ct.setDonhang(dh); 
            String itemName = "item-name-"+i;
            String itemNumber = "item-number-"+i;
            ct.setTenSanPham(request.getParameter(itemName));
            ct.setSoLuong(Integer.parseInt(request.getParameter(itemNumber)));
            orderdl.create(ct);
        }
        return "redirect:index.htm";
    }
    
    @RequestMapping(value = "/order/getitem",method = RequestMethod.GET)
     public String getitem(HttpServletRequest request, ModelMap m) {
        String number = request.getParameter("number");
        m.put("number",Integer.parseInt(number)+1); 
        return "supplement/item";
    }
     
    @RequestMapping(value = "/order/detail",method = RequestMethod.GET)
    public String detail(@RequestParam(value = "id") String id, Model m) {
        OrderDetailModel orderdl = new OrderDetailModel();
        m.addAttribute("orderdls",orderdl.getById(id));
        m.addAttribute("id",id);
        return "supplement/detail";
    }

}


