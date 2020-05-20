
package vize.hesap;
import java.util.Scanner;
public class VizeHesap {
    public int ilk_sayi;
    public int ikinci_sayi;
    public int kimlik_no;
    public int islem_no;
    
    VizeHesap()
    {
      ilk_sayi=34;
      ikinci_sayi=62;
       kimlik_no=12334234;
    }
    
    public int islemler(int islem_no)
    {
        this.islem_no=islem_no;
        int sonuc = 0;
        if(islem_no == 1)
        {
             sonuc=ilk_sayi+ikinci_sayi;
        }
        else if(islem_no == 2)
        {
            sonuc=ilk_sayi-ikinci_sayi; 
        }
        
        else if(islem_no == 3)
        {
           sonuc=ilk_sayi*ikinci_sayi;   
        }
        else{
              sonuc=ilk_sayi/ikinci_sayi;   
        }
        
        
        return sonuc;
    }
    
        public int []aradaki_sayilar(int sayi1,int sayi2){
            int sayilar[]=new int [sayi2-sayi1];
            for(int i=0;i<sayilar.length;i++)
            {
               sayilar[i]=sayi1++; 
            }
            
            return sayilar;
        }
        
        
        
        public boolean yari_asal( int sayi1)
        {
           this.ilk_sayi=sayi1;
           boolean kontrol=true;
           for(int i=2;i<sayi1;i++)
           {
               if(sayi1%i == 0)
               {
                  kontrol=false;
                  break;
                         
               }
           }
           if(kontrol)
           {
               return false;
           }
           else
           {
               return true;
           }
            
        }
        
        
        
        
    
    
    public static void main(String[] args) {
         islem_yapma i=new islem_yapma();
         i.kimlik_no=998988989;
         i.ilk_sayi=7;
         i.ikinci_sayi=9;
         i.islem_no=3;
         i.gosterme();
         i.islem_no=2;
        i.gosterme();
        
        
    }
    
    
}
class islem_yapma extends VizeHesap
    {
        
        
        public void binary_kontrol( int kn)
        {
            kimlik_no=kn;
            int top=0;
            while(kimlik_no >0)
            {
              top=top+ kimlik_no%10;
              kimlik_no=kimlik_no/10;
              
            }
            
            String sonuc="";
            while(top>0)
            {
              sonuc=top%2+sonuc;
              top=top/2;
            }
            if (top>101  && top<101001)
            {
                System.out.println("Tebrikler kazandin");
            }
            else
            {
                System.out.println("uzgunuz");
            }
        }
        
        void gosterme()
        {
            System.out.println("giridiğniz işleme göre sonuc :"+islemler(1));
            System.out.println("girilen_sayi yarı asallık durumu: "+yari_asal(45));
            System.out.println("");
            binary_kontrol(kimlik_no);
        }
    }
