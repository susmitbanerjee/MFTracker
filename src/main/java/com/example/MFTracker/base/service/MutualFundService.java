package com.example.MFTracker.base.service;

import com.example.MFTracker.base.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface MutualFundService {

    public void addMutualFund(User user, double sipAmount);
}
