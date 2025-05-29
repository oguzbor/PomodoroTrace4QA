package com.pomodoro.trace;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import org.json.simple.JSONObject;

public class PomodoroLogger {

    public static void log(String featureName, String scenarioName, String developer) {
        JSONObject obj = new JSONObject();
        obj.put("feature", featureName);
        obj.put("scenario", scenarioName);
        obj.put("developer", developer);
        obj.put("timestamp", LocalDateTime.now().toString());
        obj.put("pomodoro", 1); // Her test için 1 pomodoro

        try (FileWriter file = new FileWriter("log-output.json", true)) {
            file.write(obj.toJSONString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
