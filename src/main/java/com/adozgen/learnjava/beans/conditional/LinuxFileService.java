package com.adozgen.learnjava.beans.conditional;

public class LinuxFileService implements FileService{
    @Override
    public void processFile() {
        System.out.println("Processing Linux File");
    }
}
