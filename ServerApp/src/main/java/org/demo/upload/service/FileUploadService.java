package org.demo.upload.service;

import java.util.ArrayList;
import java.util.List;

import org.demo.upload.entity.FileDTO;
import org.demo.upload.entity.FileUpload;
import org.demo.upload.repository.FileUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileUploadService {

    @Autowired
    FileUploadRepository fileUploadRepository;

    // Retrieve file
    public FileUpload findByFilename(String filename) {
        return fileUploadRepository.findByFilename(filename);
    }

    // Retrieve file
    public List<FileDTO> listFiles() {
    	
    	
       List<FileDTO> lFilesDTO = new ArrayList<FileDTO>();
       List<FileUpload> lFiles = fileUploadRepository.findAll();
       
       if(lFiles!= null) {
       for (FileUpload fileUpload : lFiles) {
    	   
    	   FileDTO lFileDTO = new FileDTO();
    	   lFileDTO.setId(fileUpload.getId());
    	   lFileDTO.setFilename(fileUpload.getFilename());
    	   lFileDTO.setMimeType(fileUpload.getMimeType());
    	   lFileDTO.setSize(fileUpload.getSize());
    	   lFilesDTO.add(lFileDTO);
	     }
       }
       
       return lFilesDTO;
       
    }
    
    // Upload the file
    public void uploadFile(FileUpload doc) {
        fileUploadRepository.saveAndFlush(doc);
    }
}
