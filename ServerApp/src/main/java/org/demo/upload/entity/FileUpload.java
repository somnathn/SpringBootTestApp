package org.demo.upload.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class FileUpload {

	   @Id @GeneratedValue(strategy=GenerationType.TABLE)
	   private Long id;
	   
	   private String filename;

	   @Lob
	   private byte[] file;

	   private String mimeType;

	   private Long size;
	
    public FileUpload(String filename, byte[] file, String mimeType,Long size) {

        this.file = file;
        this.filename = filename;
        this.mimeType = mimeType;
        this.size = size;
    }

    public FileUpload() {
        // Default Constructor
    }

 

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}
    
    
}
