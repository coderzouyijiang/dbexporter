/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProductMajorOtherParam implements Serializable {

    private static final long serialVersionUID = -1450518111;

    private Integer id;
    private String  memoryCapacity;
    private String  diskCapacity;
    private String  diskType;
    private String  graphicsCardModel;
    private String  graphicsCardType;
    private String  graphicsCardCapacity;

    public TProductMajorOtherParam() {}

    public TProductMajorOtherParam(TProductMajorOtherParam value) {
        this.id = value.id;
        this.memoryCapacity = value.memoryCapacity;
        this.diskCapacity = value.diskCapacity;
        this.diskType = value.diskType;
        this.graphicsCardModel = value.graphicsCardModel;
        this.graphicsCardType = value.graphicsCardType;
        this.graphicsCardCapacity = value.graphicsCardCapacity;
    }

    public TProductMajorOtherParam(
        Integer id,
        String  memoryCapacity,
        String  diskCapacity,
        String  diskType,
        String  graphicsCardModel,
        String  graphicsCardType,
        String  graphicsCardCapacity
    ) {
        this.id = id;
        this.memoryCapacity = memoryCapacity;
        this.diskCapacity = diskCapacity;
        this.diskType = diskType;
        this.graphicsCardModel = graphicsCardModel;
        this.graphicsCardType = graphicsCardType;
        this.graphicsCardCapacity = graphicsCardCapacity;
    }

    @NotNull
    public Integer getId() {
        return this.id;
    }

    public TProductMajorOtherParam setId(Integer id) {
        this.id = id;
        return this;
    }

    @Size(max = 255)
    public String getMemoryCapacity() {
        return this.memoryCapacity;
    }

    public TProductMajorOtherParam setMemoryCapacity(String memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }

    @Size(max = 255)
    public String getDiskCapacity() {
        return this.diskCapacity;
    }

    public TProductMajorOtherParam setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
        return this;
    }

    @Size(max = 255)
    public String getDiskType() {
        return this.diskType;
    }

    public TProductMajorOtherParam setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    @Size(max = 255)
    public String getGraphicsCardModel() {
        return this.graphicsCardModel;
    }

    public TProductMajorOtherParam setGraphicsCardModel(String graphicsCardModel) {
        this.graphicsCardModel = graphicsCardModel;
        return this;
    }

    @Size(max = 255)
    public String getGraphicsCardType() {
        return this.graphicsCardType;
    }

    public TProductMajorOtherParam setGraphicsCardType(String graphicsCardType) {
        this.graphicsCardType = graphicsCardType;
        return this;
    }

    @Size(max = 255)
    public String getGraphicsCardCapacity() {
        return this.graphicsCardCapacity;
    }

    public TProductMajorOtherParam setGraphicsCardCapacity(String graphicsCardCapacity) {
        this.graphicsCardCapacity = graphicsCardCapacity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TProductMajorOtherParam (");

        sb.append(id);
        sb.append(", ").append(memoryCapacity);
        sb.append(", ").append(diskCapacity);
        sb.append(", ").append(diskType);
        sb.append(", ").append(graphicsCardModel);
        sb.append(", ").append(graphicsCardType);
        sb.append(", ").append(graphicsCardCapacity);

        sb.append(")");
        return sb.toString();
    }
}
