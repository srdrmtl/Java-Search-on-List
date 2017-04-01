import java.util.*;
import java.util.Random;

import javax.swing.*;
public class class1 {

	
	//List veri tipinde 20 adet deðer oluþturmak için CreateAList fonksiyonunu
	//Kullanýyoruz...
	public static List<Integer> CreateAList(){
		//Veri tipini oluþturdum.
		List<Integer> IntegerList = new ArrayList<Integer>();
		Random rand = new Random();
//Rastgele 19 adet deðer oluþturdum burada.
		for(int i=0;i<19;i++){
			IntegerList.add(rand.nextInt(100) + 1);
		}
		//Burada ise kendim 10 sayýsýný ekledim 20. deðer ( Kontrol yapabilmek için)
		IntegerList.add(10);
		return IntegerList;
	}
	//SearchInList Fonksiyonu ile ArrayList içinde arama yapýyoruz...
	public static int SearchInList(List<Integer> arrList,int aranan){
		//Burada contains methodunu kullanarak çok basit bir þekilde list içinde
		//aranan deðerin olup olmadýðý kontrolünü yaptým.
	      if(arrList.contains(aranan)) {
	    	  
	    	  return aranan;
	    	  
	      }

		
		return 0;
	}
	
	//Main methodu ile kullanýcýdan aranacak deðeri alýp gerekli iþlemleri 
	//diðer methodlarda yaptým.
	
		public static void main(String[] args){
			
			int aranan=0;
			//Aranan deðeri kullanýcýdan inputDialog þeklinde(Sadece görsellik katmak için) aldým.
			aranan = Integer.parseInt(JOptionPane.showInputDialog("Aranan Sayýyý Giriniz"));
	        //deðeri aramak için SearchInList methoduna gönderdim.
			int bulunan = SearchInList(CreateAList(),aranan);
	        //Bulunup bulunmadýðýný kontrol ettim ve bunuda MessageDialog Þeklinde
			//Kullanýcýya gösterdim.(Sizde 10 sayýsýný aratýrsanýz test edebilirsiniz.)
	        if(bulunan==aranan){
	        	JOptionPane.showMessageDialog(null, bulunan+" Sayýsý bulundu." );
	        }
	        else{
	        	JOptionPane.showMessageDialog(null, "Aranan deðer bulunamadý.");
	        }
		}
	
}
//Arama iþlemini list veri tipinde benim araþtýrdýðým kadarýyla en hýzlý bu þekilde O(1) 

