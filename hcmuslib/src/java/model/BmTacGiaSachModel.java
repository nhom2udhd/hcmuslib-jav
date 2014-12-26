/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.*;
import java.util.*;
import org.hibernate.*;
public class BmTacGiaSachModel {
    public int CountRow()
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
            return lst.size();
    }

    public List<Bmtacgia> getAll(int jxIndexPage, int jxPage)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Bmtacgia> lst = new ArrayList<Bmtacgia>();
        String query = "select * form BMTACGIA";
        try {
            s.beginTransaction();
            Query q = s.createSQLQuery(query).addEntity(BmTacGiaSachModel.class);
            q.setMaxResults(jxPage);
            q.setFirstResult(jxIndexPage);
            lst = q.list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public boolean Create(Bmtacgia e)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try
        {
            s.beginTransaction();
            s.save(e);
            s.getTransaction().commit();
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            s.getTransaction().rollback();
            return false;
        }
    }
    
    public boolean Remove(Bmtacgia e)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try
        {
            s.beginTransaction();
            s.delete(e);
            s.getTransaction().commit();
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            s.getTransaction().rollback();
            return false;
        }
    }
    
    public boolean Edit(Bmtacgia e)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try
        {
            s.beginTransaction();
            s.update(e);
            s.getTransaction().commit();
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            s.getTransaction().rollback();
            return false;
        }
    }
       
}
