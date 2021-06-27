import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Json_prettier {
	
	public static void main(String[] args) {
		System.out.println("Hello my Json Fromatter");

		//read in the json file
		try {
			JSONObject jsonObject = (JSONObject)parser
				.parse(new FileReader("./mayfly_json.json"));
			Iterator keys = jsonObject.keys();
			while (keys.hasNext()) {
				Object key = keys.next();
				JSONObject value = jsonObject.getJSONObject((String) key);
				String component = value.getString("component");
				System.out.println(component);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//read success message
		//format and print
		//store in a output file
		//outpout success messgae
	}
}

