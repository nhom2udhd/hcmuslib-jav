/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Shady
 */
import entity.*;
import java.util.*;
import org.hibernate.*;

public class BmtacgiaModel {
    
    public int CountRow()
    {        
	Session s = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        List<Bmtacgia> lst = new ArrayList<Bmtacgia>();
        try{
            s.beginTransaction();
            lst = s.createCriteria(Bmtacgia.class).list();
            s.getTransaction().commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return lst.size();
    }
    
    public List<Bmtacgia> getAll(int jtStartIndex, int jtPageSize)
    {
        Session s = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        List<Bmtacgia> lst = new ArrayList<Bmtacgia>();
	String query="select * from BMTACGIA";
        
        try{
            s.beginTransaction();
            Query q = s.createSQLQuery(query).addEntity(Bmtacgia.class);
            q.setFirstResult(jtStartIndex*jtPageSize);
            q.setMaxResults(jtPageSize);
            lst = q.list();
            s.getTransaction().commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
    //Create a new Bmtacgia item function
    public boolean create (Bmtacgia t)
    {
        Session s = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        try{
            s.beginTransaction();
            s.save(t);
            s.getTransaction().commit();
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            s.getTransaction().rollback();
            return false;
        }
    }
    
    //Remove Bmtacgia
    public boolean remove (Bmtacgia t)
    {
        Session s = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        try{
            s.beginTransaction();
            s.delete(t);
            s.getTransaction().commit();
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            s.getTransaction().rollback();
            return false;
        }
    }
    
    //Edit Bmtacgia
    public boolean edit (Bmtacgia t)
    {
        Session s = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        try{
            s.beginTransaction();
            s.update(t);
            
            s.getTransaction().commit();
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            s.getTransaction().rollback();
            return false;
        }
    }
}
