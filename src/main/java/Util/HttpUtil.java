package Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtil {

	private String value;

	public HttpUtil() {

	}

	public HttpUtil(String value) {
		super();
		this.value = value;
	}

	public <T> T toModel(Class<T> tClass) {

		try {

			return new ObjectMapper().readValue(value, tClass);

		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static HttpUtil of(BufferedReader reader) {

		StringBuilder sb = new StringBuilder();
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sb);
		return new HttpUtil(sb.toString());
	}

	public <T> List<T> toModel(TypeReference<List<T>> typeReference) {

		try {
			return new ObjectMapper().readValue(value, typeReference);

		} catch (JsonMappingException e) {

			e.printStackTrace();

		} catch (JsonProcessingException e) {

			e.printStackTrace();

		}

		return null;
	}
	public static String getTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}
}
