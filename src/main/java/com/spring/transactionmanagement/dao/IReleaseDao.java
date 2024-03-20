package com.spring.transactionmanagement.dao;

import com.spring.transactionmanagement.model.Release;

public interface IReleaseDao {
    void addRelease(Release release);

    Release getReleaseId(int releaseId);
}
