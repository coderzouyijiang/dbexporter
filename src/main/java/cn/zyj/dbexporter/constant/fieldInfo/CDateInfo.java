package cn.zyj.dbexporter.constant.fieldInfo;

import cn.zyj.dbexporter.constant.TableFieldInfoBySample;
import cn.zyj.dbexporter.constant.ToTextPurpose;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import static cn.zyj.dbexporter.jooq.Tables.*;

public class CDateInfo extends TableFieldInfoBySample<Timestamp> {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public CDateInfo() {
        super(T_RESOURCE.CDATE);
    }

    @Override
    public String getNameText() {
        return "创建日期";
    }

    @Override
    public String getValueText(Timestamp value, ToTextPurpose purpose) {
        if (value == null) return "";
        return sdf.format(value.getTime());
    }


}
