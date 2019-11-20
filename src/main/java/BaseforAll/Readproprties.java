package BaseforAll;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproprties {
	
	 public  Properties Logprop;

		
	public void admin_url() throws IOException {
		
		Logprop = new Properties();
		
		FileInputStream fis = new FileInputStream("/home/rupesh/Rupesh-workspace/BDCollect/src/main/java/BaseforAll/BDCollect.properties");
		
		Logprop.load(fis);

                
	
}

}
