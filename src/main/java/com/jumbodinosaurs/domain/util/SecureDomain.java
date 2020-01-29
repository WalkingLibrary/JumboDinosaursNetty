package com.jumbodinosaurs.domain.util;

import java.io.File;

public class SecureDomain extends UpdatableDomain
{
    private String certificatePassword;
    private transient File certificateFile;
    
    public SecureDomain(String domain, String username, String password)
    {
        super(domain, username, password);
    }
    
    public String getCertificatePassword()
    {
        return certificatePassword;
    }
    
    public void setCertificatePassword(String certificatePassword)
    {
        this.certificatePassword = certificatePassword;
    }
    
    public File getCertificateFile()
    {
        return certificateFile;
    }
    
    public void setCertificateFile(File certificateFile)
    {
        this.certificateFile = certificateFile;
    }
}
