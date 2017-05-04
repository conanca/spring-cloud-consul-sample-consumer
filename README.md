
## 项目简介
一个微服务架构中的服务消费者示例项目。仅是最简化的演示，基于spring-cloud-consul，feign实现。

## Feign简介
Feign是一种声明式、模板化的HTTP客户端。在Spring Cloud中使用Feign, 我们可以做到使用HTTP请求远程服务时能与调用本地方法一样的编码体验，开发者完全感知不到这是远程方法，更感知不到这是个HTTP请求。

## 使用
1. 启动consul
2. 启动[该项目](http://192.168.82.98/conanca/spring-cloud-consul-sample-provider)服务提供者
3. 运行测试用例——SampleServiceTest，观察结果 