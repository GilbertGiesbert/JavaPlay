package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonApp {

    public static void main(String... args){
        new JsonApp().start();
    }

    private void start() {

        String weatherJsonStr = ResourceReader.read("json/json.txt");

        int day = 2;
        System.out.println("weatherJsonStr=");
        System.out.println(weatherJsonStr);

        double max = getMaxTemperatureForDay(weatherJsonStr, day);
        System.out.print("max="+max);
    }

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
   		throws JSONException {

        JSONObject json = new JSONObject(weatherJsonStr);

        JSONArray list = json.getJSONArray("list");

        JSONObject day = list.getJSONObject(dayIndex);

        JSONObject temp = day.getJSONObject("temp");

   		return temp.getDouble("max");
   	}
}
