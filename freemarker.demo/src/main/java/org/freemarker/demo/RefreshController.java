package org.freemarker.demo;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Controller;

@Controller
public class RefreshController implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ServletContext context;

    /**
     * アプリ起動時の処理
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
        // TODO Auto-generated method stub

        context.setAttribute("ref", "refresh attr");
    }

}
