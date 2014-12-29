/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.*;
import java.util.*;
import org.hibernate.*;
public class AnPhamModel {
    public List<Anpham> getAll()
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Anpham> lst = new ArrayList<Anpham>();
        try
        {
            s.beginTransaction();
            lst = s.createCriteria(Anpham.class).list();
            s.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return lst;
    }
}