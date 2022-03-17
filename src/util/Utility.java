package util;

import java.io.File;
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
}
