import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class WebSiteReader 
{

	public static void main(String[] args) 
	{
		String nextLn = "";
		URL url=null;
		URLConnection urlConn = null;
		
		InputStreamReader inStream = null;
		BufferedReader buffR = null;
		
		try
		{
			url = new URL("http://yandex.ru");
			urlConn = url.openConnection();
			
			inStream = new InputStreamReader(urlConn.getInputStream(), "UTF8");
			buffR = new BufferedReader(inStream);
			
			while(true)
			{
				nextLn = buffR.readLine();
				
				if (nextLn != null)
				{
					System.out.println(nextLn);
				}
				else break;
			}
		}
		catch (MalformedURLException e)
		{
			System.out.println("Please check the URL: " + e.toString());
		}
		catch (IOException e1)
		{
			System.out.println("Can't read from the I-net: " + e1.toString());
		}
		finally
		{
			if (inStream != null)
			{
				try
				{
					inStream.close();
					buffR.close();
				}
				catch (IOException e1)
				{
					System.out.println("Can't close the stream: " + e1.getMessage());
				}
			}
		}
	}
}
