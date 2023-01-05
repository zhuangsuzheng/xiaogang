package org.example.entity;

import lombok.Data;

@Data
public class ResEntity {

// {"code":0,"message":"0","ttl":1}

   private Integer code;

   private String message;

   private String ttl;

   private DataEntity data;

}
