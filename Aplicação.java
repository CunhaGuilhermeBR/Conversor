import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		Conversor c = new Conversor();
		int dec, binario = 0;
        System.out.println("Digite um número decimal que ele será convertido em binário");
        dec = ler.nextInt();
        c.converter(dec);
        System.out.println("Em binário virou:" + binario);
	}

}
