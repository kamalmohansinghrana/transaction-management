package com.spring.transactionmanagement.service;

import com.spring.transactionmanagement.model.Release;

public interface IReleaseService {
    Release getRelease(int releaseId);

    void addRelease(Release release);

    Release scheduleRelease(Release release);
}
