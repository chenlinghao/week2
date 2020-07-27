package com.clh.controller;

import com.clh.bean.Meet;
import com.clh.service.MeetService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Format;
import java.util.Date;
import java.util.List;

@Controller
public class MeetController {
    @Resource
    private MeetService meetService;
    @RequestMapping("list")
    public String list(Model model, @RequestParam(defaultValue = "1")Integer cpage){
        PageHelper.startPage(cpage,3);
        List list = meetService.list();
        PageInfo pageInfo = new PageInfo(list);
        model.addAttribute("p",pageInfo);
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("listType")
    @ResponseBody
    public Object listType(){
        List list = meetService.listType();
        System.out.println(list);
        return list;
    }
    @RequestMapping("add")
    public String add(Meet meet){

//
//        Date date = new Date();


        int a =  meetService.add(meet);
        return "redirect:list";
    }

    @RequestMapping("toXiu")
    public String toXiu(Integer id){
        return "xiu";
    }

    @RequestMapping("listOne")
    @ResponseBody
    public Object listOne(Integer id){
        List list = meetService.listOne(id);
        return list;
    }

    @RequestMapping("xiu")
    public String xiu(Meet meet){
        int a =  meetService.xiu(meet);
        return "redirect:list";
    }
}
