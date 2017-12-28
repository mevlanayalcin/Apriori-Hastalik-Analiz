package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
@SuppressWarnings("Duplicates")
@WebServlet(urlPatterns = "/ControllerServlet")
public class ControllerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String command=request.getParameter("command");
        if(command.equals("birliktelik"))
        {
            List<String> birliktelikListesi =new ArrayList<>();
            String hastalik = request.getParameter("hastalik");
            birliktelikListesi = birliktelikGetir(hastalik);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/birliktelik.jsp");
            request.setAttribute("birliktelikListesi", birliktelikListesi);
            System.out.println("Dizimiz :" + birliktelikListesi);
            requestDispatcher.forward(request, response);
        }
        else if(command.equals("enCok"))
        {
            List<String> enCokRastlananListesi=new ArrayList<>();
            enCokRastlananListesi=enCokRastlananHastalikKayitlariGetir();
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/enCokRastlanan.jsp");
            request.setAttribute("enCok", enCokRastlananListesi);
            requestDispatcher.forward(request, response);

        }
    }



    private List<String> birliktelikGetir(String hastalik) throws IOException 
    {
        String deger=hastalik+",";
        System.out.println( lineNumbers(deger) );

        List<Integer>sayilar=new ArrayList<>();
        sayilar=lineNumbers(deger);

        List<String>sonrakiler=new ArrayList<>();
        for(Integer i:sayilar)
        {


            String line = Files.readAllLines(Paths.get("C:\\Users\\Mevlana\\Intellij Projeler\\Hastalik-Analiz\\web\\data\\AssociationRules.txt")).get(i-1);


            //Line � �nce 2 ye b�l�p sonra tekrar ikiye b�l�yoruz
            String[] dizi=line.split(":");
            if(dizi[0].equals(deger))
            {
                System.out.println(line);

                sonrakiler.add(dizi[1]);

            }


        }
        System.out.println("Fonksiyondan gelen dizi : "+sonrakiler);
        return sonrakiler;
    }


    public static List<Integer> lineNumbers(String x) throws IOException
    {
        LineNumberReader lineReader = new LineNumberReader(new FileReader("C:\\Users\\Mevlana\\Intellij Projeler\\Hastalik-Analiz\\web\\data\\AssociationRules.txt"));
        List<Integer>sayilar=new ArrayList<>();
        String line;
        while ((line = lineReader.readLine()) != null)
        {
            if (line.contains(x))
            {

                sayilar.add(lineReader.getLineNumber());

            }
        }
        return sayilar;
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
