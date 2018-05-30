package com.jy.common.utils.html;

public class HtmlUtils
{
    public static String htmlToString(final String content) {
        if (content == null) {
            return "";
        }
        String html = content.replace("'", "&apos;");
        html = html.replaceAll("&", "&amp;");
        html = html.replace("\"", "&quot;");
        html = html.replace("\t", "&nbsp;&nbsp;");
        html = html.replace(" ", "&nbsp;");
        html = html.replace("<", "&lt;");
        html = html.replaceAll(">", "&gt;");
        return html;
    }
    
    public static String stringToHtml(final String content) {
        if (content == null) {
            return "";
        }
        String html = content.replace("&apos;", "'");
        html = html.replaceAll("&amp;", "&");
        html = html.replace("&quot;", "\"");
        html = html.replace("&nbsp;&nbsp;", "\t");
        html = html.replace("&nbsp;", " ");
        html = html.replace("&lt;", "<");
        html = html.replaceAll("&gt;", ">");
        return html;
    }
}
