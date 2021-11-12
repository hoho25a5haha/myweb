/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

/**
 *
 * @author Administrator
 */
public class product {

    private int id;
    private String name;
    private String image;
    private int price;
    private String man_hinh;
    private String cam_sau;
    private String cam_truoc;
    private String he_dieu_hanh;
    private String cpu;
    private String bo_nho;
    private String ram;
    private String ket_noi;
    private String pin_sac;
    private int cateid;
    private int amount;
    
    public product() {
    }

    public product(int id, String name, String image, int price, String man_hinh, String cam_sau, String cam_truoc, String he_dieu_hanh, String cpu, String bo_nho, String ram, String ket_noi, String pin_sac, int cateid) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.man_hinh = man_hinh;
        this.cam_sau = cam_sau;
        this.cam_truoc = cam_truoc;
        this.he_dieu_hanh = he_dieu_hanh;
        this.cpu = cpu;
        this.bo_nho = bo_nho;
        this.ram = ram;
        this.ket_noi = ket_noi;
        this.pin_sac = pin_sac;
        this.cateid = cateid;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMan_hinh() {
        return man_hinh;
    }

    public void setMan_hinh(String man_hinh) {
        this.man_hinh = man_hinh;
    }

    public String getCam_sau() {
        return cam_sau;
    }

    public void setCam_sau(String cam_sau) {
        this.cam_sau = cam_sau;
    }

    public String getCam_truoc() {
        return cam_truoc;
    }

    public void setCam_truoc(String cam_truoc) {
        this.cam_truoc = cam_truoc;
    }

    public String getHe_dieu_hanh() {
        return he_dieu_hanh;
    }

    public void setHe_dieu_hanh(String he_dieu_hanh) {
        this.he_dieu_hanh = he_dieu_hanh;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getBo_nho() {
        return bo_nho;
    }

    public void setBo_nho(String bo_nho) {
        this.bo_nho = bo_nho;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getKet_noi() {
        return ket_noi;
    }

    public void setKet_noi(String ket_noi) {
        this.ket_noi = ket_noi;
    }

    public String getPin_sac() {
        return pin_sac;
    }

    public void setPin_sac(String pin_sac) {
        this.pin_sac = pin_sac;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    
    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", man_hinh=" + man_hinh + ", cam_sau=" + cam_sau + ", cam_truoc=" + cam_truoc + ", he_dieu_hanh=" + he_dieu_hanh + ", cpu=" + cpu + ", bo_nho=" + bo_nho + ", ram=" + ram + ", ket_noi=" + ket_noi + ", pin_sac=" + pin_sac + ", cateid=" + cateid + '}';
    }

   

  
    
}
