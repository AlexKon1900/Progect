package selenium.utils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fixtures {

    private final static Path BASE = Paths.get("src","test", "resources", "fixtures");

    public final static String POST_ID_88 = BASE.toString() + File.separator + "post_id_88.json";

}