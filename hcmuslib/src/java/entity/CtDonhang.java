package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CtDonhang generated by hbm2java
 */
@Entity
@Table(name="CT_DONHANG"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class CtDonhang  implements java.io.Serializable {


     private int id;
     private Donhang donhang;
     private String tenSanPham;
     private Integer soLuong;
     private String ghiChu;

    public CtDonhang() {
    }

	
    public CtDonhang(int id, Donhang donhang) {
        this.id = id;
        this.donhang = donhang;
    }
    public CtDonhang(int id, Donhang donhang, String tenSanPham, Integer soLuong, String ghiChu) {
       this.id = id;
       this.donhang = donhang;
       this.tenSanPham = tenSanPham;
       this.soLuong = soLuong;
       this.ghiChu = ghiChu;
    }
   
     @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_DON_HANG", nullable=false)
    public Donhang getDonhang() {
        return this.donhang;
    }
    
    public void setDonhang(Donhang donhang) {
        this.donhang = donhang;
    }

    
    @Column(name="TEN_SAN_PHAM")
    public String getTenSanPham() {
        return this.tenSanPham;
    }
    
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    
    @Column(name="SO_LUONG")
    public Integer getSoLuong() {
        return this.soLuong;
    }
    
    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    
    @Column(name="GHI_CHU")
    public String getGhiChu() {
        return this.ghiChu;
    }
    
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }




}


