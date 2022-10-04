package com.troop.jsonFileParser;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;

public class ReadJsons {
    public static JsonElement getJson1() {
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = null;
        try {

            File file1 = new File("/home/nabeeldce/Documents/jsonComparer/src/main/resources/file1.json");
            FileReader fileReader = new FileReader(file1);
            jsonElement = jsonParser.parse(fileReader);
        } catch (Exception e) {
            System.out.println("File not found");
        }
        return jsonElement;
    }

    public static JsonElement getJson2() {
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = null;
        try {
            File file2 = new File("/home/nabeeldce/Documents/jsonComparer/src/main/resources/file2.json");
            FileReader fileReader = new FileReader(file2);//Json2 filePath
            jsonElement = jsonParser.parse(fileReader);
        } catch (Exception e) {
            System.out.println("File not found");
        }
        return jsonElement;
    }
}
