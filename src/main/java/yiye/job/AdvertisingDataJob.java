package yiye.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author lijunhao
 * @date 2018/06/28
 */
@Slf4j
@Service
public class AdvertisingDataJob extends QuartzJobBean{

    //本次拉取数据是否已经发送了异常短信
    public static AtomicBoolean isSendExceptionSms = new AtomicBoolean(false);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>{} {}", "刷新广告数据Job开始", LocalDateTime.now());
        isSendExceptionSms.set(false);


    }
}
