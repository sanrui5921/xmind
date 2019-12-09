package org.sunrain.study.netty.demo;

/**
 * 公众号：bugstack虫洞栈  ｛获取学习源码｝
 * 博  客：http://itstack.org
 * 论  坛：http://bugstack.cn
 * Create by fuzhengwei on 2019/7/20
 * 一个简单的Netty服务端示例
 */
public class NettyServer {

//    public static void main(String[] args) {
//        new NettyServer().bing(7397);
//    }

//    private void bing(int port) {
//        //配置服务端NIO线程组
//        EventLoopGroup parentGroup = new NioEventLoopGroup(); //NioEventLoopGroup extends MultithreadEventLoopGroup Math.max(1, SystemPropertyUtil.getInt("io.netty.eventLoopThreads", NettyRuntime.availableProcessors() * 2));
//        EventLoopGroup childGroup = new NioEventLoopGroup();
//        try {
//            ServerBootstrap b = new ServerBootstrap();
//            b.group(parentGroup, childGroup)
//                    .channel(NioServerSocketChannel.class)    //非阻塞模式
//                    .option(ChannelOption.SO_BACKLOG, 128)
//                    .childHandler(new MyChannelInitializer());
//            ChannelFuture f = b.bind(port).sync();
//            f.channel().closeFuture().sync();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            childGroup.shutdownGracefully();
//            parentGroup.shutdownGracefully();
//        }
//    }
}

