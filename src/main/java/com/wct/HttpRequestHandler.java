package com.wct;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory;
import io.netty.util.CharsetUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.netty.handler.codec.http.HttpHeaderUtil.is100ContinueExpected;

/**
 * @author shkstart
 * @create 2021-06-10 10:14
 */
public class HttpRequestHandler extends SimpleChannelInboundHandler<FullHttpRequest> {
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }
//
//
//    protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest req) throws Exception {
//        //100 Continue
////        if (is100ContinueExpected(req)) {
////            ctx.write(new DefaultFullHttpResponse(
////                    HttpVersion.HTTP_1_1,
////                    HttpResponseStatus.CONTINUE));
////        }
//        // 获取请求的uri
//        String uri = req.uri();
//        System.out.println(uri);
//        Map<String,String> resMap = new HashMap<String,String>();
//        resMap.put("method", String.valueOf(req.method().name()));
//        resMap.put("uri",uri);
//        String msg = "<html><head><title>test</title></head><body>你请求uri为：" + uri+"</body></html>";
//        // 创建http响应
//        FullHttpResponse response = new DefaultFullHttpResponse(
//                HttpVersion.HTTP_1_1,
//                HttpResponseStatus.OK,
//                Unpooled.copiedBuffer(msg, CharsetUtil.UTF_8));
//        // 设置头信息
//        response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/html; charset=UTF-8");
//        //response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain; charset=UTF-8");
//        // 将html write到客户端
//        ctx.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
//    }
//
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, FullHttpRequest fullHttpRequest) throws Exception {
         HttpHeaders header = fullHttpRequest.headers();//获取Netty内置的请求头对象
        List list = header.entries(); //将包含的请求信息赋值到list中
        for (Object s1:list) {

            System.out.println(list.indexOf(s1)+"循环遍历"+s1);
        }
//        System.out.println(header.get("Connection"));





//        String uri = fullHttpRequest.uri();
//        Map<String,String> resMap = new HashMap<String,String>();
//        resMap.put("method","put");
//        resMap.put("uri",uri);
//        String msg = "<html><head><title>test</title></head><body>你请求uri为：" + uri+"</body></html>";
//        // 创建http响应
//        FullHttpResponse response = new DefaultFullHttpResponse(
//                HttpVersion.HTTP_1_1,
//                HttpResponseStatus.OK,
//                Unpooled.copiedBuffer(msg, CharsetUtil.UTF_8));
//        // 设置头信息
//        response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/html; charset=UTF-8;");
//        response.headers().set(HttpHeaderNames.COOKIE,"made_write_conn=1295214458; Path=/; Domain=.169it.com");
//        //response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain; charset=UTF-8");
//        // 将html write到客户端
//        channelHandlerContext.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);




   }


}
