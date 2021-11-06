package com.huawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping(value="/some.do")
    public ModelAndView doSome(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg", "处理了some.do请求");
        mv.addObject("func", "执行了doSome方法");
        // 指定视图 [/webapp/WEB-INF/pages/show.jsp]
        // mv.setViewName("/WEB-INF/pages/show.jsp");
        // 配置了视图解析器之后
        mv.setViewName("show");
        return mv;
    }
}

