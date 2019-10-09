package com.picc.rule.controller;

import com.picc.common.entity.FebsResponse;
import com.picc.rule.entity.PrpClaimInfo;
import com.picc.rule.service.IPrpclaimService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/9/30.
 */
@Slf4j
@RestController
@RequestMapping("loginLog")
public class PrpClaimController {
    @Autowired
    private IPrpclaimService iPrpclaimService;

    @GetMapping("list")
    public FebsResponse loginLogList(@RequestParam String id) {
        PrpClaimInfo prpClaimInfo  = iPrpclaimService.findbyId("17f1bc4e-28dc-4c0e-ae4a-2f790ace5b34");
        return new FebsResponse().success().data(prpClaimInfo);
    }
}
