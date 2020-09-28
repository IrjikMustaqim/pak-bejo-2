/*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramik;
import java.util.*;
/**
 *
 * @author user
 */
public class Keramik {
    
   
    
    
    public static void main(String[] args) {
        HashMap <String,Double> keramik1 = new HashMap<>();
        keramik1.put("sisi1",30.0);
        keramik1.put("sisi2",30.0);
        keramik1.put("keramik per kardus",10.0);
        keramik1.put("harga per kardus",54000.0);
        
        HashMap <String,Double> keramik2 = new HashMap<>();
        keramik2.put("sisi1",40.0);
        keramik2.put("sisi2",40.0);
        keramik2.put("keramik per kardus",5.0);
        keramik2.put("harga per kardus",65000.0);
        
        HashMap <String,Double> keramik3 = new HashMap<>();
        keramik3.put("sisi1",30.0);
        keramik3.put("sisi2",40.0);
        keramik3.put("keramik per kardus",8.0);
        keramik3.put("harga per kardus",60000.0);
        
        
        ArrayList<HashMap<String,Double>> pilihanKeramik = new ArrayList<>();
        pilihanKeramik.add(keramik1);
        pilihanKeramik.add(keramik2);
        pilihanKeramik.add(keramik3);       
        
        
        HitungKeramik hitung = new HitungKeramik(pilihanKeramik,100.0);
        
        
        
        hitung.luasKeramikPerKardus();
        hitung.HargaTotal();
        hitung.fit(hitung.sisaKeramik(), hitung.daftarHarga());
        
        
        
        
             
        
                
        
        
        
        
        
        
        
        
        
        
    }
    
}
