package entity;
// Generated Nov 24, 2014 9:54:24 PM by Hibernate Tools 3.6.0


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Dktaphuan generated by hbm2java
 */
@Entity
@Table(name="DKTAPHUAN"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Dktaphuan  implements java.io.Serializable {


     private int id;
     private Docgia docgia;
     private Serializable loai;
     private Integer soluong;
     private Serializable tinhtrang;

    public Dktaphuan() {
    }

	
    public Dktaphuan(int id, Docgia docgia) {
        this.id = id;
        this.docgia = docgia;
    }
    public Dktaphuan(int id, Docgia docgia, Serializable loai, Integer soluong, Serializable tinhtrang) {
       this.id = id;
       this.docgia = docgia;
       this.loai = loai;
       this.soluong = soluong;
       this.tinhtrang = tinhtrang;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MADG", nullable=false)
    public Docgia getDocgia() {
        return this.docgia;
    }
    
    public void setDocgia(Docgia docgia) {
        this.docgia = docgia;
    }

    
    @Column(name="LOAI")
    public Serializable getLoai() {
        return this.loai;
    }
    
    public void setLoai(Serializable loai) {
        this.loai = loai;
    }

    
    @Column(name="SOLUONG")
    public Integer getSoluong() {
        return this.soluong;
    }
    
    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    
    @Column(name="TINHTRANG")
    public Serializable getTinhtrang() {
        return this.tinhtrang;
    }
    
    public void setTinhtrang(Serializable tinhtrang) {
        this.tinhtrang = tinhtrang;
    }




}


