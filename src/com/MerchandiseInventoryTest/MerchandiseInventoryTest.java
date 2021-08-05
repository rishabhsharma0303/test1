package com.MerchandiseInventoryTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MerchandiseInventoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Merchandise> list=new ArrayList<>();
		try {
			BufferedReader br= new BufferedReader(new FileReader(new File("C:\\Users\\ve00ym268\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Test1\\src\\com\\MerchandiseInventoryTest\\data.txt")));
			
			String line =null;
			while((line =br.readLine())!=null) {
				String []tokens=line.split(" ");
				Merchandise merchandise=new Merchandise(tokens[0],Integer.parseInt(tokens[1]),Double.parseDouble(tokens[2]));
				list.add(merchandise);
			}
			//Sort the merchandise elements in the ArrayList in an ascending order by names.
			Collections.sort(list, new Comparator<Merchandise>() {

				@Override
				public int compare(Merchandise o1, Merchandise o2) {
					// TODO Auto-generated method stub
					return o1.getItemCode().compareTo(o2.getItemCode());
				}
			});
			//Display the sorted merchandise elements (one per line).
			System.out.println("----------merchandises in an ascending order by names------.");
		
			for(Merchandise m:list) {
				System.out.println(m.getItemCode()+" "+m.getQuantity()+" "+m.getUnitPrice());
			}
		
			//Sort the merchandises in a descending order by price.
			Collections.sort(list, new Comparator<Merchandise>() {

				@Override
				public int compare(Merchandise o1, Merchandise o2) {
					// TODO Auto-generated method stub
					return o2.getUnitPrice().compareTo(o1.getUnitPrice());
				}
			});
			System.out.println("----------merchandises in an descending order by price------.");
			
			for(Merchandise m:list) {
				System.out.println(m.getItemCode()+" "+m.getQuantity()+" "+m.getUnitPrice());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
