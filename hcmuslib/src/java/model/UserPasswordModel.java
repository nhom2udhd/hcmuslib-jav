/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
}
