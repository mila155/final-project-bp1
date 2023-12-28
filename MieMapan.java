/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mieMapan;

/**
 *
 * @author mila
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class MieMapan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program kasir Mie Mapan");
        menu();
        }
       
        
    public static void menu() {
        Scanner s = new Scanner(System.in);
        int total = 0;
        boolean ulangmenu = false;
        var namaunit = new ArrayList<String>();
        var jumlahunit = new ArrayList<Integer>();
        var hargaunit = new ArrayList<Integer>();
        do{    
            System.out.println("MENU");
            System.out.println("1. Makanan\n2. Minuman");
            System.out.print("Pilih = ");
            int pilih = s.nextInt();
            while(pilih!=1&&pilih!=2){
                System.out.println("MENU");
                System.out.println("1. Makanan\n2. Minuman");
                System.out.print("Pilih = ");
                pilih = s.nextInt();
            }
            switch(pilih){
                case 1:
                    System.out.println("MAKANAN\n1. Aneka Mie\n2. Aneka Penyet");
                    System.out.println("3. Paket Keroyokan\n4. Aneka Gorengan");
                    System.out.println("5. Aneka Bakwan\n6. Tambahan");
                    System.out.print("Pilih = ");
                    int pilihmakan = s.nextInt();
                    while(pilihmakan<1||pilihmakan>6){
                        System.out.println("MAKANAN\n1. Aneka Mie\n2. Aneka Penyet");
                        System.out.println("3. Paket Keroyokan\n4. Aneka Gorenngan");
                        System.out.println("5. Aneka Bakwan\n6. Tambahan");
                        System.out.print("Pilih = ");
                        pilihmakan = s.nextInt();
                    }
                    switch(pilihmakan){
                        case 1: String mie[] ={"Pangsit Mie Ayam","Pangsit Mie Ayam Jumbo"
                                    ,"Pangsit Mie Bakwan","Pangsit Mie Bakwan Jumbo","Mie Daging Pedas"
                                    ,"Songmie Ayam Jamur","Mie Babat","Mie Katsu Ayam Manis"
                                    ,"Mie Kare Ayam","Mie Otot","Mie Ayam Geprek"
                                    ,"Mie Yamin Karage","Mie Bakwan","Mie Bakwan Jumbo","Mie Polos"
                                    ,"Mie Polos Jumbo","Mie Sambal Matah"};
                                int harga[] ={20000,28000,23000,33000,32000,32000,33000,34000
                                    ,33000,35000,22000,22000,22000,30000,16000,20000,34000};
                                System.out.println("ANEKA MIE");
                                for(int i = 0; i<17; i++){
                                    System.out.println((i+1)+". "+mie[i]+"\n\t Rp"+harga[i]);
                                }
                                System.out.print("Pilih = ");
                                int pilihmie = s.nextInt();
                                while(pilihmie<1||pilihmie>17){
                                    System.out.print("Pilih = ");
                                    pilihmie = s.nextInt();
                                }namaunit.add(mie[pilihmie-1]);
                                System.out.print("Banyak porsi = ");
                                int porsi = s.nextInt();
                                while(porsi<1){
                                    System.out.print("Banyak porsi = ");
                                    porsi = s.nextInt();
                                }jumlahunit.add(porsi);
                                total = total+harga[pilihmie-1]*porsi;
                                hargaunit.add(harga[pilihmie-1]);
                                break;
                        case 2: String penyet[] ={"Tahu Penyet","Tempe Penyet","Tahu Tempe Penyet","Telor Penyet","Siomay Penyet","Bakwan Penyet","Bakwan Siomay Penyet"
                                                ,"Ayam Penyet","Ayam Bakwan Penyet","Terong Penyet","Tahu Tempe Telur Terong Penyet","Udang Penyet","Otot Penyet"
                                                ,"Iga Penyet","Empal Penyet","Empal Bakwan Penyet","Empal Siomay Penyet","Ayam Empal Penyet"};
                                int harga2[] = {16500,16500,16500,19800,36300,27500,49500,27500,42900,16500,25300,38500,49500,51700,27500,41800,42900,42900};
                                System.out.println("ANEKA PENYETAN");
                                for(int i = 0; i<18; i++){
                                    System.out.println((i+1)+". "+penyet[i]+"\n\t Rp"+harga2[i]);
                                }
                                System.out.print("Pilih = ");
                                int pilihpenyet = s.nextInt();
                                while(pilihpenyet<1||pilihpenyet>18){
                                    System.out.print("Pilih = ");
                                    pilihpenyet = s.nextInt();
                                }namaunit.add(penyet[pilihpenyet-1]);
                                System.out.print("Banyak porsi = ");
                                int porsi2 = s.nextInt();
                                while(porsi2<1){
                                    System.out.print("Banyak porsi = ");
                                    porsi2 = s.nextInt();
                                }jumlahunit.add(porsi2);
                                total = total+harga2[pilihpenyet-1]*porsi2;
                                hargaunit.add(harga2[pilihpenyet-1]);
                                break;
                        case 3: String keroyokan[] ={"Penyet Keroyokan"};
                                int harga3[] ={135300};
                                System.out.println("PAKET KEROYOKAN");
                                System.out.println("1. "+keroyokan[0]+"\n\t Rp"+harga3[0]);
                                System.out.print("Pilih = ");
                                int pilihkeroyokan = s.nextInt();
                                while(pilihkeroyokan!=1){
                                    System.out.print("Pilih = ");
                                    pilihkeroyokan = s.nextInt();
                                }namaunit.add(keroyokan[pilihkeroyokan-1]);
                                System.out.print("Banyak porsi = ");
                                int porsi3 = s.nextInt();
                                while(porsi3<1){
                                    System.out.print("Banyak porsi = ");
                                    porsi3 = s.nextInt();
                                }jumlahunit.add(porsi3);
                                total = total+harga3[pilihkeroyokan-1]*porsi3;
                                hargaunit.add(harga3[pilihkeroyokan-1]);
                                break;
                        case 4: String gorengan[] ={"Siomay Goreng","Bakwan Goreng/porsi","Pangsit Goreng/porsi","Kulit Ayam Kriuk"};
                                int harga4[] ={14043,23100,23100,34100};
                                System.out.println("ANEKA GORENGAN");
                                for(int i = 0; i<4; i++){
                                    System.out.println((i+1)+". "+gorengan[i]+"\n\t Rp"+harga4[i]);
                                } 
                                System.out.print("Pilih = ");
                                int pilihgorengan = s.nextInt();
                                while(pilihgorengan<1||pilihgorengan>4){
                                    System.out.print("Pilih = ");
                                    pilihgorengan = s.nextInt();
                                }namaunit.add(gorengan[pilihgorengan-1]);
                                System.out.print("Banyak porsi = ");
                                int porsi4 = s.nextInt();
                                while(porsi4<1){
                                    System.out.print("Banyak porsi = ");
                                    porsi4 = s.nextInt();
                                }jumlahunit.add(porsi4);
                                total = total+harga4[pilihgorengan-1]*porsi4;
                                hargaunit.add(harga4[pilihgorengan-1]);
                                break;
                        case 5: String bakwan[] ={"Bakwan Campur","Bakwan Kuah","Bakwan Sayur","Pangsit Kuah"};
                                int harga5[] ={39600,39600,42900,20900};
                                System.out.println("ANEKA BAKWAN");
                                for(int i = 0; i<4; i++){
                                    System.out.println((i+1)+". "+bakwan[i]+"\n\t Rp"+harga5[i]);
                                } 
                                System.out.print("Pilih = ");
                                int pilihbakwan = s.nextInt();
                                while(pilihbakwan<1||pilihbakwan>4){
                                    System.out.print("Pilih = ");
                                    pilihbakwan = s.nextInt();
                                }namaunit.add(bakwan[pilihbakwan-1]);
                                System.out.print("Banyak porsi = ");
                                int porsi5 = s.nextInt();
                                while(porsi5<1){
                                    System.out.print("Banyak porsi = ");
                                    porsi5 = s.nextInt();
                                }jumlahunit.add(porsi5);
                                total = total+harga5[pilihbakwan-1]*porsi5;
                                hargaunit.add(harga5[pilihbakwan-1]);
                                break;
                        case 6: String tambahan[] ={"Nasi","Lumpia Mapan"};
                                int harga6[] ={9900,19700};
                                System.out.println("TAMBAHAN");
                                for(int i = 0; i<2; i++){
                                    System.out.println((i+1)+". "+tambahan[i]+"\n\t Rp"+harga6[i]);
                                } 
                                System.out.print("Pilih = ");
                                int pilihtambahan = s.nextInt();
                                while(pilihtambahan<1||pilihtambahan>2){
                                    System.out.print("Pilih = ");
                                    pilihtambahan = s.nextInt();
                                }namaunit.add(tambahan[pilihtambahan-1]);
                                System.out.print("Banyak porsi = ");
                                int porsi6 = s.nextInt();
                                while(porsi6<1){
                                    System.out.print("Banyak porsi = ");
                                    porsi6 = s.nextInt();
                                }jumlahunit.add(porsi6);
                                total = total+harga6[pilihtambahan-1]*porsi6;
                                hargaunit.add(harga6[pilihtambahan-1]);
                                break;
                       }
                    break;
                case 2:
                    System.out.println("MINUMAN");
                    System.out.println("1. Dingin\n2. Hangat");
                    System.out.print("Pilih = ");
                    int pilihminum = s.nextInt();
                    int totalminum = 0;
                    while(pilihminum!=1&&pilihminum!=2) {
                        System.out.println("MINUMAN");
                        System.out.println("1. Dingin\n2. Hangat");
                        System.out.print("Pilih = ");
                        pilihminum = s.nextInt();
                    }
                    if(pilihminum==1){
                        String dingin[] ={"Es Teh Tawar","Es Teh Manis","Es Jeruk Manis","Es Sirup"
                                ,"Es Sirup Susu","Air Mineral","Es Teh Tarik","Es Teh Leci","Es Leci"
                                ,"Es Jeruk Nipis","Es Lemon Tea","Es Cao","Es Cao Susu","Es Cao Gula Jawa"
                                ,"Es Kacang Hijau","Es Cappucino","Es Coklat Susu","Es Coklat Cao"
                                ,"Soda Gembira","Jus Jeruk"};
                        int harga[] ={9900,12100,23100,12100,15400,9000,18700,23100,23100,15400,15400,15400
                                    ,20900,20900,18700,16500,20900,20900,20900,23100};
                        System.out.println("MINUMAN DINGIN");
                        for(int i = 0; i<20; i++){
                           System.out.println((i+1)+". "+dingin[i]+"\n\t Rp"+harga[i]);
                        }
                        System.out.print("Pilih = ");
                        int pilihdingin = s.nextInt();
                        while(pilihdingin<1||pilihdingin>20){
                            System.out.print("Pilih = ");
                            pilihdingin = s.nextInt();
                        }namaunit.add(dingin[pilihdingin-1]);
                        System.out.print("Banyak porsi = ");
                        int porsi = s.nextInt();
                        while(porsi<1){
                            System.out.print("Banyak porsi = ");
                            porsi = s.nextInt();
                        }jumlahunit.add(porsi);
                        total = total+harga[pilihdingin-1]*porsi;
                        hargaunit.add(harga[pilihdingin-1]);
                    } else {
                        String hangat[] ={"Teh Tawar Hangat","Teh Manis Hangat","Lemon Tea Hangat"
                                        ,"Jeruk Nipis Hangat","Cappucino Hangat","Coklat Susu Hangat"
                                        ,"Teh Tarik Hangat"};
                        int harga2[] ={8800,9900,15400,15400,16500,20900,18700};
                        System.out.println("MINUMAN HANGAT");
                        for(int i = 0; i<7; i++){
                            System.out.println((i+1)+". "+hangat[i]+"\n\t Rp"+harga2[i]);
                        }
                        System.out.print("Pilih = ");
                        int pilihhangat = s.nextInt();
                        while(pilihhangat<1||pilihhangat>7){
                            System.out.print("Pilih = ");
                            pilihhangat = s.nextInt();
                        }namaunit.add(hangat[pilihhangat-1]);
                        System.out.print("Banyak porsi = ");
                        int porsi2 = s.nextInt();
                        while(porsi2<1){
                            System.out.print("Banyak porsi = ");
                            porsi2 = s.nextInt();
                        }jumlahunit.add(porsi2);
                        total = total+harga2[pilihhangat-1]*porsi2;
                        hargaunit.add(harga2[pilihhangat-1]);
                    }
                    break;
            }
            ulangmenu = tambahitem();
        }while(ulangmenu);
        struk(namaunit, jumlahunit,hargaunit);
    }
    
    public static boolean tambahitem(){
    Scanner s = new Scanner(System.in);
    boolean ulangmenu = false;
    System.out.println("Tambah lagi?\n1. Ya\n2. Selesai");
    System.out.print("Pilih = ");
        int tambah = s.nextInt();
        while(tambah<1||tambah>2){
            System.out.println("Tambah lagi?/n1. Ya/n2. Selesai");
            System.out.print("Pilih = ");
            tambah = s.nextInt();
        }
        if(tambah==1){
            ulangmenu=true;
        } else {
            ulangmenu=false;
        }
        return ulangmenu;
    }
    
    public static void struk(ArrayList<String> namaunit,ArrayList<Integer> jumlahunit,ArrayList<Integer> hargaunit){
        Scanner s = new Scanner(System.in);
        Date tanggal = new Date();
        tanggal.getTime();
        int totalBelanja = 0;
        System.out.print("operator = ");
        String nama = s.next();
        System.out.print("Pesanan atas nama = ");
        String namaP = s.next();
        for(int i=0; i<hargaunit.size(); i++){
            int total = hargaunit.get(i)*jumlahunit.get(i); 
            totalBelanja += total;
        }
        System.out.print("Tunai = Rp");
        int uangtunai = s.nextInt();
        while(totalBelanja>uangtunai){
            System.out.print("Tunai = Rp");
            uangtunai = s.nextInt();
        }
        int kembalian =0;
        kembalian = uangtunai-totalBelanja;
        System.out.println("--------------=============---------------");
        System.out.println("               Mapan Group               ");
        System.out.println("   Jl. Rungkut Mapan Tengah I Surabaya   ");
        System.out.println("           Telp. (031) 8709536           ");
        System.out.println("-----------------------------------------");
        System.out.println("            Mie Mapan Rungkut            ");
        System.out.println("Date : "+tanggal);
        System.out.println("Operator : "+nama);
        System.out.println("Cust. Name : "+namaP);
        System.out.println("-----------------------------------------");
        System.out.println("ITEM NAME\tHARGA(JUMLAH)\t   TOTAL");
        System.out.println("=========================================");
        for(int i=0; i<namaunit.size(); i++){
            int total = hargaunit.get(i)*jumlahunit.get(i); 
            System.out.println(namaunit.get(i));
            System.out.println("\t\tRp"+hargaunit.get(i)+"("+jumlahunit.get(i)+")\t   Rp"+ total);
        }
        System.out.println("=========================================");
        System.out.println("TOTAL                             Rp"+totalBelanja);
        System.out.println("TUNAI                             Rp"+uangtunai);
        System.out.println("KEMBALIAN                         Rp"+kembalian);
        System.out.println("=========================================");
        System.out.println("               TERIMA KASIH                ");
    }
   
}

