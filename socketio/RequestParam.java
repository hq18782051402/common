package practice.sipserver.common.socketio;

import lombok.Data;

import java.io.Serializable;


@Data
public class RequestParam  implements Serializable {
    //请求code
    private String code;
    //请求参数
    private Object body; // body 是每次请求的参数，json格式
    private String token;  // token 是身份依据，md5字符串
    private Integer timestamp;// 请求发起时间戳，毫秒
    private String sign;   // 请求加密后的字符戳，此字段保留，后期用于高安全性场合
    private String nonestr; // 随机字符串，用于标识不同批次的请求
    private Object extra;  // 扩展字段，可以留空
    private String session;//websocket sessionID；
    private String permissionCode;//基本权限code
}
