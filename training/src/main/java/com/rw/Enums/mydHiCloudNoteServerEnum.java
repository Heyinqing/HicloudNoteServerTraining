package com.rw.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum mydHiCloudNoteServerEnum {

    //验证码
    AUTHCODE(1,"authCode"),
    //投诉建议
    COMPLAINT(2,"complaint"),
    //表扬
    PRAISE(3,"praise")
    ;

    private final Integer code;
    private final String massage;

    public static String getMassage(Integer code){
        //获取所以枚举实例
        mydHiCloudNoteServerEnum[] values = values();
        //遍历枚举
        for (mydHiCloudNoteServerEnum mydHiCloudNoteServerEnum:values) {
            //判断是否存在
            if (mydHiCloudNoteServerEnum.code.equals(code)){
                return mydHiCloudNoteServerEnum.massage;
            }
        }
        return null;
    }


}
