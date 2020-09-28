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


public class HitungKeramik {
    double jumlahkardusOptimal;
    double hargaOptimal;
    int hasilPilihan;
    double luasLahan;
    ArrayList<HashMap<String, Double>> data = new ArrayList<>();
    
    
    public HitungKeramik(ArrayList<HashMap<String, Double>> dataInput, Double luasLahanInput){
        this.data = dataInput;
        this.luasLahan = luasLahanInput;
    }

    
    
    public void luasKeramikPerKardus(){ 
        for(HashMap<String, Double> i : this.data){
            Double hasil = (i.get("sisi1")*i.get("sisi2")*0.0001)*(i.get("keramik per kardus"));
            i.put("luas per kardus", hasil);
        }
    }
    
    public void HargaTotal(){
        jumlahKardusDiperlukan();
        for(HashMap<String, Double> i : this.data){
            i.put("uang yang dibutuhkan", (i.get("kardus perlu")*i.get("harga per kardus")));
            
        }
    }
    
    public void jumlahKardusDiperlukan(){
        for(HashMap<String, Double> i : this.data){
            Double luasperKardus = (i.get("sisi1")*i.get("sisi2")*0.0001)*(i.get("keramik per kardus"));
            Double kardus = (Math.ceil(this.luasLahan/luasperKardus));
            Double sisaPerProduk = ((luasperKardus*kardus)-this.luasLahan);
            i.put("kardus perlu",kardus);
            i.put("sisa",sisaPerProduk);
         
        }              
    }
    
    ArrayList<Double> daftarHarga(){
        ArrayList<Double> hasil = new ArrayList<>();
        for(HashMap<String, Double> i : this.data){
            hasil.add(i.get("uang yang dibutuhkan"));
        }
        return hasil;
    }
    
    ArrayList<Double> daftarLuasPerKardus(){
        ArrayList<Double> hasil = new ArrayList<>();
        for(HashMap<String, Double> i : this.data){
            hasil.add(i.get("luas per kardus"));
        }
        return hasil;
    }
    
    ArrayList<Double> kardusYangDibutuhkan(){
        ArrayList<Double> hasil = new ArrayList<>();
        for(HashMap<String, Double> i : this.data){
            hasil.add(i.get("kardus perlu"));
        }
        return hasil;
    }
    
    ArrayList<Double> sisaKeramik(){
        ArrayList<Double> hasil = new ArrayList<>();
        for(HashMap<String, Double> i : this.data){
            hasil.add(i.get("sisa"));
        }
        return hasil;
    }
    
    public void fit(ArrayList<Double> pilihanSisaKeramik,ArrayList<Double> hargaSeluruhnya){
        this.hargaOptimal = Collections.min(hargaSeluruhnya);
        ArrayList<Double> beberapaKeramikTerbaik = new ArrayList<Double>();
        for(Double i : hargaSeluruhnya){
            if(i == this.hargaOptimal){
                beberapaKeramikTerbaik.add(pilihanSisaKeramik.get(hargaSeluruhnya.indexOf(i)));                
            }        
            System.out.println("Keramik"+(hargaSeluruhnya.indexOf(i)+1)+ " : " + i);
        }
        this.hasilPilihan = pilihanSisaKeramik.indexOf(Collections.max(beberapaKeramikTerbaik))+1;
       
       
    }
    
    
        
        
        
    
}
