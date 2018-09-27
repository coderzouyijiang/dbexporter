package cn.zyj.dbexporter;

import lombok.extern.slf4j.Slf4j;
import org.jooq.ExecuteContext;
import org.jooq.impl.DefaultExecuteListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SqlExcuteListener extends DefaultExecuteListener {

    @Override
    public void executeStart(ExecuteContext ctx) {
        log.info("sql:{}",ctx.sql());
    }

    @Override
    public void executeEnd(ExecuteContext ctx) {
        log.info("result:{}",ctx.result());

    }
}
