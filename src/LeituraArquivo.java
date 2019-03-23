import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivo {

	public static void main(String[] args) throws IOException {

		File arquivo = new File("src/nomes.txt");
		if(arquivo.exists()) {
			FileReader reader = new FileReader(arquivo);
			BufferedReader bufferedReader = new BufferedReader(reader);
			while(bufferedReader.ready()) {
				String linha = bufferedReader.readLine();
				System.out.println(linha);
			}
			bufferedReader.close();
			reader.close();
		}
		
		File arquivoNotas = new File("src/notas.txt");
		FileWriter writer = new FileWriter(arquivoNotas);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write("1");
		bufferedWriter.newLine();
		bufferedWriter.write("2");
		bufferedWriter.newLine();
		bufferedWriter.write("3");
		bufferedWriter.newLine();
		bufferedWriter.write("4");
		bufferedWriter.flush();
		bufferedWriter.close();
		writer.close();
 }
}
