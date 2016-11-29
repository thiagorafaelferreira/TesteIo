import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class ManipulandoArquivosTeste {

	public static void main(String[] args) throws IOException {
		new ManipulandoArquivosTeste().gravaTextoDoTecladoEmArquivo("copia.txt");
	}
	
	public void lendoDoteclado() throws IOException {
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Digite sua mensagem:");
		String linha = bufferedReader.readLine();
		while (linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }
		bufferedReader.close();
	}
	
	public void lendoDoArquivo(String arquivo) throws IOException {
		InputStream inputStream = new FileInputStream(arquivo);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Digite sua mensagem:");
		String linha = bufferedReader.readLine();
		while (linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }
		bufferedReader.close();
	}
	
	public void lendoDoArquivoCodigoOtimizado(String arquivo) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)));
		System.out.println("Digite sua mensagem:");
		String linha = bufferedReader.readLine();
		while (linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }
		bufferedReader.close();
	}
	
	public void lendoDoArquivoUsandoScanner(String arquivo) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(arquivo));
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}
	
	public void lendoDoTecladoUsandoScanner() throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}
	
	public void copiarTextoDeUmArquivoParaOutro(String arquivoOrigem, String arquivoDestino) throws IOException {
		Scanner scanner = new Scanner(new FileInputStream(arquivoOrigem));
		OutputStream outputStream = new FileOutputStream(arquivoDestino);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		while(scanner.hasNextLine()) {
			bufferedWriter.write(scanner.nextLine());
		}
		scanner.close();
		bufferedWriter.close();
		
		
	}
	
	public void copiarTextoDeUmArquivoParaOutro2(String arquivoOrigem, String arquivoDestino) throws IOException {
		Scanner scanner = new Scanner(new FileInputStream(arquivoOrigem));
		PrintStream printStream = new PrintStream(new FileOutputStream(arquivoDestino));

		while(scanner.hasNextLine()) {
			printStream.println(scanner.nextLine());
		}
		scanner.close();
		printStream.close();
		
		
	}
	

	public void gravaTextoDoTecladoEmArquivo(String arquivoDestino) throws IOException {
		Scanner scanner = new Scanner(System.in);
		PrintStream printStream = new PrintStream(new FileOutputStream("copia.txt"));

		while(scanner.hasNextLine()) {
			printStream.println(scanner.nextLine());
		}
		scanner.close();
		printStream.close();
		
		
	}
}
