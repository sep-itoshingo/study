package com.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.AppUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Created by shingo_ito on 2017/04/08.
 */
@Controller
@EnableAutoConfiguration
class TodayDispController {

    @RequestMapping("/today/")
    public String today(Model model) {
        model.addAttribute("date", AppUtil.getNow());
        model.addAttribute("timestamp", AppUtil.convertToTimestamp(AppUtil.getNow()));

        List<Integer> list = Arrays.asList(1,2,3,4);
        AppUtil.isContainsList(list, 1);
        return "today";
    }

}
