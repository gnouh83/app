package com.hpvn.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "FILE_DATA")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IMAGE_DATE_SEQ")
    @SequenceGenerator(sequenceName = "IMAGE_DATA_SEQ", allocationSize = 1, name = "IMAGE_DATA_SEQ")
    private Long id;
    private String name;
    private String type;
    private String filePath;
}
