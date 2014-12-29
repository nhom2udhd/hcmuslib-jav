/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.*;
import java.util.*;
import org.hibernate.*;
public class BmTacGiaModel {
    public List<Bmtacgia> getAll()
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Bmtacgia> lst = new ArrayList<Bmtacgia>();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Bmtacgia.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public void Create(Bmtacgia e)
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
    
    public void Remove(Bmtacgia e)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try
        {
            s.beginTransaction();
            s.delete(e);
            s.getTransaction().commit();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    
    public void Edit(Bmtacgia e)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try
        {
            s.beginTransaction();
            s.update(e);
            s.getTransaction().commit();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    
    public Bmtacgia getTG(String id)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Bmtacgia tg = new Bmtacgia();
        try
        {
            s.beginTransaction();
            tg = (Bmtacgia)s.get(Bmtacgia.class, id);
            s.getTransaction().commit();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
        return tg;
    }

    public String createID_TG()
    {
        List<Bmtacgia> lst = this.getAll();
        Random r = new Random();
        int num = r.nextInt(99999999);
        String id = String.format("TG%08d", num);
        int i = 0;
        Bmtacgia p = lst.get(0);
        while (id.equals(p.getIdTacGia()))
        {
            num = r.nextInt(99999999);
            id = String.format("TG%08d", num);
            i++;
            p = lst.get(i);
        }
        return id;
    }
}
