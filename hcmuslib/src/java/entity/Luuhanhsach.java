package entity;
// Generated Dec 12, 2014 5:30:45 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Luuhanhsach generated by hbm2java
 */
@Entity
@Table(name="LUUHANHSACH"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Luuhanhsach  implements java.io.Serializable {


     private String idLuuHanh;
     private Docgia docgia;
     private Sach sach;
     private Date ngayMuon;
     private Date thoiHanMuon;
     private Serializable tinhTrang;

    public Luuhanhsach() {
    }

	
    public Luuhanhsach(String idLuuHanh) {
        this.idLuuHanh = idLuuHanh;
    }
    public Luuhanhsach(String idLuuHanh, Docgia docgia, Sach sach, Date ngayMuon, Date thoiHanMuon, Serializable tinhTrang) {
       this.idLuuHanh = idLuuHanh;
       this.docgia = docgia;
       this.sach = sach;
       this.ngayMuon = ngayMuon;
       this.thoiHanMuon = thoiHanMuon;
       this.tinhTrang = tinhTrang;
    }
   
     @Id 

    
    @Column(name="ID_LUU_HANH", unique=true, nullable=false, length=10)
    public String getIdLuuHanh() {
        return this.idLuuHanh;
    }
    
    public void setIdLuuHanh(String idLuuHanh) {
        this.idLuuHanh = idLuuHanh;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOC_GIA")
    public Docgia getDocgia() {
        return this.docgia;
    }
    
    public void setDocgia(Docgia docgia) {
        this.docgia = docgia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_SACH")
    public Sach getSach() {
        return this.sach;
    }
    
    public void setSach(Sach sach) {
        this.sach = sach;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NGAY_MUON", length=10)
    public Date getNgayMuon() {
        return this.ngayMuon;
    }
    
    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="THOI_HAN_MUON", length=10)
    public Date getThoiHanMuon() {
        return this.thoiHanMuon;
    }
    
    public void setThoiHanMuon(Date thoiHanMuon) {
        this.thoiHanMuon = thoiHanMuon;
    }

    
    @Column(name="TINH_TRANG")
    public Serializable getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(Serializable tinhTrang) {
        this.tinhTrang = tinhTrang;
    }




}


