/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.*;
import java.util.*;
import org.hibernate.*;
public class BmNXBModel {
    public List<Bmnxb> getAll()
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Bmnxb> lst = new ArrayList<Bmnxb>();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Bmnxb.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public void Create(Bmnxb e)
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
    
    public void Remove(Bmnxb e)
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
    
    public void Edit(Bmnxb e)
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
    
    public Bmnxb getNXB(String id)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Bmnxb nxb = new Bmnxb();
        try
        {
            s.beginTransaction();
            nxb = (Bmnxb)s.get(Bmnxb.class, id);
            s.getTransaction().commit();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
        return nxb;
    }
}

