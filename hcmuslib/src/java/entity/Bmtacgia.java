package entity;
// Generated Dec 12, 2014 9:07:56 PM by Hibernate Tools 3.6.0


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bmtacgia generated by hbm2java
 */
@Entity
@Table(name="BMTACGIA"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Bmtacgia  implements java.io.Serializable {


     private String idTacGia;
     private Serializable hoTen;
     private Serializable butDanh;
     private Serializable thongTinBoSung;
     private Serializable tinhTrang;
     private Set<Anpham> anphams = new HashSet<Anpham>(0);
     private Set<Sach> saches = new HashSet<Sach>(0);

    public Bmtacgia() {
    }

	
    public Bmtacgia(String idTacGia) {
        this.idTacGia = idTacGia;
    }
    public Bmtacgia(String idTacGia, Serializable hoTen, Serializable butDanh, Serializable thongTinBoSung, Serializable tinhTrang, Set<Anpham> anphams, Set<Sach> saches) {
       this.idTacGia = idTacGia;
       this.hoTen = hoTen;
       this.butDanh = butDanh;
       this.thongTinBoSung = thongTinBoSung;
       this.tinhTrang = tinhTrang;
       this.anphams = anphams;
       this.saches = saches;
    }
   
     @Id 

    
    @Column(name="ID_TAC_GIA", unique=true, nullable=false, length=10)
    public String getIdTacGia() {
        return this.idTacGia;
    }
    
    public void setIdTacGia(String idTacGia) {
        this.idTacGia = idTacGia;
    }

    
    @Column(name="HO_TEN")
    public Serializable getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(Serializable hoTen) {
        this.hoTen = hoTen;
    }

    
    @Column(name="BUT_DANH")
    public Serializable getButDanh() {
        return this.butDanh;
    }
    
    public void setButDanh(Serializable butDanh) {
        this.butDanh = butDanh;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="bmtacgia")
    public Set<Anpham> getAnphams() {
        return this.anphams;
    }
    
    public void setAnphams(Set<Anpham> anphams) {
        this.anphams = anphams;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bmtacgia")
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }




}


