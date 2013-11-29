package com.zelan.Engine;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JLabel;

import com.zelan.GUI.eDownloadVar;


/*
 * 
 * Instance of this class don't create
 * All methods and  fields are static
 * All fields that affect on the startup mode  set when we are pushing button
 * 
 * 
 */

public class Downloader {
	private static JLabel jlabel=null;
	private static String persentDownload="";		
	private static int numMax = 0;
	private static int numTo = 0;
	private static int num = 0;
	private static int numFrom = 0;
	private static eDownloadVar downloadVar;
	private static Double size=0.0;
	private static int howMuchFile;
	private static int count=0;
	private static InputStream input = null;
	private static FileOutputStream fileOut = null;
	private static URL fileURL = null;
	private static HttpURLConnection ConnectionURL = null;

	private static String URLstart = new String("http://myflex.org/yf/podru/budam");	
	
	
	//Get the number of podcast on URL http://americhka.us
	public static String getNumMaxStr(){
		URL url = null;
		URLConnection urlConn = null;
		InputStreamReader  inStream = null;
		BufferedReader buff = null;
		try{
			url  = new URL("http://americhka.us" );
	        urlConn = url.openConnection();
	        inStream = new InputStreamReader(urlConn.getInputStream(), "UTF8");
	        buff  = new BufferedReader(inStream);
	        String nextLine; 
	        
	        
	        //find "<a href=\"http://myflex.org/yf/podru/budam" on URL http://americhka.us
	        while (true){
	        	nextLine = buff.readLine();  
	            if(nextLine==null) break;
	            if ((nextLine.toLowerCase()).contains("<a href=\"http://myflex.org/yf/podru/budam")){
	            	
	            	//Cuts number from absolute's name of file
	            	nextLine=nextLine.replace(" ", "").substring(nextLine.indexOf("budam")+4, nextLine.indexOf("budam")+7);
	                   	 
	            	setNumMax(Integer.parseInt(nextLine));
	            //	System.out.println(numMax);
	            	return nextLine; 
	            }	             
	        }
	    } 
		catch(MalformedURLException e){
	    	 reset();
	    	 System.out.println("Please check the URL:" + 
	                                           e.toString() );
	    } 
		catch(IOException  e1){
	    	 reset();
	    	 System.out.println("Can't read  from the Internet: "+ e1.toString() ); 
	    } 
		finally{
	    	if (inStream != null){
	    	  try{	 
	    		inStream.close();
	    		buff.close();
	    	  } 
	    	  catch(IOException e1){
	    		  System.out.println("Can't close the streams: " + e1.getMessage());
	    	  }
	    	}
	    }
	    return "Can't parse main information, or problem with internet";
	}

	
	public static void startDownload(eDownloadVar edownloadVar, JLabel label) {
		jlabel=label; //Link of l_InfoDownload from PodGui
		downloadVar=edownloadVar;
		if (edownloadVar == eDownloadVar.DownloadAll ){
			startDownloadAll();
			reset();
		}
		else if (edownloadVar == eDownloadVar.DownloadFromTo ){
			startDownloadFromTo();
			reset();	
		}
		else if (edownloadVar == eDownloadVar.DownloadOne ){
			startDownloadNum();
			reset();	
		}	
	}

	private static void startDownloadAll() {
		int numm;
		howMuchFile=numMax;
			
		for (numm = 1; numm <= numMax; numm++) {
			downloadMp3(numm);
		}
		numm = 0;
	}
		
	private static void startDownloadFromTo() {
		int numm;
		howMuchFile=numTo-numFrom+1;
			
		for (numm = numFrom; numm <= numTo; numm++) {
			downloadMp3(numm);
		}
		count=0;
		numm = 0;
	}
	
	private static void startDownloadNum() {
		howMuchFile=1;
		downloadMp3(num);
	}

	public static void downloadMp3(int numm) {
		try {
			count++;
			
			fileURL = new URL(URLstart + numm + ".mp3"); //
			ConnectionURL = (HttpURLConnection) fileURL.openConnection();
			fileOut = new FileOutputStream("budam" + numm + ".mp3");
			input = ConnectionURL.getInputStream();
			
			int data = 0;
			long resursLength = ConnectionURL.getContentLengthLong();
			File temp = new File("budam" + numm + ".mp3");
			
			int m = 0;
			while ((data = input.read()) != -1) {
				fileOut.write(data);
				m++;
				if (m == 10000) {
					m = 0;
					if(downloadVar==eDownloadVar.DownloadAll){
						
						persentDownload=((int) (((double) temp.length() / (double) resursLength) * 100)+ "%");
						jlabel.setText("count: "+ count + "/"+ howMuchFile+ " Downloaded: "+ persentDownload+
										"of budam"+numm+".mp3");
					}
					if(downloadVar==eDownloadVar.DownloadFromTo){
					
						persentDownload=((int) (((double) temp.length() / (double) resursLength) * 100)+ "%");
						jlabel.setText("count: "+ count + "/"+ howMuchFile+ " Downloaded: "+ persentDownload+
										"of budam"+numm+".mp3");
					}
					if(downloadVar==eDownloadVar.DownloadOne){
					
						persentDownload=((int) (((double) temp.length() / (double) resursLength) * 100)+ "%");
						jlabel.setText(" Downloaded: "+ persentDownload+
										"of budam"+numm+".mp3");
					}
				}		
			}
			
			if(resursLength==(new File("budam" + numm + ".mp3")).length()) {
						
				if(downloadVar==eDownloadVar.DownloadAll){
				
					persentDownload=((int) (((double) temp.length() / (double) resursLength) * 100)+ "%");
					jlabel.setText("Load: "+ count + "/"+ howMuchFile+ " Downloaded: "+ persentDownload+
									"of budam"+numm+".mp3");
				}
				if(downloadVar==eDownloadVar.DownloadFromTo){
				
					persentDownload=((int) (((double) temp.length() / (double) resursLength) * 100)+ "%");
					jlabel.setText("Load: "+ count + "/"+ howMuchFile+ " Downloaded: "+ persentDownload+
									"of budam"+numm+".mp3");
				}
				if(downloadVar==eDownloadVar.DownloadOne){
			
					persentDownload=((int) (((double) temp.length() / (double) resursLength) * 100)+ "%");
					jlabel.setText(" Downloaded: "+ persentDownload+
									"of budam"+numm+".mp3");
				}
			}		
		} 
		catch (MalformedURLException e) {
			System.out.println("MalformedURLException");
			reset();
		} 
		catch (IOException e) {
			reset();
			System.out.println("IOException");
		} 
		finally {
		//	System.out.println("вышел");
			ConnectionURL.disconnect();
			try {
				input.close();
				fileOut.flush();
				fileOut.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	//reset state's class
	public static void reset() {
	//	System.out.println("reset");
		
		numTo = 0;
		num = 0;
		numFrom = 0;
		size=0.0;
		count=0;
		
		input=null;
		fileOut=null;		
		fileURL=null;
		ConnectionURL=null;
	}
	
	public static void  getSize(eDownloadVar edownloadVar, JLabel label){
		jlabel=label;
		
		if (edownloadVar == eDownloadVar.DownloadAll){
			getSizeAll();
			reset();			
		}
		else if (edownloadVar == eDownloadVar.DownloadFromTo){
			howMuchFile=numTo-numFrom+1;
			getSizeFromTo();
			reset();
		}
		else if (edownloadVar == eDownloadVar.DownloadOne){
			howMuchFile=1;
			getSizeNum();
			reset();
		}
	}
	
	private static void getSizeNum() {
		
		try {
			fileURL = new URL(URLstart + num + ".mp3");
			ConnectionURL = (HttpURLConnection) fileURL.openConnection();
			
			size=(double) ConnectionURL.getContentLengthLong();
			jlabel.setText("Podcast num: "+num+"  size: "+size/1000000+" Mb");
			
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
			reset();
		} 
		catch(IOException e){
			reset();
			e.printStackTrace();
		}
		finally{
			ConnectionURL.disconnect();		
		}
		
		System.out.println(size);
	}	

	private static void getSizeFromTo() {

		try {
			int numm;
			for(numm=numFrom; numm<=numTo; numm++){
				count++;
				fileURL = new URL(URLstart + numm + ".mp3");
				ConnectionURL = (HttpURLConnection) fileURL.openConnection();
				
				size=size+ConnectionURL.getContentLengthLong();
				ConnectionURL.disconnect();
				System.out.println(size);

				jlabel.setText("count: "+ count + "/"+ howMuchFile+ " TotalSize: "+ size/1000000+" Mb");
			}
			count=0;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			reset();
		} catch(IOException e){
			e.printStackTrace();
			reset();
		}
		finally{
			ConnectionURL.disconnect();
			fileURL=null;
		}
		
	}

	private static void getSizeAll() {
	
		int numm = 0 ;
		try {
			
			for(numm=1; numm<=numMax; numm++){
				fileURL = new URL(URLstart + numm + ".mp3");
				ConnectionURL = (HttpURLConnection) fileURL.openConnection();
				
				size=size+ConnectionURL.getContentLengthLong();
				ConnectionURL.disconnect();
				System.out.println(size);
				jlabel.setText("count: "+numm+"/"+numMax+"  size: "+size/1000000+" Mb");
			}
			
		} catch (MalformedURLException e) {
			reset();
			e.printStackTrace();
		} catch(IOException e){
			reset();;
			
			e.printStackTrace();
		}
		finally{
			ConnectionURL.disconnect();
			fileURL=null;
		}	
	}
	
	/*
	 *
	 *
	 * Getters and Setters
	 */
	public static  void setNum(int num){
		Downloader.num=num;
	}

	public static void setNumMax(int numMax) {
		Downloader.numMax = numMax;
	}

	public static void setNumTo(int numTo) {
		Downloader.numTo = numTo;
	}

	public static void setNumFrom(int numFrom) {
		Downloader.numFrom = numFrom;
	}
	
	public static int getNumMax() {
		return numMax;
	}

	public static void main(String[] args){
	//	getNumMaxStr();
	//	downloadMp3(5);
	}
}
