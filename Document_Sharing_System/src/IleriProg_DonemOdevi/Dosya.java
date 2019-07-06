/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IleriProg_DonemOdevi;

import java.io.File;

/**
 *
 * @author merve
 */
public class Dosya {
    static int dosya_no_artis=1;
    int dosya_no;
    File dosya;
    String dosya_ismi;
    Student dosya_sahibi;
    String yuklenme_tarihi;
    String ders_adi;
    
    
    public Dosya(File dosya, String dosya_ismi, String ders, Student sahibi, String tarih){
       this.dosya = dosya;
       this.dosya_ismi = dosya_ismi;
       this.dosya_no = Dosya.dosya_no_artis;
       this.ders_adi = ders;
       this.dosya_sahibi = sahibi;
       this.yuklenme_tarihi = tarih;
       Dosya.dosya_no_artis++;
    }
    
    public void dosyayi_sil(){
        
    
    }
    
    
}
