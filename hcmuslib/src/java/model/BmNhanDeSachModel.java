/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Bmnhandechinh;
import entity.Sach;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Shady
 */
public class BmNhanDeSachModel {
    public String Find(String key)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();        
        String nhande = null;
        List<Bmnhandechinh> temp = new ArrayList<Bmnhandechinh>();
        try {
            s.beginTransaction();
            String query = "select * from BMNHANDECHINH where id_nhan_de = :keyword";
            Query q = s.createSQLQuery(query).addEntity(Bmnhandechinh.class);
            q.setParameter("keyword", key);
            
            temp = q.list();
            nhande = temp.get(0).getNhanDeChinh();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return nhande;
    }
}
