package cn.zyj.dbexporter;

import cn.zyj.dbexporter.jooq.db_mall.tables.TProductList;
import cn.zyj.dbexporter.jooq.db_mall.tables.TProductRentType;
import cn.zyj.dbexporter.jooq.db_mall.tables.TProductRentTypeDetail;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TProductRentTypeRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DbexporterApplication.class})
public class AdjustPriceTest {

    @Autowired
    DSLContext dsl;

    @Test
    public void test() throws Throwable {

        TProductRentType prt = new TProductRentType("prt");
        TProductRentTypeDetail t1 = new TProductRentTypeDetail("t1");
        TProductList pl = new TProductList("pl");

        int size = querySkuStandPrice().size();
        log.info("querySkuStandPrice:" + size);
    }

    public Result<TProductRentTypeRecord> querySkuStandPrice() {
        TProductRentType prt = new TProductRentType("prt");
        TProductRentTypeDetail t1 = new TProductRentTypeDetail("t1");
        TProductList pl = new TProductList("pl");

        return dsl.select(prt.fields())
                .from(t1)
                .join(prt)
                .on(prt.ID.eq(t1.RENT_TYPE_ID)
                        .and(prt.TOTAL_MONTH.greaterOrEqual(t1.END_MONTH))
                        .and(prt.STATUS.eq(Byte.valueOf("0")))
                )
                .join(pl)
                .on(pl.ID.eq(prt.PRODUCT_ID)
                        .and(pl.STATUS.eq(Byte.valueOf("0")))
                        .and(pl.CONDITION.notEqual(Byte.valueOf("1")))
                        .and(pl.IS_SEARCH.eq(Byte.valueOf("1")))
                        .and(pl.CHECK_STATUS.eq(Byte.valueOf("1")))
                        .and(pl.CATEGORY_ID.in(77, 86, 84, 76, 130, 83))
                )
                .where(t1.RENT_TYPE.eq(Byte.valueOf("1"))
                        .and(t1.START_MONTH.eq((short) 1))
                        .and(t1.STATUS.eq(Byte.valueOf("0")))
                )
                .fetch()
                .into(prt);
    }

}
