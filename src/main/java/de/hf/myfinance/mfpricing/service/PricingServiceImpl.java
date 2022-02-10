package de.hf.myfinance.mfpricing.service;

import de.hf.myfinance.restapi.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import de.hf.framework.utils.ServiceUtil;

@RestController
public class PricingServiceImpl implements PricingService {
    ServiceUtil serviceUtil;

    @Autowired
    public PricingServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public String index() {
        return "Hello my PricingService";
    }

}