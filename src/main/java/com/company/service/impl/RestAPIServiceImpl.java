package com.company.service.impl;

import com.company.service.RestAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestAPIServiceImpl implements RestAPIService {


    @Override
    public String getJsonData() {
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", String.class);
        return response;
    }
}
