package Dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfi {

	
	
	Properties p = new Properties();
	
	public Propertiesfi() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\DELL\\git\\Testng\\src\\test\\resources\\data.properties");
		p.load(f);
	}
	
	
	public String fname() {
	String name =	 p.getProperty("fname");
	return name;
	}
	public String url() {
	String url =	p.getProperty("url");
	return url;
	}
	public String password() {
	String pass= 	p.getProperty("pass");
	return pass;}
	public String data(String data) {
	String dat =	p.getProperty(data);
	return dat;
		
	}

	
	
	public String email() {
	String emai =	p.getProperty("email");
	return emai;
	}
	public String lname() {
	String lname=	 p.getProperty("lname");
	return lname;}
	
	public String username() {
		String conph=   p.getProperty("username");
    return conph;
	}
	
	public String biogra() {
		String bio = p.getProperty("bio");
		return bio;}
		
		public String confpass() {
			String conph=p.getProperty("confipass");
			return conph;
	
		
		
		
		
		
	}
	
}
