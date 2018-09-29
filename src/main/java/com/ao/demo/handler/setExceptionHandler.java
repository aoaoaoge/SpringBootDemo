package com.ao.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class setExceptionHandler {

    @ExceptionHandler
    @ResponseBody
    public Map<String,Object> putOutErrorMessage(HttpServletRequest req,Exception e){
        Map<String,Object> errorMap = new HashMap<>();
        errorMap.put("falg",false);
        errorMap.put("message",e.getMessage());
        return  errorMap;
    }
}
