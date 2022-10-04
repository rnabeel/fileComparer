package com.troop.jsonFileParser;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Map;

@SpringBootApplication
public class JsonFileParserApplication {

	public static void main(String[] args) {
		method();
	}

	public static void method() {

		Gson gsonInstance = new Gson();
		Type typeMap = new TypeToken<Map<String, String>>() {
		}.getType();

		JsonElement jsonFile1 = ReadJsons.getJson1();
		JsonElement jsonFile2 = ReadJsons.getJson2();

		Map<String, String> mappedFile1 = gsonInstance.fromJson(jsonFile1, typeMap);
		Map<String, String> mappedFile2 = gsonInstance.fromJson(jsonFile2, typeMap);

		MapDifference<String, String> difference = Maps.difference(mappedFile1, mappedFile2);
		if (difference.toString()=="equal") {
			System.out.println("Matched");
		} else {
			System.out.println("Not Matched");
		}

	}

	}


//		System.out.println("Matched");
//		difference.entriesInCommon().forEach((key, value) -> System.out.println("" + key + ": " + value));
//	}
//		difference.entriesDiffering().forEach((key, value) -> System.out.println("" + key + ": " + value));




