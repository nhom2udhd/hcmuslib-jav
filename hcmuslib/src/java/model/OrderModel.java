/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.*;
import java.util.*;
import org.hibernate.*;

/**
 *
 * @author RONNY
 */
public class OrderModel {
    public List<Donhang> getAll()
    {
        Session s=HibernateUtil.getSessionFactory().getCurrentSession();
        List<Donhang> lst=new ArrayList();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Donhang.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public String createID(){
        List<Donhang> lst=this.getAll();
        Random r=new Random();
        int num=r.nextInt(99999999);
        String id=String.format("UH%08d", num);
        int i=0;
        Donhang p=lst.get(0);
        while (id.equals(p.getIdDonHang())){
        num=r.nextInt(99999999);
        id=String.format("UH%08d", num);
        i++;
        p=lst.get(i);
        }
        return id;
    }
    
    public void create (Donhang e)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try
        {
            s.beginTransaction();
            s.save(e);
            s.getTransaction().commit();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    
}
