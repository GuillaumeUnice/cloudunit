package fr.treeptik.cloudunit.orchestrator.docker;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface OrchestratorChannels {
    String APPLICATIONS = "applications";
    String SERVICES = "services";
    String CONTAINERS = "containers";
    String IMAGES = "images";

    @Input(APPLICATIONS)
    SubscribableChannel applications();
    
    @Input(SERVICES)
    SubscribableChannel services();
    
    @Output(CONTAINERS)
    SubscribableChannel containers();
    
    @Output(IMAGES)
    SubscribableChannel images();
}