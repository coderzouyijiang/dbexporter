/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
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
public class AssetsDevice implements Serializable {

    private static final long serialVersionUID = -1451912586;

    private Long      id;
    private String    title;
    private Long      customerId;
    private Byte      status;
    private String    brand;
    private String    sn;
    private String    processor;
    private String    ram;
    private String    disk;
    private String    storeLocation;
    private Timestamp cdate;
    private Timestamp mdate;

    public AssetsDevice() {}

    public AssetsDevice(AssetsDevice value) {
        this.id = value.id;
        this.title = value.title;
        this.customerId = value.customerId;
        this.status = value.status;
        this.brand = value.brand;
        this.sn = value.sn;
        this.processor = value.processor;
        this.ram = value.ram;
        this.disk = value.disk;
        this.storeLocation = value.storeLocation;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public AssetsDevice(
        Long      id,
        String    title,
        Long      customerId,
        Byte      status,
        String    brand,
        String    sn,
        String    processor,
        String    ram,
        String    disk,
        String    storeLocation,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.title = title;
        this.customerId = customerId;
        this.status = status;
        this.brand = brand;
        this.sn = sn;
        this.processor = processor;
        this.ram = ram;
        this.disk = disk;
        this.storeLocation = storeLocation;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public AssetsDevice setId(Long id) {
        this.id = id;
        return this;
    }

    @Size(max = 100)
    public String getTitle() {
        return this.title;
    }

    public AssetsDevice setTitle(String title) {
        this.title = title;
        return this;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public AssetsDevice setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public AssetsDevice setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @Size(max = 20)
    public String getBrand() {
        return this.brand;
    }

    public AssetsDevice setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Size(max = 20)
    public String getSn() {
        return this.sn;
    }

    public AssetsDevice setSn(String sn) {
        this.sn = sn;
        return this;
    }

    @Size(max = 20)
    public String getProcessor() {
        return this.processor;
    }

    public AssetsDevice setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Size(max = 20)
    public String getRam() {
        return this.ram;
    }

    public AssetsDevice setRam(String ram) {
        this.ram = ram;
        return this;
    }

    @Size(max = 20)
    public String getDisk() {
        return this.disk;
    }

    public AssetsDevice setDisk(String disk) {
        this.disk = disk;
        return this;
    }

    @Size(max = 50)
    public String getStoreLocation() {
        return this.storeLocation;
    }

    public AssetsDevice setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public AssetsDevice setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public AssetsDevice setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AssetsDevice (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(customerId);
        sb.append(", ").append(status);
        sb.append(", ").append(brand);
        sb.append(", ").append(sn);
        sb.append(", ").append(processor);
        sb.append(", ").append(ram);
        sb.append(", ").append(disk);
        sb.append(", ").append(storeLocation);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
