package entity;
// Generated Nov 24, 2014 9:54:24 PM by Hibernate Tools 3.6.0


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Nhanvien generated by hbm2java
 */
@Entity
@Table(name="NHANVIEN"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Nhanvien  implements java.io.Serializable {


     private String msNv;
     private Serializable hoTen;
     private Serializable tinhTrang;
     private Serializable chucVu;
     private Serializable loaiNhanVien;

    public Nhanvien() {
    }

	
    public Nhanvien(String msNv) {
        this.msNv = msNv;
    }
    public Nhanvien(String msNv, Serializable hoTen, Serializable tinhTrang, Serializable chucVu, Serializable loaiNhanVien) {
       this.msNv = msNv;
       this.hoTen = hoTen;
       this.tinhTrang = tinhTrang;
       this.chucVu = chucVu;
       this.loaiNhanVien = loaiNhanVien;
    }
   
     @Id 

    
    @Column(name="MS_NV", unique=true, nullable=false, length=10)
    public String getMsNv() {
        return this.msNv;
    }
    
    public void setMsNv(String msNv) {
        this.msNv = msNv;
    }

    
    @Column(name="HO_TEN")
    public Serializable getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(Serializable hoTen) {
        this.hoTen = hoTen;
    }

    
    @Column(name="TINH_TRANG")
    public Serializable getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(Serializable tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    
    @Column(name="CHUC_VU")
    public Serializable getChucVu() {
        return this.chucVu;
    }
    
    public void setChucVu(Serializable chucVu) {
        this.chucVu = chucVu;
    }

    
    @Column(name="LOAI_NHAN_VIEN")
    public Serializable getLoaiNhanVien() {
        return this.loaiNhanVien;
    }
    
    public void setLoaiNhanVien(Serializable loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }




}


