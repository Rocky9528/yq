package org.lanqiao.weixin.common.entity.qrcode;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
public class TempCode {
    //{"expire_seconds": 604800, "action_name": "QR_STR_SCENE", "action_info": {"scene": {"scene_str": "test"}}}
    public  static final String QR_STR_SCENE = "QR_STR_SCENE";
    public  static final String QR_SCENE = "QR_SCENE";
    private int expire_seconds;
    private String action_name = "QR_STR_SCENE";
    private ActionInfo action_info;
}
