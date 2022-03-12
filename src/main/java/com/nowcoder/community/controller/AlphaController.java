package com.nowcoder.community.controller;

import com.nowcoder.community.server.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/alpha")
public class AlphaController {//给页面返回一个字符串的代码（直接利用页面的URL来访问该方法）
    @Autowired
    private AlphaService alphaService;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "I got you.";
    }

    @RequestMapping("/data")
    @ResponseBody
    public String getData(){
        return alphaService.getData();
    }

    @RequestMapping(path="/students",method= RequestMethod.GET)
    @ResponseBody
    public String getStudent(@RequestParam(name="current",required = false,defaultValue = "1")int current,
                             @RequestParam(name="limit",required = false,defaultValue = "1")int limit){
        System.out.println(current+"\n"+limit);
        return "20 students";
    }

    //假设当前是根据一个学生的编码来进行请求，并且在执行的过程中，请求路径中直接包含参数
    @RequestMapping(path="/student/{id}",method=RequestMethod.GET)
    @ResponseBody
    public String getSingleStudentById(@PathVariable("id")int id){
        System.out.print(id);
        return "ming";
    }

    //POST请求，进行数据的提交，需要用到网页，使用static当中的静态网页(template当中存放的是动态的内容)
    @RequestMapping(path="/student",method=RequestMethod.POST)
    @ResponseBody
    public String getStudentInfo(String name,String age){
        System.out.println(name);
        System.out.println(age);
        return "ming's info";
    }

    //返回HTML数据,第一种方法
    @RequestMapping(path="/teacher",method=RequestMethod.GET)
    public ModelAndView getTeacher(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("name","张三");
        mav.addObject("age",30);
        mav.setViewName("/demo/view");
        return mav;
    }

    //第二种方法
    @RequestMapping(path="/school",method=RequestMethod.GET)
    public String getSchool(Model model){
        model.addAttribute("name","东北大学");
        model.addAttribute("age",39);
        return "/demo/view";
    }

    //利用JSON数据来处理异步请求（网页不刷新的同时更新数据）
    @RequestMapping(path="/emp",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getEmp(){
        Map<String,Object> emp=new HashMap<>();
        emp.put("name","小易");
        emp.put("age",23);
        emp.put("salary",8000);
        return emp;
    }















}
