package com.banyuan.cn;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net {


    /**
     * 计算机网络:
     * @param
     * @deprecated  计算机根据某种规则进行数据传输： 网络模型    open  System   interconnection      osi  摩模型
     *              TCP/IP
     *
     *      osi    应用层   终端的应用    ftp   web 浏览器   qq    英雄联盟
     *             表示层    对接受的数据进行解释   加密或者解密   压缩 或者解压缩
     *             会话层   通过传输层  传输数据到会话层    主要是在系统之间发起会话   或者是接受会话请求 （ 协议  地址  端口 ）
     *
     *             传输层        定义一些传输的数据的协议 和 端口号    TCP/IP  UDP   ftp   HTTP   HTTPS
     *                  主要是从下一层接收数据  和对数据进行传输
     *             网络层        从下一层获取  ip 地址  对ip地址 进行 封装和解封装    这里的设备  路由器
     *             数据链层      MAC地址(网卡的地址)    这一层 叫做 帧 在这一层工作的设备一般是交换机
     *             物理层        定义一些物理标准  如网线的接口  光纤的接口类型   各种数据的传输介质    他的最主要作用  传输比特流
     *
     *     TCP/IP
     *
     *              应用层
     *
     *              传输层
     *
     *              网际层
     *
     *             主机至网络层
     *      网络通信的要素:  IP    网络号码+主机地址   xxx.xxx.xxx.xxx    192.168.11.22
     *                                  1字节.1.1.1字节            四字节  32    能组成多少个不同的地址    42亿个左右  IPV4
     *                                  IPV6  号称 可以给世界上每一粒沙子都分配一个地址
     *                                  16字节   128位
     *
     *                                 0~255.0~255.0~255.0~255
     *                           A类:  前一段 网络号码  后三段本地的计算号码     1.0.0.1 ~127.255.255.255
     *                           （10.x.x.1）只能在局域网使用
     *
     *                           B. 前段是网络号码 后两段是本地的计算机号码    192.168. 这个属于一个私人 的地址
     *
     *                           C类: 前三段网络  后一段是  计算机
     *                           192.0.0.1
     *
     *                          D  224.0.0.1 ~239.255.255.255
     *                          E  240.0.0.1~247.255.255.255
     *
     *                          127.0.0.1  表示本机地址
     *                          xxx.xxx.xxx.255  表示广播地址
     *
     *                     端口号
     *                          0~65535   2*16-1
     *                           0~1024 端口号已经被使用  或则是 没被使用但是还保留着
     *
     *                     协议
     *                      TCP/IP
     *                          发送数据没有限制
     *                          速度慢
     *                          可靠安全
     *                         视频电话   发送大批量的安全性的文件
     *
     *                      UDP
     *                         发送数据有限制
     *                         速度快
     *                         不可靠
     *                      qq 发送消息
     *
     *                      HTTPS
     *                          web  服务器之前会学到这个协议  服务器 是什么跟后台进行交会
     *
     *
     *
     */


    public static void main(String[] args) throws UnknownHostException {
      //  InetAddress ip= InetAddress.getByName("192.168.11.22");
       // InetAddress  ip=InetAddress.getLocalHost();
      //  System.out.println(ip.getAddress()+"---"+ip.getHostAddress()+"--"+ip.getHostName());

     //  InetAddress  [] address= InetAddress.getAllByName("");
//        for (InetAddress  ad:address) {
//            System.out.println(ad);
//        }

    }

}
