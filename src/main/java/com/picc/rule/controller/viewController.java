package com.picc.rule.controller;

import com.picc.common.utils.FebsUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/11/3.
 */
@Controller
@RequestMapping("/febs")
public class viewController {

    @RequestMapping("/views")
    public String add() {
        return FebsUtil.view("add");
    }
}
