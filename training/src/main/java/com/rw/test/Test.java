package com.rw.test;

import org.json.JSONArray;
import org.json.JSONString;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Map<String, Object>> maps = new ArrayList<>();
        maps.sort(Comparator.comparingInt(map -> (int) map.get("uid")));
    }
}
