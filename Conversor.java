
public class Conversor {

	
   public int converter(int dec){
	   int resto;
	   int multiplicador =1;
	   int binario=0;
	   
	   while (dec !=0 ){
		   resto = dec % 2;
		   binario = resto * multiplicador;
		   multiplicador *= 10;
	   }
	 return binario;
   }

}
