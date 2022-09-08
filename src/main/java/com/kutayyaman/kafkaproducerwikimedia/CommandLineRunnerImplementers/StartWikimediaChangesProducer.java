package com.kutayyaman.kafkaproducerwikimedia.CommandLineRunnerImplementers;

import com.kutayyaman.kafkaproducerwikimedia.kafka.producer.WikimediaChangesProducer;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class StartWikimediaChangesProducer implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(StartWikimediaChangesProducer.class);
    private final WikimediaChangesProducer wikimediaChangesProducer;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("StartWikimediaChangesProducer is executed");
        wikimediaChangesProducer.sendMessage();
    }
}
