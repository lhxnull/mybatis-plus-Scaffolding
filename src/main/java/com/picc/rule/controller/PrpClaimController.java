package com.picc.rule.controller;

import com.picc.common.entity.FebsResponse;
import com.picc.rule.entity.PrpClaimInfo;
import com.picc.rule.service.IPrpclaimService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
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

    /**
     * mybatisplus方式查询
     * @param id
     * @return
     */
    @GetMapping("list")
    public FebsResponse loginLogList(@RequestParam String id) {
        PrpClaimInfo prpClaimInfo  = iPrpclaimService.findbyId("17f1bc4e-28dc-4c0e-ae4a-2f790ace5b34");
//        PrpClaimInfo prpClaimInfo  = iPrpclaimService.getById("17f1bc4e-28dc-4c0e-ae4a-2f790ace5b34");

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        return new FebsResponse().success().data(prpClaimInfo);
    }

    /**
     * 通过mapper方式查询
     * @param id
     * @return
     */
    @GetMapping("list2")
    public FebsResponse loginLogList2(@RequestParam String id) {
        PrpClaimInfo prpClaimInfo  = iPrpclaimService.findbyMapperId("17f1bc4e-28dc-4c0e-ae4a-2f790ace5b34");
        return new FebsResponse().success().data(prpClaimInfo);
    }


}
