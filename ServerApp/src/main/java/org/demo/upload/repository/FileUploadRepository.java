package org.demo.upload.repository;

import org.demo.upload.entity.FileUpload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository<FileUpload, Long> {
    FileUpload findByFilename(String filename);
}
