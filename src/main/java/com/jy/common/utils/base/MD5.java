package com.jy.common.utils.base;

import java.security.*;

public class MD5
{
    public static String md5(String str) {
        try {
            final MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            final byte[] b = md.digest();
            final StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; ++offset) {
                int i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            str = buf.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
    
    public static void main(final String[] args) {
        System.out.println(md5("11"));
        System.out.println(md5("22"));
    }
}
