import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesCreate{
	public static void main(String[] args){

		File my_file1=new File("exercise1.txt");
		try{

			Scanner file_reader = new Scanner(my_file1);

			while(file_reader.hasNextLine()){

				String text = file_reader.nextLine();
				System.out.println(text);
			}
			boolean file_created=my_file1.createNewFile();

			if (file_created){
				FileWriter my_file_write1= new FileWriter("exercise1.txt");
				my_file_write1.write("This is my first file");
				my_file_write1.close();
			}
			
		}
			catch(IOException e){
			System.out.println("error");
		}
		
	}
}