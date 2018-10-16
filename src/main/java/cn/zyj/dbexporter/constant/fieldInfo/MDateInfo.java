package cn.zyj.dbexporter.constant.fieldInfo;

import cn.zyj.dbexporter.constant.TableFieldInfoBySample;
import cn.zyj.dbexporter.constant.ToTextPurpose;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import static cn.zyj.dbexporter.jooq.db_calculator.Tables.T_RESOURCE;

public class MDateInfo extends TableFieldInfoBySample<Timestamp> {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public MDateInfo() {
        super(T_RESOURCE.MDATE);
    }

    @Override
    public String getNameText() {
        return "最后更新日期";
    }

    @Override
    public String getValueText(Timestamp value, ToTextPurpose purpose) {
        if (value == null) return "";
        return sdf.format(value.getTime());
    }


}
