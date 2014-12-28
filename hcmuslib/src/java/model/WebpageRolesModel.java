/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.*;
import java.util.*;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class WebpageRolesModel {

    public List<WebpagesRoles> getAll() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<WebpagesRoles> lst = new ArrayList();
        try {
            s.beginTransaction();
            lst = s.createCriteria(WebpagesRoles.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public List<WebpagesRoles> getByCondition(String con) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        String query = "select * from webpages_Roles where "+con;
        
        List<WebpagesRoles> lst = new ArrayList();
        try {
            s.beginTransaction();
            lst= s.createSQLQuery(query).addEntity(WebpagesRoles.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }

}
