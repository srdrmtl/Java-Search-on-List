import java.util.*;
import java.util.Random;

import javax.swing.*;
public class class1 {

	
	//List veri tipinde 20 adet de�er olu�turmak i�in CreateAList fonksiyonunu
	//Kullan�yoruz...
	public static List<Integer> CreateAList(){
		//Veri tipini olu�turdum.
		List<Integer> IntegerList = new ArrayList<Integer>();
		Random rand = new Random();
//Rastgele 19 adet de�er olu�turdum burada.
		for(int i=0;i<19;i++){
			IntegerList.add(rand.nextInt(100) + 1);
		}
		//Burada ise kendim 10 say�s�n� ekledim 20. de�er ( Kontrol yapabilmek i�in)
		IntegerList.add(10);
		return IntegerList;
	}
	//SearchInList Fonksiyonu ile ArrayList i�inde arama yap�yoruz...
	public static int SearchInList(List<Integer> arrList,int aranan){
		//Burada contains methodunu kullanarak �ok basit bir �ekilde list i�inde
		//aranan de�erin olup olmad��� kontrol�n� yapt�m.
	      if(arrList.contains(aranan)) {
	    	  
	    	  return aranan;
	    	  
	      }

		
		return 0;
	}
	
	//Main methodu ile kullan�c�dan aranacak de�eri al�p gerekli i�lemleri 
	//di�er methodlarda yapt�m.
	
		public static void main(String[] args){
			
			int aranan=0;
			//Aranan de�eri kullan�c�dan inputDialog �eklinde(Sadece g�rsellik katmak i�in) ald�m.
			aranan = Integer.parseInt(JOptionPane.showInputDialog("Aranan Say�y� Giriniz"));
	        //de�eri aramak i�in SearchInList methoduna g�nderdim.
			int bulunan = SearchInList(CreateAList(),aranan);
	        //Bulunup bulunmad���n� kontrol ettim ve bunuda MessageDialog �eklinde
			//Kullan�c�ya g�sterdim.(Sizde 10 say�s�n� arat�rsan�z test edebilirsiniz.)
	        if(bulunan==aranan){
	        	JOptionPane.showMessageDialog(null, bulunan+" Say�s� bulundu." );
	        }
	        else{
	        	JOptionPane.showMessageDialog(null, "Aranan de�er bulunamad�.");
	        }
		}
	
}
//Arama i�lemini list veri tipinde benim ara�t�rd���m kadar�yla en h�zl� bu �ekilde O(1) 

