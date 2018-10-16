/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.Tickets;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TicketsRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
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
public class TicketsDao extends DAOImpl<TicketsRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets, Integer> {

    /**
     * Create a new TicketsDao without any configuration
     */
    public TicketsDao() {
        super(Tickets.TICKETS, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets.class);
    }

    /**
     * Create a new TicketsDao with an attached configuration
     */
    public TicketsDao(Configuration configuration) {
        super(Tickets.TICKETS, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchById(Integer... values) {
        return fetch(Tickets.TICKETS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets fetchOneById(Integer value) {
        return fetchOne(Tickets.TICKETS.ID, value);
    }

    /**
     * Fetch records that have <code>ticketid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByTicketid(String... values) {
        return fetch(Tickets.TICKETS.TICKETID, values);
    }

    /**
     * Fetch records that have <code>orderid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByOrderid(String... values) {
        return fetch(Tickets.TICKETS.ORDERID, values);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByOid(Integer... values) {
        return fetch(Tickets.TICKETS.OID, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByType(Byte... values) {
        return fetch(Tickets.TICKETS.TYPE, values);
    }

    /**
     * Fetch records that have <code>amounts IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByAmounts(BigDecimal... values) {
        return fetch(Tickets.TICKETS.AMOUNTS, values);
    }

    /**
     * Fetch records that have <code>payed IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByPayed(Boolean... values) {
        return fetch(Tickets.TICKETS.PAYED, values);
    }

    /**
     * Fetch records that have <code>actiontime IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByActiontime(Timestamp... values) {
        return fetch(Tickets.TICKETS.ACTIONTIME, values);
    }

    /**
     * Fetch records that have <code>oper IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByOper(Byte... values) {
        return fetch(Tickets.TICKETS.OPER, values);
    }

    /**
     * Fetch records that have <code>operid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByOperid(Integer... values) {
        return fetch(Tickets.TICKETS.OPERID, values);
    }

    /**
     * Fetch records that have <code>payment IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByPayment(Byte... values) {
        return fetch(Tickets.TICKETS.PAYMENT, values);
    }

    /**
     * Fetch records that have <code>note IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByNote(String... values) {
        return fetch(Tickets.TICKETS.NOTE, values);
    }

    /**
     * Fetch records that have <code>opername IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByOpername(String... values) {
        return fetch(Tickets.TICKETS.OPERNAME, values);
    }

    /**
     * Fetch records that have <code>month IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByMonth(Integer... values) {
        return fetch(Tickets.TICKETS.MONTH, values);
    }

    /**
     * Fetch records that have <code>paydate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByPaydate(Date... values) {
        return fetch(Tickets.TICKETS.PAYDATE, values);
    }

    /**
     * Fetch records that have <code>acpaydate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByAcpaydate(Date... values) {
        return fetch(Tickets.TICKETS.ACPAYDATE, values);
    }

    /**
     * Fetch records that have <code>paybyfrozen IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.Tickets> fetchByPaybyfrozen(Byte... values) {
        return fetch(Tickets.TICKETS.PAYBYFROZEN, values);
    }
}
