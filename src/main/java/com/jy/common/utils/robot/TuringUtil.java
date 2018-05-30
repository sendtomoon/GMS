package com.jy.common.utils.robot;

import java.net.*;
import org.apache.commons.lang3.*;
import org.apache.http.impl.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.util.*;
import net.sf.json.*;
import org.apache.http.*;

public class TuringUtil
{
    static final String URL = "http://www.tuling123.com/openapi/api";
    static final String KEY = "4473b356943e0dc7c2c6b4d296927bea";
    
    public static String get(final String content) {
        return get(content, null);
    }
    
    public static String get(final String content, final String userid) {
        String result = "";
        try {
            final String INFO = URLEncoder.encode(content, "utf-8");
            String requesturl = "http://www.tuling123.com/openapi/api?key=4473b356943e0dc7c2c6b4d296927bea&info=" + INFO;
            if (StringUtils.isNotBlank((CharSequence)userid)) {
                requesturl = String.valueOf(requesturl) + "&userid=" + userid;
            }
            final HttpGet request = new HttpGet(requesturl);
            final HttpResponse response = (HttpResponse)HttpClients.createDefault().execute((HttpUriRequest)request);
            if (response.getStatusLine().getStatusCode() == 200) {
                final String responseRes = EntityUtils.toString(response.getEntity());
                final JSONObject jsStr = JSONObject.fromObject((Object)responseRes);
                result = jsStr.getString("text");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public static void main(final String[] args) {
        System.out.println(get("\u4f60\u597d"));
    }
}
