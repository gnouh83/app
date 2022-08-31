package com.hpvn.app.repository;

import com.hpvn.app.entity.FileData;
import com.hpvn.app.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData,Long> {
    Optional<FileData> findByName(String fileName);
}
