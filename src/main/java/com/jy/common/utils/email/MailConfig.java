package com.jy.common.utils.email;

public class MailConfig
{
    private String smtp;
    private String port;
    private String email;
    private String emailName;
    private String userName;
    private String password;
    
    public MailConfig() {
    }
    
    public MailConfig(final String smtp, final String port, final String email, final String emailName, final String userName, final String password) {
        this.smtp = smtp;
        this.port = port;
        this.email = email;
        this.emailName = emailName;
        this.userName = userName;
        this.password = password;
    }
    
    public String getSmtp() {
        return this.smtp;
    }
    
    public void setSmtp(final String smtp) {
        this.smtp = smtp;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public String getEmailName() {
        return this.emailName;
    }
    
    public void setEmailName(final String emailName) {
        this.emailName = emailName;
    }
    
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(final String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public String getPort() {
        return this.port;
    }
    
    public void setPort(final String port) {
        this.port = port;
    }
}
