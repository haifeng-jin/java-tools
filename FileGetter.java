package tools.algorithm.common;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileGetter {
	public static String getContent(String path)
	{
		String content="";
		String line="";
		BufferedReader br=null;
		try{
		
		FileInputStream fin = new FileInputStream(path);
		br = new BufferedReader(new InputStreamReader(fin));
		while((line=br.readLine())!=null)
		{
			content+=line+"\n";
		}
		br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return content;
	}
}
