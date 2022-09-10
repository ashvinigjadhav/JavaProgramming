import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling {

	public static String[][] getLoginDataFromFile() throws IOException {
		File file = new File("D:\\selenium notes\\MYFILE.txt");
		FileReader read = new FileReader(file);
		BufferedReader br = new BufferedReader(read);

		// BufferedReader br=new BufferedReader(new FileReader(new File("D:\\selenium
		// notes\\MYFILE.txt")));

		String line;
		String row[] = new String[3];
		int numberLine = getline();
		int numberRow = getNumberrow();
		String[][] logindata = new String[numberLine][numberRow];
		int j = 0;
		while ((line = br.readLine()) != null) {

			row = line.split(" ");

			logindata[j] = row;

			j++;

		}
		br.close();
		return logindata;
	}

	public static int getline() throws IOException {
		File file = new File("D:\\selenium notes\\MYFILE.txt");
		FileReader read = new FileReader(file);
		BufferedReader br = new BufferedReader(read);
		int line = 0;
		String row;
		while ((row = br.readLine()) != null) {

			line++;
		}
		br.close();
		return line;
	}

	public static int getNumberrow() throws IOException {
		File file = new File("D:\\selenium notes\\MYFILE.txt");
		FileReader read = new FileReader(file);
		BufferedReader br = new BufferedReader(read);
		int line = 0;
		String row;
		if ((row = br.readLine()) != null) {

			String s[] = row.split(" ");
			br.close();
			return s.length;
		} else {
			br.close();
			return 0;
		}
	}

	public static void main(String[] args) throws IOException {
		/*
		 * // TODO Auto-generated method stub File file=new
		 * File("D:\\selenium notes\\MYFILE.txt"); FileReader read=new FileReader(file);
		 * BufferedReader br=new BufferedReader(read);
		 * System.out.println(file.hashCode());
		 * 
		 * 
		 * //BufferedReader br=new BufferedReader(new FileReader(new
		 * File("D:\\selenium notes\\MYFILE.txt")));
		 * 
		 * String st, s[]=new String[3]; while((st=br.readLine())!=null) {
		 * System.out.println(st);
		 * 
		 * s= st.split(" "); for(int i=0;i<s.length;i++) { System.out.println(s[i]);
		 * 
		 * }
		 * 
		 * }
		 */

		String ldata[][] = new String[3][3];
		ldata = getLoginDataFromFile();
		for (int j = 0; j < 3; j++)
			for (int i = 0; i < 3; i++) {

				System.out.println(ldata[j][i]);
			}

	}

}
