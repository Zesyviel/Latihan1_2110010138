
package hitung;

public class Matematika {
     //variabel
    private double bil1, bil2;
    //constructor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    //penjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
    //pengurangan
    public double setPengurangan(){
        return bil1 - bil2;
    }
    //perkalian
    public double setPerkalian(){
        return bil1 * bil2;
    }
    //penjumlahan
    public double setPembagian(){
        return bil1 / bil2;
    }
}
