package com.example.MFTracker.base.entity;

import com.example.MFTracker.base.enums.Depository;
import com.example.MFTracker.base.enums.Genders;
import com.example.MFTracker.base.enums.MaritalStatus;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class User {
    @Id
    private String id;
    private String name;
    private Date dateOfBirth;
    private long mobileNumber;
    private String email;
    private String panNumber;
    private MaritalStatus maritalStatus;
    private Genders gender;
    private long uniqueUserCode;
    private long dematAccountNumber;
    private long dpID;
    private String depositoryParticipant;
    private Depository depository;
    private String[] tradingPreferences;
    private NomineeDetails nomineeDetails;
    private AccountOpeningForm accountOpeningForm;
    private List<MutualFund> mutualFunds;

}
