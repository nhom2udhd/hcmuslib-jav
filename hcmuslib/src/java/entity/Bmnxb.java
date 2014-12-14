package entity;
// Generated Dec 12, 2014 5:30:45 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Bmnxb generated by hbm2java
 */
@Entity
@Table(name="BMNXB"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Bmnxb  implements java.io.Serializable {


     private String idNxb;
     private String tenNxb;
     private Date ngayThanhLap;
     private String thongTinBoSung;
     private String tinhTrang;
     private Set<Sach> saches = new HashSet<Sach>(0);
     private Set<Anpham> anphams = new HashSet<Anpham>(0);

    public Bmnxb() {
    }

	
    public Bmnxb(String idNxb) {
        this.idNxb = idNxb;
    }
    public Bmnxb(String idNxb, String tenNxb, Date ngayThanhLap, String thongTinBoSung, String tinhTrang, Set<Sach> saches, Set<Anpham> anphams) {
       this.idNxb = idNxb;
       this.tenNxb = tenNxb;
       this.ngayThanhLap = ngayThanhLap;
       this.thongTinBoSung = thongTinBoSung;
       this.tinhTrang = tinhTrang;
       this.saches = saches;
       this.anphams = anphams;
    }
   
     @Id 

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_NXB", unique=true, nullable=false, length=10)
    public String getIdNxb() {
        return this.idNxb;
    }
    
    public void setIdNxb(String idNxb) {
        this.idNxb = idNxb;
    }

    
    @Column(name="TEN_NXB")
    public String getTenNxb() {
        return this.tenNxb;
    }
    
    public void setTenNxb(String tenNxb) {
        this.tenNxb = tenNxb;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NGAY_THANH_LAP", length=10)
    public Date getNgayThanhLap() {
        return this.ngayThanhLap;
    }
    
    public void setNgayThanhLap(Date ngayThanhLap) {
        this.ngayThanhLap = ngayThanhLap;
    }

    
    @Column(name="THONG_TIN_BO_SUNG")
    public String getThongTinBoSung() {
        return this.thongTinBoSung;
    }
    
    public void setThongTinBoSung(String thongTinBoSung) {
        this.thongTinBoSung = thongTinBoSung;
    }

    
    @Column(name="TINH_TRANG")
    public String getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bmnxb")
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bmnxb")
    public Set<Anpham> getAnphams() {
        return this.anphams;
    }
    
    public void setAnphams(Set<Anpham> anphams) {
        this.anphams = anphams;
    }




}


