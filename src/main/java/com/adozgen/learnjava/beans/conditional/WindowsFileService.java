package com.adozgen.learnjava.beans.conditional;

public class WindowsFileService implements FileService {
    @Override
    public void processFile() {
        System.out.println("Windows File Service");
    }
}
