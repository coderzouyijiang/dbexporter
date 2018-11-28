package cn.zyj.dbexporter.model;

import java.io.Serializable;

/**
 * 数据环 分页 响应结果
 */
public class SoResponse<T extends Serializable> implements Serializable {
    private Integer code;
    private T data;
    private Boolean hasResult;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getHasResult() {
        return hasResult;
    }

    public void setHasResult(Boolean hasResult) {
        this.hasResult = hasResult;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SoResponse{" +
                "code=" + code +
                ", data=" + data +
                ", hasResult=" + hasResult +
                ", message='" + message + '\'' +
                '}';
    }
}
