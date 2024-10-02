package com.wk;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.apache.commons.compress.compressors.gzip.GzipUtils;

import java.io.File;
import java.io.FileInputStream;


/**
 * @author shkstart
 * @create 2021-06-09 19:35
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(workerGroup)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline().addLast(new ClientHandler());
                    }
                });
        ChannelFuture future = bootstrap.connect("127.0.0.1", 8379).sync();
       future.channel().writeAndFlush(Unpooled.copiedBuffer("777".getBytes()));


       /* for(int i=1; i<=5; i++) {
            Request request = newRequest();
            request.setId(i);
            request.setName("pro"+ i);
            request.setReqeustMessag("数据信息" + i);
            //传输图片
            char separator = File.separatorChar;
            File file = newFile(System.getProperty("user.dir") + separator + "source"+ separator + "2.jpg");
            FileInputStream inputStream = newFileInputStream(file);
            byte[] data = newbyte[inputStream.available()];
            inputStream.read(data);
            inputStream.close();
            byte[] gzipData = GzipUtils.gzip(data);
            request.setAttachment(gzipData);
            future.channel().writeAndFlush(request);
        }*/



        future.channel().closeFuture().sync();
        workerGroup.shutdownGracefully();
    }
}
