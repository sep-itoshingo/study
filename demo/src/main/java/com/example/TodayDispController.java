package com.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by shingo_ito on 2017/04/08.
 */
@Controller
@EnableAutoConfiguration
class TodayDispController {

    @RequestMapping("/today/")
    public String today(Model model) {
        Date today = Calendar.getInstance().getTime();
        model.addAttribute("date", today);
        Timestamp timestamp = new Timestamp(today.getTime());
        model.addAttribute("timestamp", timestamp);

        return "today";
    }

}
