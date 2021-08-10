package pro;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class propertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void getproperties() {
		try {
			Properties prop=new Properties();
			String systempath=System.getProperty("user.dir");
			InputStream  input=new FileInputStream(systempath+"/src/main/java/pro/config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);

		}catch(Exception exp) {
			System.out.println("The message"+exp.getMessage());
			System.out.println("Cause"+exp.getCause());
			exp.printStackTrace();
			
		}

	}
}
