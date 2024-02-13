package com.example.MFTracker.base.entity;

import com.example.MFTracker.base.enums.InvestmentType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class MutualFundInfo {
    private String name;
    private String risk;
    private String sector;
    private String capType;
    private float annualisedReturns;
    private float oneDayReturns;
    private float totalReturns;
    private double nav;
    private int rating;
    private int minSIPAmount;
    private double fundSize;
    private Holdings holdings;
    private float expenseRatio;
    private String exitLoad;
    private float stampDuty;
    private Date stampDutyStartDate;
    private String taxImplication;
    private FundManagement fundManagement;
    private InvestmentType investmentType;
}
