package com.adozgen.learnjava.beans.component;

import crm.services.CrmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherService {
    private final CrmService crmService;

    @Autowired
    public OtherService(CrmService crmService) {
        this.crmService = crmService;
    }
}
