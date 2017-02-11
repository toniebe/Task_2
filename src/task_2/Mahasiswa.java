/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author toniebe
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String status;
    private char nilai[];
    private int i;

    public Mahasiswa() {
        status = "tidak lulus";
        i = 0;
        nilai = new char [10];
    }

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        status = "tidak lulus";
        i = 0;
        nilai = new char [10];
    }

    public char[] getNilai() {
        return nilai;
    }
    
    

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public char getNilai(char nilai){
        return nilai;
    }

    public int getI() {
        return i;
    }
    
   public void addNilai(char nilai){
       for (i=0;i < 10; i++){
           this.nilai[i] = nilai;
                  
       }
   }
   
   public char getNilai(int i){
       return nilai [i+1];
   }

   
 public String toString() {
         String n = nim + "," +nama+ "," +status+ "," + "Nilai = ";
         for (int m = 0; m <= i; m++){
             n =n + nilai[m] + ",";
         }
         return n;
     }
  
  public char cekNilai(Mahasiswa b){
    char j = 0;
    for (char k = 'A';k < 'E'; k++){
        for(int m = 0;m < i;m++){
            if(nilai[m] == k){
                for(int n = 0; n< b.i; n++){
                    if(b.nilai[n] == k){
                        return k;
                    }
                }
            }
        }
    }
    return j;
  }
  
}
