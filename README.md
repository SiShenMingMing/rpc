# rpc
分为了rpc-server和rpc-client两个部分，外加一个公共配置的rpc-lib
## 访问rpc-client
http://192.168.230.129:30929/add?username=shiming&age=22&hobby=test&key=a&value=shiming


需要将username、age、hobby、key、value进行自定义

验证服务可用性,访问rpc-client：
http://192.168.230.129:30929/test


## 流程
rpc-server先启动
然后启动rpc-client

访问rpc-client，可以看到rpc-server将rpc-client中的信息获取之后又返回给了rpc-client
