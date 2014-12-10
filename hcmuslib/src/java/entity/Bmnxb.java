package entity;
// Generated Nov 24, 2014 9:54:24 PM by Hibernate Tools 3.6.0


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.Size;
/**
 * Bmnxb generated by hbm2java
 */
@Entity
@Table(name="BMNXB"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Bmnxb  implements java.io.Serializable {

     @NotEmpty
     @Size(max = 10)
     private String idNxb;
     @NotEmpty
     private Serializable tenNxb;
     private Date ngayThanhLap;
     private Serializable thongTinBoSung;
     @NotEmpty
     private Serializable tinhTrang;
     private Set<Sach> saches = new HashSet<Sach>(0);

    public Bmnxb() {
    }

	
    public Bmnxb(String idNxb) {
        this.idNxb = idNxb;
    }
    public Bmnxb(String idNxb, Serializable tenNxb, Date ngayThanhLap, Serializable thongTinBoSung, Serializable tinhTrang, Set<Sach> saches) {
       this.idNxb = idNxb;
       this.tenNxb = tenNxb;
       this.ngayThanhLap = ngayThanhLap;
       this.thongTinBoSung = thongTinBoSung;
       this.tinhTrang = tinhTrang;
       this.saches = saches;
    }
   
     @Id 

    
    @Column(name="ID_NXB", unique=true, nullable=false, length=10)
    public String getIdNxb() {
        return this.idNxb;
    }
    
    public void setIdNxb(String idNxb) {
        this.idNxb = idNxb;
    }

    
    @Column(name="TEN_NXB")
    public Serializable getTenNxb() {
        return this.tenNxb;
    }
    
    public void setTenNxb(Serializable tenNxb) {
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
    public Serializable getThongTinBoSung() {
        return this.thongTinBoSung;
    }
    
    public void setThongTinBoSung(Serializable thongTinBoSung) {
        this.thongTinBoSung = thongTinBoSung;
    }

    
    @Column(name="TINH_TRANG")
    public Serializable getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(Serializable tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bmnxb")
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }




}


