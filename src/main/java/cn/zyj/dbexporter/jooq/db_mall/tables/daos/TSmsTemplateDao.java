/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TSmsTemplate;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TSmsTemplateRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class TSmsTemplateDao extends DAOImpl<TSmsTemplateRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsTemplate, Integer> {

    /**
     * Create a new TSmsTemplateDao without any configuration
     */
    public TSmsTemplateDao() {
        super(TSmsTemplate.T_SMS_TEMPLATE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsTemplate.class);
    }

    /**
     * Create a new TSmsTemplateDao with an attached configuration
     */
    public TSmsTemplateDao(Configuration configuration) {
        super(TSmsTemplate.T_SMS_TEMPLATE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsTemplate.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsTemplate object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsTemplate> fetchById(Integer... values) {
        return fetch(TSmsTemplate.T_SMS_TEMPLATE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsTemplate fetchOneById(Integer value) {
        return fetchOne(TSmsTemplate.T_SMS_TEMPLATE.ID, value);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsTemplate> fetchByContent(String... values) {
        return fetch(TSmsTemplate.T_SMS_TEMPLATE.CONTENT, values);
    }

    /**
     * Fetch records that have <code>enable IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsTemplate> fetchByEnable(Boolean... values) {
        return fetch(TSmsTemplate.T_SMS_TEMPLATE.ENABLE, values);
    }
}
