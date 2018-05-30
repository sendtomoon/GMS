package com.jy.common.utils.email;

import com.jy.common.utils.*;
import org.apache.commons.lang3.*;
import java.util.*;
import java.util.concurrent.*;

public class MailUtil
{
    public static final String SMTP_QQ = "smtp.qq.com";
    public static final String SMTP_163 = "smtp.163.com";
    public static final String SMTP_126 = "smtp.126.com";
    public static final String SMTP_SINA = "smtp.sina.com";
    public static final String SMTP_GMAIL = "smtp.gmail.com";
    
    public static MailConfig setConfig(final String smtp, final String port, final String email, final String emailName, final String userName, final String password) {
        final MailConfig mc = new MailConfig(smtp, port, email, emailName, userName, password);
        return mc;
    }
    
    public static MailConfig setConfig(final String mailProp) {
        final Map<String, String> emailMap = PropertyUtil.getPropertyMap(mailProp);
        final String smtp = emailMap.get("Smtp");
        final String port = emailMap.get("Port");
        final String email = emailMap.get("Email");
        final String emailName = emailMap.get("EmailName");
        final String userName = emailMap.get("UserName");
        final String password = emailMap.get("Password");
        final MailConfig mc = new MailConfig(smtp, port, email, emailName, userName, password);
        return mc;
    }
    
    public static boolean send(final MailConfig mc, final MailTemplate mailTemplate, final String subject) {
        return mailTemplate != null && StringUtils.isNotBlank((CharSequence)subject) && sendProcess(mc, mailTemplate.getToMail(), mailTemplate.getCcMail(), mailTemplate.getBccMail(), subject, mailTemplate.toString(), mailTemplate.getFileList());
    }
    
    public static boolean send(final MailConfig mc, final String toMail, final String subject, final String content) {
        return sendProcess(mc, toMail, null, null, subject, content, null);
    }
    
    public static boolean send(final MailConfig mc, final String toMail, final String subject, final String content, final String... files) {
        return sendProcess(mc, toMail, null, null, subject, content, Arrays.asList(files));
    }
    
    public static boolean send(final MailConfig mc, final String toMail, final String subject, final String content, final List<String> files) {
        return sendProcess(mc, toMail, null, null, subject, content, files);
    }
    
    public static boolean sendAndCc(final MailConfig mc, final String toMail, final String ccMail, final String bccMail, final String subject, final String content) {
        return sendProcess(mc, toMail, ccMail, bccMail, subject, content, null);
    }
    
    public static boolean sendAndCc(final MailConfig mc, final String toMail, final String ccMail, final String bccMail, final String subject, final String content, final String... files) {
        return sendProcess(mc, toMail, ccMail, bccMail, subject, content, Arrays.asList(files));
    }
    
    public static boolean sendAndCc(final MailConfig mc, final String toMail, final String ccMail, final String bccMail, final String subject, final String content, final List<String> files) {
        return sendProcess(mc, toMail, ccMail, bccMail, subject, content, files);
    }
    
    public static boolean sendProcess(final MailConfig mc, final String toMailList, final String ccAdress, final String bccAdress, final String subject, final String content, final List<String> fileList) {
        try {
            final EmailHandle emailHandle = new EmailHandle(mc.getSmtp(), mc.getPort());
            emailHandle.setFrom(mc.getEmail(), mc.getEmailName());
            emailHandle.setNeedAuth(true);
            emailHandle.setSubject(subject);
            emailHandle.setBody(content);
            emailHandle.setToList(toMailList);
            if (StringUtils.isNotEmpty((CharSequence)ccAdress)) {
                emailHandle.setCopyToList(ccAdress);
            }
            if (StringUtils.isNotEmpty((CharSequence)bccAdress)) {
                emailHandle.setBlindCopyToList(bccAdress);
            }
            emailHandle.setNamePass(mc.getUserName(), mc.getPassword());
            if (fileList != null && fileList.size() > 0) {
                for (final String file : fileList) {
                    emailHandle.addFileAffix(file);
                }
            }
            return emailHandle.sendEmail();
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static void asynSend(final MailConfig mc, final MailTemplate mailTemplate, final String subject) {
        if (mailTemplate != null && StringUtils.isNotBlank((CharSequence)subject)) {
            asynSend(mc, mailTemplate.getToMail(), mailTemplate.getCcMail(), mailTemplate.getBccMail(), subject, mailTemplate.toString(), mailTemplate.getFileList());
        }
    }
    
    public static void asynSend(final MailConfig mc, final String toMail, final String subject, final String content) {
        asynSend(mc, toMail, null, null, subject, content, null);
    }
    
    public static void asynSendAndCc(final MailConfig mc, final String toMail, final String ccMail, final String subject, final String content) {
        asynSend(mc, toMail, ccMail, null, subject, content, null);
    }
    
    public static void asynSend(final MailConfig mc, final String toMail, final String subject, final String content, final String... files) {
        asynSend(mc, toMail, null, null, subject, content, Arrays.asList(files));
    }
    
    public static void asynSend(final MailConfig mc, final String toMail, final String subject, final String content, final List<String> files) {
        asynSend(mc, toMail, null, null, subject, content, files);
    }
    
    public static void asynSendAndCc(final MailConfig mc, final String toMail, final String ccMail, final String bccMail, final String subject, final String content, final String... files) {
        asynSend(mc, toMail, ccMail, bccMail, subject, content, Arrays.asList(files));
    }
    
    public static void asynSendAndCc(final MailConfig mc, final String toMail, final String ccMail, final String bccMail, final String subject, final String content, final List<String> files) {
        asynSend(mc, toMail, ccMail, bccMail, subject, content, files);
    }
    
    public static boolean asynSend(final MailConfig mc, final String toAddress, final String ccAdress, final String bccAdress, final String subject, final String content, final List<String> fileList) {
        Boolean flag = Boolean.FALSE;
        FutureTask<Boolean> futureTask = null;
        final ExecutorService excutorService = Executors.newCachedThreadPool();
        futureTask = new FutureTask<Boolean>(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                final EmailHandle emailHandle = new EmailHandle(mc.getSmtp(), mc.getPort());
                emailHandle.setFrom(mc.getEmail(), mc.getEmailName());
                emailHandle.setNeedAuth(true);
                emailHandle.setSubject(subject);
                emailHandle.setBody(content);
                emailHandle.setToList(toAddress);
                if (StringUtils.isNotEmpty((CharSequence)ccAdress)) {
                    emailHandle.setCopyToList(ccAdress);
                }
                if (StringUtils.isNotEmpty((CharSequence)bccAdress)) {
                    emailHandle.setBlindCopyToList(bccAdress);
                }
                emailHandle.setNamePass(mc.getUserName(), mc.getPassword());
                if (fileList != null && fileList.size() > 0) {
                    for (final String file : fileList) {
                        emailHandle.addFileAffix(file);
                    }
                }
                return emailHandle.sendEmail();
            }
        });
        excutorService.submit(futureTask);
        try {
            flag = futureTask.get(5L, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            futureTask.cancel(true);
            e.printStackTrace();
        }
        catch (ExecutionException e2) {
            futureTask.cancel(true);
            e2.printStackTrace();
        }
        catch (TimeoutException e3) {
            futureTask.cancel(true);
            e3.printStackTrace();
        }
        finally {
            excutorService.shutdown();
        }
        excutorService.shutdown();
        return flag;
    }
}
