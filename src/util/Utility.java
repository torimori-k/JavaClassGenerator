package util;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utility {
    public static String setOutputFileLocation(String className){
        return "out" + File.separator + className + ".java";
    }

    public static void log(String ctx) {
        System.out.println(ctx);
    }

    // reference: https://stackoverflow.com/questions/2250031/null-check-in-an-enhanced-for-loop
    /**
     * Use Case: to avoid null exception while using foreach loop.
     *
     * @param list: List type collection to be checked if null or not
     * @param <T>: variable type for the target List
     * @return original list if not empty, else empty list
     */
    public static <T> List<T> getSafeList(List<T> list) {
        return list == null ? Collections.emptyList(): list;
    }

    public static void main(String[] args) {
        // changeTestInputFileNameInvalidParse();
    }

    private static void changeTestInputFileNameInvalidParse() {
        File srcRoot = new File("test_input/invalidParse");
        if (srcRoot.isDirectory()) {
            File[] files = srcRoot.listFiles();
            assert files != null;
            for (File file: files) {
                String name = file.getName();
                name = "testInvalidParse" + name.substring(11);
                if (file.renameTo(new File(srcRoot.getPath() + "/" + name))) {
                    System.out.println("The file is successfully renamed.");
                } else {
                    System.err.println("The file name could not be renamed.");
                }
            }
        } else {
            System.out.println("nonono");
        }
    }
}
