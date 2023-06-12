
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //objek
        Matematika zet = new Matematika(3,8);
        
        System.out.println("Hitung Penjumlahan : "+zet.setPenjumlahan());
        System.out.println("Hitung Pengurangan : "+zet.setPengurangan());
        System.out.println("Hitung Perkalian : "+zet.setPerkalian());
        System.out.println("Hitung Pembagian : "+zet.setPembagian());
    }
    
}
