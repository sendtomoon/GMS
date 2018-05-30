package com.jy.common.utils.email;

import com.jy.common.utils.*;
import java.util.*;
import java.io.*;

public class MailTemplate
{
    private String templateBody;
    private List<String> ccMails;
    private List<String> bccMails;
    private List<String> toMails;
    private List<String> fileList;
    
    public MailTemplate() {
        this.ccMails = new ArrayList<String>();
        this.bccMails = new ArrayList<String>();
        this.toMails = new ArrayList<String>();
        this.fileList = new ArrayList<String>();
    }
    
    public MailTemplate(final String templetPath, final String toMail, final String ccMail, final String bccMail) throws IOException {
        this.ccMails = new ArrayList<String>();
        this.bccMails = new ArrayList<String>();
        this.toMails = new ArrayList<String>();
        this.fileList = new ArrayList<String>();
        this.loadTemplet(templetPath);
        if (PatternUtil.isEmail(toMail)) {
            this.toMails.add(toMail);
        }
        if (PatternUtil.isEmail(ccMail)) {
            this.ccMails.add(ccMail);
        }
        if (PatternUtil.isEmail(bccMail)) {
            this.bccMails.add(bccMail);
        }
    }
    
    public MailTemplate addFile(final String filePath) {
        if (FileUtil.isFile(filePath)) {
            this.fileList.add(filePath);
        }
        return this;
    }
    
    public MailTemplate addFiles(final List<String> files) {
        if (files != null && files.size() > 0) {
            this.fileList.addAll(files);
        }
        return this;
    }
    
    public MailTemplate toMail(final String... toMails) {
        if (toMails != null && toMails.length > 0) {
            for (final String toMail : toMails) {
                if (PatternUtil.isEmail(toMail)) {
                    this.toMails.add(toMail);
                }
            }
        }
        return this;
    }
    
    public MailTemplate ccMail(final String... ccMails) {
        if (ccMails != null && ccMails.length > 0) {
            for (final String ccMail : ccMails) {
                if (PatternUtil.isEmail(ccMail)) {
                    this.ccMails.add(ccMail);
                }
            }
        }
        return this;
    }
    
    public MailTemplate bccMail(final String... bccMails) {
        if (bccMails != null && bccMails.length > 0) {
            for (final String bccMail : bccMails) {
                if (PatternUtil.isEmail(bccMail)) {
                    this.bccMails.add(bccMail);
                }
            }
        }
        return this;
    }
    
    public MailTemplate loadTemplet(final String templetPath) throws IOException {
        InputStream input = null;
        InputStreamReader read = null;
        BufferedReader reader = null;
        if (!new File(templetPath).exists()) {
            this.templateBody = "";
        }
        try {
            input = new FileInputStream(templetPath);
            read = new InputStreamReader(input, "UTF-8");
            reader = new BufferedReader(read);
            String result = "";
            String line;
            while ((line = reader.readLine()) != null) {
                result = String.valueOf(result) + line + "\n";
            }
            this.templateBody = result.substring(result.indexOf("<html>"));
        }
        catch (Exception e) {
            e.printStackTrace();
            this.templateBody = "";
            return this;
        }
        finally {
            reader.close();
            read.close();
            input.close();
        }
        reader.close();
        read.close();
        input.close();
        return this;
    }
    
    @Override
    public String toString() {
        return this.templateBody;
    }
    
    public String getToMail() {
        if (this.toMails != null && this.toMails.size() > 0) {
            join(this.toMails, ",").substring(1);
        }
        return null;
    }
    
    public String getCcMail() {
        if (this.ccMails != null && this.ccMails.size() > 0) {
            join(this.ccMails, ",").substring(1);
        }
        return null;
    }
    
    public String getBccMail() {
        if (this.bccMails != null && this.bccMails.size() > 0) {
            join(this.bccMails, ",").substring(1);
        }
        return null;
    }
    
    public List<String> getFileList() {
        return this.fileList;
    }
    
    public static <T> String join(final List<T> array, final String separator) {
        if (array == null) {
            return null;
        }
        final int noOfItems = array.size();
        if (noOfItems <= 0) {
            return null;
        }
        if (noOfItems == 1) {
            return array.get(0).toString();
        }
        final StringBuilder buf = new StringBuilder(noOfItems * 16);
        for (int i = 0; i < noOfItems; ++i) {
            buf.append(separator);
            if (array.get(i) != null) {
                buf.append(array.get(i));
            }
        }
        return buf.toString();
    }
}
