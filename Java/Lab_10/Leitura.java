package Lab_10;
import java.io.*;

public class Leitura {
    public static void main(String[] args) {
        try{
            OutputStream os  = new FileOutputStream("saida.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            InputStream is = new FileInputStream("semana.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            while(s != null) {
                bw.write(s+"\n");
                s = br.readLine();
            }
            System.out.println("Escrita finalizada com sucesso!");
            br.close();
            bw.close();
        }
        catch(IOException e){
            System.out.println("Erro de IO: " + e);
        }

    }
}
