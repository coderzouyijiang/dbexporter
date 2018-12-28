package cn.zyj.dbexporter.service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Data
@ToString
public class MailModel implements Serializable {

    private List<String> receivers = new ArrayList<>();
    private List<String> ccs = new ArrayList<>();

    private String deliver = "";
    private String subject = "";
    private String content = "";
    private String filename;
    //    private String file;
    private File file;
}
