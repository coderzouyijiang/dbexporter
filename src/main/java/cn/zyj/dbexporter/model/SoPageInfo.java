package cn.zyj.dbexporter.model;

import java.io.Serializable;

/**
 * 数据环 分页数据
 */
public class SoPageInfo implements Serializable {

    private Integer total;
    private Integer size;
    private Integer totalPage;
    private Integer page;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "SoPageInfo{" +
                "total=" + total +
                ", size=" + size +
                ", totalPage=" + totalPage +
                ", page=" + page +
                '}';
    }
}
