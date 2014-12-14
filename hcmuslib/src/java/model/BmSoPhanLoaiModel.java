/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.*;
import java.util.*;
import org.hibernate.*;
public class BmSoPhanLoaiModel {
    public List<Bmsophanloai> getAll()
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Bmsophanloai> lst = new ArrayList<Bmsophanloai>();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Bmsophanloai.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public void Create(Bmsophanloai e)
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
    
    public void Remove(Bmsophanloai e)
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
    
    public void Edit(Bmsophanloai e)
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
    
    public Bmsophanloai getSPL(String id)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Bmsophanloai spl = new Bmsophanloai();
        try
        {
            s.beginTransaction();
            spl = (Bmsophanloai)s.get(Bmsophanloai.class, id);
            s.getTransaction().commit();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
        return spl;
    }
}
