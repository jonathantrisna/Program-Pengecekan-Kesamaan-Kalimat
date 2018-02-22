/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengecekan.kalimat;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class PengecekanKalimat {
    public static void main(String[] args) {
        String kalimat1;
        String kalimat2;
        Scanner sc=new Scanner (System.in);
        System.out.print("PROGRAM HITUNG KEMIRIPAN 2 KALIMAT");
        System.out.print("\n");
        System.out.print("==================================");
        System.out.print("\n");
        System.out.print("MASUKKAN KALIMAT 1 = ");
        kalimat1 = sc.nextLine();
        System.out.print("MASUKKAN KALIMAT 2 = ");
        kalimat2 = sc.nextLine();
        System.out.print("\n");

        Vector<String> kata_kal_1 = new Vector<String>();
        String kata = "";
        for (int i = 0;i < kalimat1.length();i++)
        {
            char y=kalimat1.charAt(i);
            if (y != ' ' && i != kalimat1.length()-1)
            {
                kata = kata + y;
            }
            else
            {
                kata_kal_1.addElement(kata);
                kata = "";
            }
        }
        //tampilkan ISI VECTOR kata_kal_1
        System.out.print("ISI VECTOR kata_kal_1 = ");
        System.out.print("\n");
        for (int i = 0;i <= kata_kal_1.size() - 1;i++)
        {
            System.out.print(kata_kal_1.elementAt(i));
            System.out.print(" - ");
        }
        System.out.print("\n");
        Vector<String> kata_kal_2 = new Vector<String>();
        String kata2="";
        for (int i = 0;i < kalimat2.length();i++)
        {
            char y=kalimat2.charAt(i);
            if (y != ' ' && i != kalimat2.length()-1)
            {
                kata2 = kata2 + y;
            }
            else
            {
                kata_kal_2.addElement(kata2);
                kata2 = "";
            }
        }
        //tampilkan ISI VECTOR kata_kal_2
        System.out.print("\n");
        System.out.print("ISI VECTOR kata_kal_2 = ");
        System.out.print("\n");
        for (int i = 0;i <= kata_kal_2.size() - 1;i++)
        {
            System.out.print(kata_kal_2.elementAt(i));
            System.out.print(" - ");
        }
        System.out.print("\n");
        Vector<String> token_unik = new Vector<String>();
        //input isi vector kata_kal_1 ke token_unik
        boolean ada;
        for (int i = 0;i <= kata_kal_1.size() - 1;i++)
        {
            if (token_unik.isEmpty())
            {
                token_unik.addElement(kata_kal_1.get(i));
            }
            else
            {
                ada = false;
                for (int j = 0;j <= token_unik.size() - 1;j++)
                {
                    if (kata_kal_1.elementAt(i).equals(token_unik.elementAt(j)))
                    {
                        ada = true;
                    }
                }
                if (ada == false)
                {
                    token_unik.addElement(kata_kal_1.elementAt(i));
                }
            }
        }

        //input isi vector kata_kal_1 ke token_unik
        boolean ada2;
        for (int i = 0;i <= kata_kal_2.size() - 1;i++)
        {
            if (token_unik.isEmpty())
            {
                token_unik.addElement(kata_kal_2.elementAt(i));
            }
            else
            {
                ada2 = false;
                for (int j = 0;j <= token_unik.size() - 1;j++)
                {
                    if (kata_kal_2.elementAt(i).equals(token_unik.elementAt(j)))
                    {
                        ada2 = true;
                    }
                }
                if (ada2 == false)
                {
                    token_unik.addElement(kata_kal_2.elementAt(i));
                }
            }
        }
        System.out.print("\n");
        System.out.print("ISI VECTOR token_unik = ");
        System.out.print("\n");
        for (int i = 0;i <= token_unik.size() - 1;i++)
        {
            System.out.print(token_unik.elementAt(i));
            System.out.print(" - ");
        }
        System.out.print("\n");
        
        
        
        
        
        
        Vector<Integer> frek_kalimat_1 = new Vector<>(token_unik.size());
        for (int i = 0;i <= token_unik.size() - 1;i++)
        {
            int freq=0;
            for (int j = 0;j <= kata_kal_1.size() - 1;j++)
            {
                if (kata_kal_1.elementAt(j).equals(token_unik.elementAt(i)))
                {
                    freq++;
                }
            }
            frek_kalimat_1.addElement(freq);
        }
        //TAMPIL ISI VECTOR frek_kalimat_1        
        System.out.print("\n");
        System.out.print("ISI FREKUENSI VECTOR frek_kalimat_1 = ");
        System.out.print("\n");
        for (int i = 0;i <= frek_kalimat_1.size() - 1;i++)
        {
            System.out.print(frek_kalimat_1.elementAt(i));
            System.out.print(" - ");
        }
        System.out.print("\n");
        
        
        Vector<Integer> frek_kalimat_2 = new Vector<>(token_unik.size());
        for (int i = 0;i <= token_unik.size() - 1;i++)
        {
            int freq=0;
            for (int j = 0;j <= kata_kal_2.size() - 1;j++)
            {
                if (kata_kal_2.get(j).equals(token_unik.get(i)))
                {
                    freq++;
                }
            }
            frek_kalimat_2.addElement(freq);
        }
        
        //TAMPIL ISI VECTOR frek_kalimat_2
        System.out.print("\n");
        System.out.print("ISI FREKUENSI VECTOR frek_kalimat_2 = ");
        System.out.print("\n");
        for (int i = 0;i <= frek_kalimat_2.size() - 1;i++)
        {
            System.out.print(frek_kalimat_2.elementAt(i));
            System.out.print(" - ");
        }
        System.out.print("\n");

        //=== HITUNG KEMIRIPAN ===
        System.out.print("\n");
        System.out.print("NILAI KEMIRIPAN 2 KALIMAT = ");
        //hitung nilai pembilang
        float pembilang = 0;
        for (int i = 0;i <= token_unik.size() - 1;i++)
        {
            pembilang = pembilang + frek_kalimat_1.elementAt(i) * frek_kalimat_2.elementAt(i);
        }
        //hitung nilai penyebut
        float penyebut1 = 0;
        for (int i = 0;i <= frek_kalimat_1.size() - 1;i++)
        {
            penyebut1 = (float) (penyebut1 + Math.pow(frek_kalimat_1.elementAt(i),2));
        }
        float penyebut2 = 0;
        for (int i = 0;i <= frek_kalimat_2.size() - 1;i++)
        {
            penyebut2 = (float) (penyebut2 + Math.pow(frek_kalimat_2.elementAt(i),2));
        }
        System.out.print("TINGKAT KEMIRIPAN: "+(pembilang / (Math.sqrt(penyebut1 * penyebut2))));
    }
}
