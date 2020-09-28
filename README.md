Plasma项目简介

项目组成：

Nginx集群：负载均衡

Soul集群：网关接入服务（Gateway Access Service），作用：负载均衡、限流、熔断、降级

Zookeeper集群：注册中心。作用：服务注册、服务发现

Apollo集群：配置中心。作用：动态配置。

监控中心：zabbix、skywarking、运维监控。作用：链路追踪、监控警告

Prometheus：监控报警系统。Grafana，Alertmanager-》短信、邮件、微信

Dubbo RPC：服务调用

RocketMQ集群：消息队列

Redis集群：缓存

Mysql集群：分库分表。存储数据。ES二级搜索，

TIDB数据库：存储业务数据。Tidb、PD、KV

FastDFS集群：Client、Tracker、Storage。文件图片视频音频存储。

分布式锁集群：ETCD

分布式事务集群：Seata

任务调度：XXL-JOB

日志系统：filebeat日志收集。Kafka、Kibana、ElasticSearch、Logstash

DNS解析：

CDN：

DNS配置域名下挂若干个Nginx，每个Nginx下挂若干个网关服务实例。

数据库Mysql与TIDB二选一，前期主从mysql，后期mysql分库，或直接使用TIDB，不需要分库

基于阿里dubbo服务框架的架构设计

通用服务：

1、订单服务

2、用户服务

3、商品服务

4、库存服务

5、交易服务

6、鉴权认证

数据访问层：

1、订单访问

2、用户访问

3、商品访问

4、库存访问

5、交易访问

6、其他访问



CI/CD
GitLab、Jenkins、Kubernetes、harbor、Docker、Centos、Linux

在Kubernetes中使用CI/CD，一般步骤为：

1、在GitLab创建对应的项目

2、开发者将代码提交到GitLab

3、Jenkins创建对应的任务（Job），集成该项目的Git地址和Kubernetes集群。

4、如有配置钩子，推送（Push）代码会自动出发Jenkins构建，如没有配置，需要手动构建。

5、Jenkins控制Kubernetes（使用Kubernetes插件）创建Jenkins Slave

6、Jenkins Slave根据流水线（Pipeline）定义的步骤，执行构建

7、通过Dockerfile生成镜像

8、将镜像提送（Push）到私有Harbor

9、Jenkins再次控制Kubernetes进行最新的项目部署


流水线步骤一般写在Jenkinsfile中，Jenkins会自动读取该文件，同时Jenkinsfile和Dockerfile可一并和代码放置于GitLab中，或单独部署


