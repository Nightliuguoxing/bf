package edu.lgx.auths.utils;

import java.io.IOException;

import bzu.lgx.commons.Result;
import bzu.lgx.commons.StatusCode;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-01-28 20:07
 * @Description:
 */
public class HttpUtils {

    /**
     * @Author: LGX-LUCIFER
     * @Date: 2022-01-28 20:08
     * @Return: javax.servlet.http.HttpServletRequest
     * @Description: 获取HttpServletRequest对象
     */
    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * @Author: LGX-LUCIFER
     * @Date: 2022-01-28 20:08
     * @Params: response
     * @Params: data
     * @Return: void
     * @Description: 输出信息到浏览器
     */
    public static void write(HttpServletResponse response, Object data) throws IOException {
        response.setContentType("application/json; charset=utf-8");
        String json = JSONObject.toJSONString(new Result(true, StatusCode.SUCCESS, "SUCCESS", data));
        response.getWriter().print(json);
        response.getWriter().flush();
        response.getWriter().close();
    }
}
