package com.example.MFTracker.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MFTrackerController {

    @RequestMapping("/api/mutual-funds")
    public class MutualFundController {
        //@Autowired
        //private MutualFundRepository mutualFundRepository;

        // Implement CRUD endpoints
    }

    @RequestMapping("/api/folios")
    public class FolioController {
        //@Autowired
        //private FolioRepository folioRepository;

        // Implement CRUD endpoints
    }
}
