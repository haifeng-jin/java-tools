package tools.algorithm.common;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class CommandLine {
	public static void RunSh(String filename){
		String realPath = CommandLine.class.getClassLoader().getResource("").getFile();
		java.io.File file = new java.io.File(realPath);
		realPath = file.getParentFile().getAbsolutePath();
		realPath+="/src/shell/"+filename;
		System.out.println(realPath);
		Execute(realPath);
		
	}
	
	public static String Execute(String command){
		try
		{
			String output="";
			Process process = Runtime.getRuntime().exec (command);
			InputStreamReader ir=new InputStreamReader(process.getInputStream());
			LineNumberReader input = new LineNumberReader (ir);
			String line;
			while ((line = input.readLine ()) != null){
				if(line.startsWith("Running on hadoop")){}
				else if(line.startsWith("HADOOP_CONF_DIR")){}
				else{
					//System.out.println(line);
					output+=line+"\n";
				}
			}
			return output;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return "";
		}
	}
	
	public static String Execute(String[] command){
		try
		{
			String output="";
			Process process = Runtime.getRuntime().exec (command);
			InputStreamReader ir=new InputStreamReader(process.getInputStream());
			LineNumberReader input = new LineNumberReader (ir);
			String line;
			while ((line = input.readLine ()) != null){
				System.out.println(line);
			}
			return output;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return "";
		}
	}
}
