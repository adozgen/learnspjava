package com.adozgen.learnjava.beans.conditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileProcessorService {
    private final FileService fileService;

    @Autowired
    public FileProcessorService(FileService fileService) {
        this.fileService = fileService;
    }
}
