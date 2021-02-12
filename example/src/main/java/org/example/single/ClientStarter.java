package org.example.single;

import java.util.concurrent.TimeUnit;

import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.alipay.sofa.rpc.config.RegistryConfig;
import com.google.common.util.concurrent.Uninterruptibles;

public class ClientStarter {
    public static void main(String[] args) {

        RegistryConfig registryConfig = new RegistryConfig()
                .setProtocol("zookeeper")
                .setAddress("127.0.0.1:2181");

        ConsumerConfig<HelloService> consumerConfig = new ConsumerConfig<HelloService>()
                .setRegistry(registryConfig)
                .setInterfaceId(HelloService.class.getName())
                .setProtocol("bolt");

        HelloService service = consumerConfig.refer();
        while (true) {
            System.out.println(service.sayHello("world"));
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        }
    }
}
