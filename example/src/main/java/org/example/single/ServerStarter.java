package org.example.single;

import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.RegistryConfig;
import com.alipay.sofa.rpc.config.ServerConfig;

public class ServerStarter {
    public static void main(String[] args) {

        RegistryConfig registryConfig = new RegistryConfig()
                .setProtocol("zookeeper")
                .setAddress("127.0.0.1:2181");

        // ServerConfig 指定了协议，端口
        ServerConfig serverConfig = new ServerConfig()
                .setProtocol("bolt")
                .setPort(12200)
                .setDaemon(false);

        // 服务发布 指定了接口，实现类（service信息） + server config
        ProviderConfig<HelloService> providerConfig = new ProviderConfig<HelloService>()
                .setRegistry(registryConfig)
                // 指定接口
                .setInterfaceId(HelloService.class.getName())
                // 手动指定的服务实现类，也不是不可以
                .setRef(new HelloServiceImpl())
                .setServer(serverConfig);

        providerConfig.export();
    }
}
