package org.example.entity;

import lombok.Data;

@Data
public class DataEntity {

    // "data":{"mid":588278127,"following":15,"whisper":0,"black":0,"follower":2398022}

    private Integer mid;

    private Integer following;

    private Integer whisper;

    private Integer black;

    // 关注数(粉丝数)
    private Integer follower;
}
