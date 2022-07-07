package selenium.utils;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import selenium.project.model.MyPost;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class JsonUtils {

    private static Gson gson = new Gson();

    public static MyPost createMyPostByJson(String text) {
        MyPost myPost = gson.fromJson(text, MyPost.class);
        return myPost;
    }

    public static <T> T createOject(String path, Class<T> clazz) {
        String jsonText = null;
        try {
            jsonText = FileUtils.readFileToString(new File(path), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gson.fromJson(jsonText, clazz);
    }
}
