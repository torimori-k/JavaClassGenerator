package util;

import java.io.File;

public class Utility {
    public static String setOutputFileLocation(String className){
        return "out" + File.separator + className + ".java";
    }
}
