package genricLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public String  getpropertyFileData(String key) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(AutoConstant.PropertyfilePath);
		p.load(fis);
		return p.getProperty(key);
		
		
	}

}
