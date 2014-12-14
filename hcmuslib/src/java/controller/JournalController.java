/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import model.*;
import java.util.*;
import org.springframework.ui.Model;
import entity.*;

@Controller
@RequestMapping(value = "/journal")
public class JournalController {
    
    @RequestMapping(value = "/bmNXB", method = RequestMethod.GET)
    public String getAll_NXB(Model m)
    {
        BmNXBModel model = new BmNXBModel();
        m.addAttribute("lst", model.getAll());
        return "journal/bmNXB";
    }
    
    @RequestMapping(value = "/remove_NXB", method = RequestMethod.GET)
    public String Remove_NXB(@RequestParam(value = "id") String id)
    {
        BmNXBModel model = new BmNXBModel();
        Bmnxb nxb = model.getNXB(id);
        model.Remove(nxb);
        return "redirect:bmNXB.htm";
    }

    @RequestMapping(value = "/edit_NXB", method = RequestMethod.GET)
    public String Edit_NXB(@RequestParam(value = "id") String id, Model m)
    {
        BmNXBModel model = new BmNXBModel();
        Bmnxb nxb = model.getNXB(id);
        m.addAttribute("n_x_b", nxb);
        return "journal/edit_NXB";
    }
    
    @RequestMapping(value = "/update_NXB", method = RequestMethod.POST)
    public String Update_NXB(@ModelAttribute(value = "NXB") Bmnxb nxb)
    {
        BmNXBModel model = new BmNXBModel();
        model.Edit(nxb);
        return "redirect:bmNXB.htm";
    }
    
    @RequestMapping(value = "/create_NXB", method = RequestMethod.POST)
    public String Create_NXB(@ModelAttribute(value = "NXB") Bmnxb nxb)
    {
        BmNXBModel model = new BmNXBModel();
        model.Create(nxb);
        return "redirect:bmNXB.htm";
    }
    
    @RequestMapping(value = "/redirectCreate_NXB", method = RequestMethod.GET)
    public String redirectCreate_NXB()
    {
        return "journal/create_NXB";
    }
    
    @RequestMapping(value = "/bmSPL", method = RequestMethod.GET)
    public String getAll_SPL(Model m)
    {
        BmSoPhanLoaiModel model = new BmSoPhanLoaiModel();
        m.addAttribute("lst", model.getAll());
        return "journal/bmSPL";
    }
    
    @RequestMapping(value = "/remove_SPL", method = RequestMethod.GET)
    public String Remove_SPL(@RequestParam(value = "id") String id)
    {
        BmSoPhanLoaiModel model = new BmSoPhanLoaiModel();
        Bmsophanloai spl = model.getSPL(id);
        model.Remove(spl);
        return "redirect:bmSPL.htm";
    }

    @RequestMapping(value = "/edit_SPL", method = RequestMethod.GET)
    public String Edit_SPL(@RequestParam(value = "id") String id, Model m)
    {
        BmSoPhanLoaiModel model = new BmSoPhanLoaiModel();
        Bmsophanloai spl = model.getSPL(id);
        m.addAttribute("s_p_l", spl);
        return "journal/edit_SPL";
    }
    
    @RequestMapping(value = "/update_SPL", method = RequestMethod.POST)
    public String Update_SPL(@ModelAttribute(value = "SPL") Bmsophanloai spl)
    {
        BmSoPhanLoaiModel model = new BmSoPhanLoaiModel();
        model.Edit(spl);
        return "redirect:bmSPL.htm";
    }
    
    @RequestMapping(value = "/create_SPL", method = RequestMethod.POST)
    public String Create_SPL(@ModelAttribute(value = "SPL") Bmsophanloai spl)
    {
        BmSoPhanLoaiModel model = new BmSoPhanLoaiModel();
        model.Create(spl);
        return "redirect:bmSPL.htm";
    }
    
    @RequestMapping(value = "/redirectCreate_SPL", method = RequestMethod.GET)
    public String redirectCreate_SPL()
    {
        return "journal/create_SPL";
    }
    
    @RequestMapping(value = "/bmTacGia", method = RequestMethod.GET)
    public String getAll_TG(Model m)
    {
        BmTacGiaModel model = new BmTacGiaModel();
        m.addAttribute("lst", model.getAll());
        return "journal/bmTacGia";
    }
    
    @RequestMapping(value = "/remove_TG", method = RequestMethod.GET)
    public String Remove_TG(@RequestParam(value = "id") String id)
    {
        BmTacGiaModel model = new BmTacGiaModel();
        Bmtacgia tg = model.getTG(id);
        model.Remove(tg);
        return "redirect:bmTacGia.htm";
    }

    @RequestMapping(value = "/edit_TG", method = RequestMethod.GET)
    public String Edit_TG(@RequestParam(value = "id") String id, Model m)
    {
        BmTacGiaModel model = new BmTacGiaModel();
        Bmtacgia tg = model.getTG(id);
        m.addAttribute("t_g", tg);
        return "journal/edit_TG";
    }
    
    @RequestMapping(value = "/update_TG", method = RequestMethod.POST)
    public String Update_TG(@ModelAttribute(value = "TG") Bmtacgia tg)
    {
        BmTacGiaModel model = new BmTacGiaModel();
        model.Edit(tg);
        return "redirect:bmTacGia.htm";
    }
    
    @RequestMapping(value = "/create_TG", method = RequestMethod.POST)
    public String Create_TG(@ModelAttribute(value = "TG") Bmtacgia tg)
    {
        BmTacGiaModel model = new BmTacGiaModel();
        model.Create(tg);
        return "redirect:bmTacGia.htm";
    }
    
    @RequestMapping(value = "/redirectCreate_TG", method = RequestMethod.GET)
    public String redirectCreate_TG()
    {
        return "journal/create_TG";
    }
}
