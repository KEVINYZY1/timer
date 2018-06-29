package com.jun.timer.service;


import com.jun.timer.dto.JobDto;
import com.jun.timer.dto.Page;
import com.jun.timer.utils.HttpResult;

/**
 * Created by xunaiyang on 2017/9/21.
 */
public interface JobService {
    HttpResult createJob(String tenantId, JobDto jobDto);

    HttpResult deleteJob(String tenantId, String jobId);

    HttpResult modifyJobTime(String tenantId, String jobId, String cron);

    HttpResult modifyJob(String tenantId, JobDto jobDto);

    HttpResult queryJob(String tenantId, Page page, String jobOwner);

    HttpResult pauseJob(String tenantId, String jobId);

    HttpResult resumeJob(String tenantId, String jobId);

    HttpResult triggerJob(String tenantId, String jobId);
}
