package cn.net.yunzan.reslut;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author yp
 * @since 2022/11/19
 **/
@Builder
@Getter
@ToString
public class FailInfo extends ResultInfo {
    protected static final Integer DEFAULT_CODE = 50000;
    protected static final String DEFAULT_MESSAGE = "操作失败";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String exception;

    protected FailInfo(String exception) {
        super(false, DEFAULT_CODE, DEFAULT_MESSAGE);
        this.exception = exception;
    }

    public FailInfo(Integer code, String exception) {
        super(false, code, DEFAULT_MESSAGE);
        this.exception = exception;
    }
}

