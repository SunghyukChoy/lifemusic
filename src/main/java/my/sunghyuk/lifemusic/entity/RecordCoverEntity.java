package my.sunghyuk.lifemusic.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import my.sunghyuk.lifemusic.domain.Record;
import my.sunghyuk.lifemusic.entity.enums.RecordCoverSizeType;

@Getter
public class RecordCoverEntity {
    private long id;
    private Record record;
    private RecordCoverSizeType sizeType;
    private ImageFormat imageFormat;
    private byte[] cover;
    private long createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;
}