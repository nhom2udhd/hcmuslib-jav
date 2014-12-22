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
public class OrderDetailModel {
    public List<CtDonhang> getAll()
    {
        Session s=HibernateUtil.getSessionFactory().getCurrentSession();
        List<CtDonhang> lst=new ArrayList();
        try {
            s.beginTransaction();
            lst = s.createCriteria(CtDonhang.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public List<CtDonhang> getById(String id)
    {
        Session s=HibernateUtil.getSessionFactory().getCurrentSession();
        List<CtDonhang> lst=new ArrayList();
        try {
            s.beginTransaction();
            lst = s.createSQLQuery("select * from CT_DONHANG where ID_DON_HANG='"+id+"'").addEntity(CtDonhang.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public String createID(){
        List<CtDonhang> lst=this.getAll();
        Random r=new Random();
        int num=r.nextInt(99999999);
        String id=String.format("UH%08d", num);
        int i=0;
        CtDonhang p=lst.get(0);
        while (id.equals(p.getId())){
        num=r.nextInt(99999999);
        id=String.format("UH%08d", num);
        i++;
        p=lst.get(i);
        }
        return id;
    }
    
    public void create (CtDonhang e)
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
