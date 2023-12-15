package files;

public class payload {
	//by making this method static you can call this method without any object you can call by using classname.methodname
	// but if you don't make it static you need to make object for this class to call this method further
	public static String AddPlace()
	{
		return  "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Rana Muhammad home\",\r\n"
				+ "  \"phone_number\": \"03344222283\",\r\n"
				+ "  \"address\": \"RANA House Dijkot Faisalabad\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"Civl Hospital Road\",\r\n"
				+ "    \"Home\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"Punjabi\"\r\n"
				+ "}";
		
	}

}
