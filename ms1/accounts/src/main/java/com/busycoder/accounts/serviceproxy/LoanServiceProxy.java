package com.busycoder.accounts.serviceproxy;

import com.busycoder.accounts.dto.LoanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//@FeignClient(name = "loan-service", url = "http://localhost:8090")
@FeignClient("LOAN")
public interface LoanServiceProxy {
    @GetMapping(path = "api/fetch")
    public LoanDto getByMobile(@RequestParam(name="mobile") String mobile);
}
