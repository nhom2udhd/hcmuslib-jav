package entity;
// Generated Nov 24, 2014 9:54:24 PM by Hibernate Tools 3.6.0


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
 * Learncommons generated by hbm2java
 */
@Entity
@Table(name="LEARNCOMMONS"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Learncommons  implements java.io.Serializable {


     private String idLc;
     private ThietbiDichvu thietbiDichvu;
     private Docgia docgia;
     private Date ngayMuon;
     private Serializable tinhTrang;

    public Learncommons() {
    }

	
    public Learncommons(String idLc) {
        this.idLc = idLc;
    }
    public Learncommons(String idLc, ThietbiDichvu thietbiDichvu, Docgia docgia, Date ngayMuon, Serializable tinhTrang) {
       this.idLc = idLc;
       this.thietbiDichvu = thietbiDichvu;
       this.docgia = docgia;
       this.ngayMuon = ngayMuon;
       this.tinhTrang = tinhTrang;
    }
   
     @Id 

    
    @Column(name="ID_LC", unique=true, nullable=false, length=10)
    public String getIdLc() {
        return this.idLc;
    }
    
    public void setIdLc(String idLc) {
        this.idLc = idLc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_THIET_BI")
    public ThietbiDichvu getThietbiDichvu() {
        return this.thietbiDichvu;
    }
    
    public void setThietbiDichvu(ThietbiDichvu thietbiDichvu) {
        this.thietbiDichvu = thietbiDichvu;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOC_GIA")
    public Docgia getDocgia() {
        return this.docgia;
    }
    
    public void setDocgia(Docgia docgia) {
        this.docgia = docgia;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NGAY_MUON", length=10)
    public Date getNgayMuon() {
        return this.ngayMuon;
    }
    
    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    
    @Column(name="TINH_TRANG")
    public Serializable getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(Serializable tinhTrang) {
        this.tinhTrang = tinhTrang;
    }




}


