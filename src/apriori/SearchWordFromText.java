package apriori;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
@SuppressWarnings("Duplicates")

public class SearchWordFromText {
 
 public static void main(String[] args) throws Exception
 {
	 
	SearchWordFromText fromText=new SearchWordFromText();
	String deger="haydar,";
	System.out.println( lineNumbers(deger) );
	
	List<Integer>sayilar=new ArrayList<>();
	sayilar=lineNumbers(deger);


	 List<String>sonrakiler1=new ArrayList<>();
	for(Integer i:sayilar)
	{
		

	String line = Files.readAllLines(Paths.get("C:\\Users\\Mevlana\\Intellij Projeler\\Hastalik-Analiz\\web\\data\\AssociationRules.txt")).get(i-1);
	
	
	//Line � �nce 2 ye b�l�p sonra tekrar ikiye b�l�yoruz
	String[] dizi=line.split(":");
	if(dizi[0].equals(deger))
	{
		//System.out.println(line);
		System.out.println("Dizi 1 :"+dizi[1]);

		sonrakiler1.add(dizi[1]);
		List<String>sonrakiler=new LinkedList<String>(Arrays.asList(dizi[1].split(",")));
		
		//Arrays.asList(dizi[1].split(","));
		for(String s:sonrakiler1)
		{
			if(s.endsWith(", conf"))
			{
				sonrakiler.remove(s);
			}
		}
	     //System.out.println(deger+" degerleri gelirse bu gelece :"+sonrakiler);

	}
	
	
	}
	 System.out.println("Sonraaa :"+sonrakiler1);
	
	
	
	
	
	
	
 }
 
 public static List<Integer> lineNumbers(String x) throws IOException
 {
     LineNumberReader lineReader = new LineNumberReader(new FileReader("C:\\Users\\Mevlana\\Intellij Projeler\\Hastalik-Analiz\\web\\data\\AssociationRules.txt"));
     // String numbers = "";
     List<Integer>sayilar=new ArrayList<>();
     String line;
     while ((line = lineReader.readLine()) != null)
     {
         if (line.contains(x))
         {
             //numbers += "," + lineReader.getLineNumber();
             sayilar.add(lineReader.getLineNumber());
             
         }
     }
     //return "[" + numbers.substring(1) + "]";
     return sayilar;
 }
 


 
 
 
}