/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author radaf
 */
public class latif {
    
}

     public static void main(String[] args) {
        double total_beli, potongan = 0, jum_bayar = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total Pembelian Rp. ");
        total_beli = input.nextDouble();
        if(total_beli >= 50000)
            potongan = 0.2 * total_beli;
        System.out.println("Besar Potongan Rp. " + potongan);
        jum_bayar = total_beli - potongan;
        System.out.println("Jumlah harga yang harus dibayar Rp. " + jum_bayar);
    }
    
}