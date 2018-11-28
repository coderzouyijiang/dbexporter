package cn.zyj.dbexporter.model;

import java.io.Serializable;
import java.util.List;

/**
 * 数据环 分页数据
 */
public class SoPageData<T extends Serializable> implements Serializable {

    private SoPageInfo pageInfo;

    private List<T> items;

    public SoPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(SoPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "SoPageData{" +
                "pageInfo=" + pageInfo +
                ", items=" + items +
                '}';
    }
}
