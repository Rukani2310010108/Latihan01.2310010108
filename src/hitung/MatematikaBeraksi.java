package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika Rukani = new Matematika (0,8);
        
        System.out.println("hasil penjumlahan: "+Rukani.setpenjumlahan());
        System.out.println("hasil pengurangan: "+Rukani.setpengurangan());
        System.out.println("hasil perkalian: "+Rukani.setperkalian());
        System.out.println("hasil pembagian: "+Rukani.setpembagian());
    }
}
