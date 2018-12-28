package cn.zyj.dbexporter.model;

import java.io.Serializable;

/**
 * 商城应答类
 *
 * @author cychen
 */
public class MallResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 应答编码
     */
    private Integer code = 0;
    /**
     * 应答消息
     */
    private String message = null;
    /**
     * 应答数据
     */
    private T data = null;

    public MallResponse() {
    }

    public MallResponse(Integer code, String message) {
        setCode(code);
        setMessage(message);
    }

    public MallResponse(MallResponse response) {
        this(response.getCode(), response.getMessage());
    }

    public MallResponse(T data) {
        setData(data);
    }

    /**
     * 获取应答编码
     *
     * @return 应答编码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置应答编码
     *
     * @param code 应答编码
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取应答消息
     *
     * @return 应答消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置应答消息
     *
     * @param message 应答消息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取应答数据
     *
     * @return 应答数据
     */
    public T getData() {
        return data;
    }

    /**
     * 设置应答数据
     *
     * @param data 应答数据
     */
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "response{" +
                "code=" + code +
                ", message=" + message +
                '}';
    }
    
}
