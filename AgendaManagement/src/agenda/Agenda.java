package agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 @author paul.swapnil
 @author incani.matteo
 */
public class Agenda {

	final static int nameLength = 20;
	final static int addLength = 30;
	final static int capLength = 10;
	final static int cityLength = 20;
	private static int tot_record;
	static List<Id> l = new ArrayList<Id>();

	public static void main(String[] args) throws FileNotFoundException {
		File inputf = new File("agenda_telefonica_100.txt");
		Scanner input = new Scanner(inputf);
		String temp = "";
		int tot_rec = 0;
		while (input.hasNext()) {
			temp = input.nextLine();
			tot_rec++;
			Id id = stringSeparator(temp);
			l.add(id);
			adatta(id);
		}
		tot_record = tot_rec;
		input.close();
		printOutput();

		String p = "CANTON              FABRIZIO            02544347  via della orbita, 752         Copogna             ";

		RandomAccessFile raf = new RandomAccessFile("out.txt", "r");
		try {
			long lon = search(raf, p);
			
			raf.seek(lon);
			System.out.println(raf.readLine());
		} catch (IOException ex) {
			Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	/**
	 @param s
	 @return
	 */
	private static Id stringSeparator(String s) {
		String ids[] = s.split("\\t");
		return new Id(ids[0], ids[1], ids[2], ids[3], ids[4]);
	}

	private static void addId(Id id) {
		l.add(id);
		Collections.sort(l);
	}

	public static long search(RandomAccessFile file, String target) throws IOException {
		/*
		 * because we read the second line after each seek there is no way the
		 * binary search will find the first line, so check it first.
		 */
		file.seek(0);
		String line = file.readLine();
		if (line == null || line.compareTo(target) >= 0) {
			/*
			 * the start is greater than or equal to the target, so it is what
			 * we are looking for.
			 */
			return 0;
		}

		/*
		 * set up the binary search.
		 */
		long beg = 0;
		long end = file.length();
		while (beg <= end) {
			/*
			 * find the mid point.
			 */
			long mid = beg + (end - beg) / 2;
			file.seek(mid);
			file.readLine();
			line = file.readLine();

			if (line == null || line.compareTo(target) >= 0) {
				/*
				 * what we found is greater than or equal to the target, so look
				 * before it.
				 */
			//	System.out.println(line);
				end = mid - 1;
			} else {
				/*
				 * otherwise, look after it.
				 */
				beg = mid + 1;
			}
		}

		/*
		 * The search falls through when the range is narrowed to nothing.
		 */
		file.seek(beg);
		file.readLine();
		return file.getFilePointer();
	}

	private static void binarySearch(String value) {
		Collections.sort(l);
		ArrayList<String> valueToSearch = new ArrayList<>();

		for (Id id : l) {
			valueToSearch.add(id.getName().trim());
			// System.out.println(id.getName());
		}
		int index = Collections.binarySearch(valueToSearch, value);
		if (index < 0) {
			System.err.println("Contatto non presente!");
		} else {
			//System.out.println(value.toUpperCase().trim());
			//System.out.println(index);
			System.out.println(l.get(index));
		}
	}

	private static Id adatta(Id id) {      //riempi gli spazi mancanti
		String name = id.getName();
		String lastName = id.getLastName();
		String cap = id.getCap();
		String address = id.getAddress();
		String city = id.getCity();

		if (name.length() < nameLength) {
			int n = nameLength - name.length();
			name = addSpace(name, n);
			//System.out.println(n);
		}
		id.setName(name);

		if (lastName.length() < nameLength) {
			lastName = addSpace(lastName, nameLength - lastName.length());
		}
		id.setLastName(lastName);

		if (cap.length() < capLength) {
			cap = addSpace(cap, capLength - cap.length());
		}
		id.setCap(cap);

		if (address.length() < addLength) {
			address = addSpace(address, addLength - address.length());
		}
		id.setAddress(address);

		if (city.length() < cityLength) {
			city = addSpace(city, cityLength - city.length());
		}
		id.setCity(city);

		return id;
	}

	private static String addSpace(String s, int n) {
		for (int i = 0; i < n; i++) {
			s += " ";
		}
		return s;
	}

	private static void printOutput() {
		PrintWriter output = null;
		try {
			File outputf = new File("out.txt");
			if (!outputf.exists()) {
				try {
					outputf.createNewFile();
				} catch (IOException ex) {
					Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			output = new PrintWriter(outputf);
			Collections.sort(l);
			int n = 0;
			for (int i = 0; i < l.size(); i++) {
				output.println(l.get(i).toString());
				n++;
			}
			System.out.println(n + " Record <-- Sì esatto 100000 record in:");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
		}
		output.close();

	}
}
