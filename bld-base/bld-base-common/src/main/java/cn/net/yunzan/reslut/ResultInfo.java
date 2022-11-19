package cn.net.yunzan.reslut;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.io.Serializable;

@Getter
public abstract class ResultInfo implements Serializable {

    protected Boolean result;
    protected Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected String message;
    
    protected ResultInfo(Boolean result, Integer code, String message) {
        this.result = result;
        this.code = code;
        this.message = message;
    }
}
