/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*Sercure J2EE Application
 */

package model;
import entity.*;
import java.util.*;
import org.hibernate.*;
public class UserPasswordModel {
    public List<UserPassword> getAll()
    {
        Session s=HibernateUtil.getSessionFactory().getCurrentSession();
        List<UserPassword> lst=new ArrayList();
        try {
            s.beginTransaction();
            lst = s.createCriteria(UserPassword.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public List<UserPassword> getByCondition(String con){
        Session s=HibernateUtil.getSessionFactory().getCurrentSession();
        List<UserPassword> lst=new ArrayList();
        try {
            s.beginTransaction();
            lst = s.createSQLQuery("select * from USER_PASSWORD where "+con).addEntity(UserPassword.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    public void create(UserPassword u){
        Session s=HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(u);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    
}
