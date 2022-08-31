package com.hpvn.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "IMAGE_DATA")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IMAGE_DATE_SEQ")
    @SequenceGenerator(sequenceName = "IMAGE_DATA_SEQ", allocationSize = 1, name = "IMAGE_DATA_SEQ")
    private Long id;
    private String name;
    private String type;
    @Lob
    @Column(name = "IMAGE_DATA", length = 1000)
    private byte[] imageData;
}
