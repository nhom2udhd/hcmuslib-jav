/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.*;
import java.util.*;
import org.hibernate.*;
/**
 *
 * @author Shady
 */
public class BookModel {
    public int CountRow()
    {
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            List<Sach> lst = new ArrayList<Sach>();      
            try {
                s.beginTransaction();
                lst = s.createCriteria(Sach.class).list();
                s.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return lst.size();
    }

    public List<Sach> getAll(int jxIndexPage, int jxPage)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Sach> lst = new ArrayList<Sach>();
        String query = "select * from SACH";
        try {
            s.beginTransaction();
            Query q = s.createSQLQuery(query).addEntity(Sach.class);
            q.setMaxResults(jxPage);
            q.setFirstResult(jxIndexPage*jxPage);
            lst = q.list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
    public Sach Find(String id)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Sach> lst = new ArrayList<Sach>();
        Sach res = new Sach();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Sach.class).list();                          
            for(int i = 0; i < lst.size();i++)
            {
                if(lst.get(i).getIdSach().equals(id))
                    res = lst.get(i);
            }                          
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public List<Sach> getAllList(String key)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Sach> lst = new ArrayList<Sach>();
        
        try {
            s.beginTransaction();           
            if(!key.isEmpty())              
            {
                lst = s.createCriteria(Sach.class).list();
                List<Sach> temp = new ArrayList<Sach>();
                for(int i = 0; i < lst.size();i++)
                {
                    if(lst.get(i).getBmnhandechinh().getNhanDeChinh().contains(key)
                            || lst.get(i).getBmtacgia().getHoTen().contains(key)
                            || lst.get(i).getBmtacgia().getButDanh().contains(key))
                        temp.add(lst.get(i));
                }
                lst = temp;
            }                
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
        
        
    
    
    /*
    public boolean Create(Sach e)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();     
        try
        {
            s.beginTransaction();
           /* Query q = s.createSQLQuery("insert into dbo.BMTACGIA(ID_TAC_GIA, HO_TEN, BUT_DANH, THONG_TIN_BO_SUNG, TINH_TRANG) "
                    + "values(:idtacgia,:hoten,:butdanh,:tt,:tinhtrang)");
            q.setParameter("idtacgia", e.getIdTacGia());
            q.setParameter("hoten", e.getHoTen());
            q.setParameter("butdanh", e.getButDanh());
            q.setParameter("tt", e.getThongTinBoSung());
            q.setParameter("tinhtrang", e.getTinhTrang());
            q.executeUpdate();
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
    
    public String createID(){
        List<Sach> lst=this.getAllList();
        Random r=new Random();
        int num=r.nextInt(99999999);
        String id=String.format("TG%08d", num);
        int i=0;
      Sach p = lst.get(0);
        while (id.equals(p.getIdTacGia())){
            num=r.nextInt(99999999);
            id=String.format("TG%08d", num);
            i++;
            p=lst.get(i);
        }
        return id;
    }
    
    public boolean Remove(Sach e)
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
    
    public boolean Edit(Sach e)
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
    }*/
}
