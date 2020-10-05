import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IntroductionToSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		BufferedReader bufferReaderLocal = new BufferedReader(new InputStreamReader((System.in)));
		try{
			//Calling URL
			SeleniumTask.accessURL();
			
			
			System.out.print("Waiting for an input: ");
			bufferReaderLocal.readLine();
		}
		catch(IOException myException)
		{
			myException.printStackTrace();
		}

	}

}
