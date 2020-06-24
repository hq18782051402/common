package practice.sipserver.common.socketio;

/**
 * Created by 金隧 on 2019/5/15.
 */
public class ResponseParam {
    private String code; // code 是每次请求的路由依据
    private Object body ; // body 是每次请求的参数，json格式
    private Integer status;  // // 处理结果标志，列举见下文
    private Integer timestamp ;// 回复发起时间戳，毫秒
    private String nonestr; // 随机字符串，用于标识不同批次的请求
    private String extra;  // 扩展字段，可以留空

    private String session ;//websocket sessionID；

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonestr() {
        return nonestr;
    }

    public void setNonestr(String nonestr) {
        this.nonestr = nonestr;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

}
