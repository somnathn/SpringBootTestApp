package org.demo.upload.entity;

import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName(value = "file")
public class FileDTO {

	private Long id;
	private Long size;
	private String filename;
	private String mimeType;

	public FileDTO(String filename, String mimeType) {

		this.filename = filename;
		this.mimeType = mimeType;
	}

	public FileDTO() {
		// Default Constructor
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
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
