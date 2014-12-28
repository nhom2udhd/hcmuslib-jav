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
        String query = "select * from BMTACGIA";
        try {
            s.beginTransaction();
            Query q = s.createSQLQuery(query).addEntity(Bmtacgia.class);
            q.setMaxResults(jxPage);
            q.setFirstResult(jxIndexPage*jxPage);
            lst = q.list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public List<Bmtacgia> getAllList()
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
    
    public boolean Create(Bmtacgia e)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();     
        try
        {
            s.beginTransaction();
            Query q = s.createSQLQuery("insert into dbo.BMTACGIA(ID_TAC_GIA, HO_TEN, BUT_DANH, THONG_TIN_BO_SUNG, TINH_TRANG) "
                    + "values(:idtacgia,:hoten,:butdanh,:tt,:tinhtrang)");
            q.setParameter("idtacgia", e.getIdTacGia());
            q.setParameter("hoten", e.getHoTen());
            q.setParameter("butdanh", e.getButDanh());
            q.setParameter("tt", e.getThongTinBoSung());
            q.setParameter("tinhtrang", e.getTinhTrang());
            q.executeUpdate();
            //s.save(e);
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
    
    public String createID(){
        List<Bmtacgia> lst=this.getAllList();
        Random r=new Random();
        int num=r.nextInt(99999999);
        String id=String.format("TG%08d", num);
        int i=0;
        Bmtacgia p = lst.get(0);
        while (id.equals(p.getIdTacGia())){
            num=r.nextInt(99999999);
            id=String.format("TG%08d", num);
            i++;
            p=lst.get(i);
        }
        return id;
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
