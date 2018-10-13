package cn.zyj.dbexporter.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class JsonUtil {

    @Autowired
    private ObjectMapper objectMapper;

    public String toString(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("toJson:" + obj, e);
            throw new RuntimeException("toJson:" + obj, e);
        }
    }
}
