package json;

public class ResourceReader {

	public static String read(String fileName) {

        String result = null;

       	ClassLoader classLoader = ResourceReader.class.getClassLoader();
//       	try {
////       	    result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
//       	} catch (IOException e) {
//       		e.printStackTrace();
//       	}

       	return result;
	}
}