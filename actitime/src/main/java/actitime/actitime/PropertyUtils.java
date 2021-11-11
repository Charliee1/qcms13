package actitime.actitime;
import java.io.FileInputStream;
import java.util.Properties;
public class PropertyUtils {
	public String getPropertyData(String filepath, String Key)
	{
		FileInputStream file;
		try {
			file = new FileInputStream(filepath);
			Properties properties = new Properties();
			properties.load(file);
			return properties.getProperty(Key);
			//String Value = properties.getProperty("Key");
			} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}