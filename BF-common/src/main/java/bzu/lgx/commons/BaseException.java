package bzu.lgx.commons;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 15:04
 * @Description:
 */
@ControllerAdvice
public class BaseException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        System.out.println("====================== BaseException ===============");
        return new Result(false, StatusCode.ERROR, e.getMessage());
    }
}
