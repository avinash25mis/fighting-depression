package com.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DayContentDto {

    public DayContentDto() {
    }

    public DayContentDto(Long id, Integer day, String time, String title, String message, String genre1, String genre2, String link, Boolean download, Long docId, String name) {
        this.id = id;
        this.day = day;
        this.time = time;
        this.title = title;
        this.message = message;
        this.genre1 = genre1;
        this.genre2 = genre2;
        this.link = link;
        this.download = download;
        this.docId = docId;
        this.name = name;
    }

    private Long id;
    private Integer day;
    private String time;
    private String title;
    private String message;
    private String genre1;
    private String genre2;
    private String link;
    private Boolean download;
    private Long docId;
    private String name;
}
