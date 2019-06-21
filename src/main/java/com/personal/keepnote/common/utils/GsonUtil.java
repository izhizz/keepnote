package com.personal.keepnote.common.utils;

import com.google.gson.*;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;

/**
 * Created by xali on 15/3/20.
 */
public class GsonUtil {
    public static final Gson gson = new Gson();


    /**
     * 对象转换成json字符串
     *
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        if (obj != null) {
            return gson.toJson(obj);
        }
        return null;
    }

    /**
     * json字符串转成对象
     *
     * @param str
     * @param type
     * @return
     */
    public static <T> T fromJson(String str, Type type) {
        return gson.fromJson(str, type);
    }

    /**
     * json转成对象
     *
     * @param json
     * @param type
     * @return
     */
    public static <T> T fromJson(JsonElement json, Type type) {
        return gson.fromJson(json, type);
    }

    /**
     * json字符串转成对象
     *
     * @param str
     * @param type
     * @return
     */
    public static <T> T fromJson(String str, Class<T> type) {
        if (StringUtils.isNotEmpty(str)) {
            return gson.fromJson(str, type);
        }
        return null;
    }

    /**
     * json转成对象
     *
     * @param json
     * @param type
     * @return
     */
    public static <T> T fromJson(JsonElement json, Class<T> type) throws JsonIOException, JsonSyntaxException {
        if (json != null) {
            return gson.fromJson(json, type);
        }
        return null;
    }

    /**
     * json字符串转成Json对象
     *
     * @param str
     * @return
     */
    public static JsonElement str2Json(String str) throws JsonIOException, JsonSyntaxException {
        if (StringUtils.isNotEmpty(str)) {
            return new JsonParser().parse(str);
        }
        return null;
    }
}
