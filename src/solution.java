import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class solution {

	public static void main(String s[]) {

		Scanner sc = new Scanner(System.in);
		int number;
		do {
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next();
		    }
		    number = sc.nextInt();
		    
		} while ( number < 0 && number > 10001);
		
		String chromo = null;
		List<String> keys = new ArrayList<String>();
		List<String> values = new ArrayList<String>();
		for( int x = 0; x < number*2 ; x++) {
			sc = new Scanner(System.in);
			String value;
			if( x % 2 == 0) {
				do {
					while (!sc.hasNext()) {
						System.out.println("Nothing is entered! Retry");
						sc.next();
					}
					value = sc.next();
					
				} while ( value.length() > 100);
				keys.add(value);
				chromo = value;
			} else {
				do {
					while (!sc.hasNext()) {
						System.out.println("Nothing is entered! Retry");
						sc.next();
					}
					value = sc.next();
					
				} while ( value.length() < 1 && value.length() > chromo.length());
				values.add(value);
			}
		}
		
		Map<String, String> geneMatcher = new LinkedHashMap<String, String>();
		for( int f = 0; f < values.size(); f++) {
			geneMatcher.put(values.get(f), keys.get(f));
		}
		
		List<String> results = new ArrayList<String>();
		
		results = matchGenes(geneMatcher);
		results.forEach(System.out::println);
		sc.close();

	}

	public static List<String> matchGenes(Map<String, String> geneMatcher) {
		List<String> results = new ArrayList<String>();
		
		Iterator<Entry<String, String>> mapIterator = geneMatcher.entrySet().iterator();
		while(mapIterator.hasNext()) {
			Entry<String, String> obj = mapIterator.next();
			String gene = obj.getKey();
			String chromosome = obj.getValue();
			boolean result = isSequencePresent(chromosome, gene);
			results.add("" + result);
		}
		return results;
	}

	public static boolean isSequencePresent(String chromosome, String gene) {
		boolean result = true;
		
		char gene1[] = gene.toCharArray();
		String chromo= chromosome;
		
		for ( int i =0; i < gene1.length; i++) {
			String gen = gene1[i] + "";
			int indexPos = chromo.indexOf(gen);
			if( indexPos > -1) {
				chromo = chromo.substring(indexPos+1);
			} else {
				result = false;
				break;
			}
		}
		return result;
	}
}
