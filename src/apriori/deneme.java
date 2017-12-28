package apriori;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class deneme
{
    public static void main(String[] args) throws IOException {
        deneme d=new deneme();
        List<String>dizi=new ArrayList<>();
        dizi=d.enCokRastlananHastalikKayitlariGetir();
        for(String s:dizi) {
            System.out.println(s);
        }
    }

    private List<String> enCokRastlananHastalikKayitlariGetir() throws IOException
    {
        List<String>dizi=new ArrayList<>();
        LineNumberReader lineReader = new LineNumberReader(new FileReader("C:\\Users\\Mevlana\\Intellij Projeler\\Hastalik-Analiz\\web\\data\\frequentItemsets.txt"));
        String line;
        while ((line = lineReader.readLine()) != null)
        {
            dizi.add(line);
        }
        return  dizi;
    }
}
