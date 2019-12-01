package com.banyuan.fx01.patten03;

public class XiaoMiFacoryImpl implements   XiaoMiFactory {
    @Override
    public XiaoAI createXiaoAI() {

        return new XiaoAIImpl();
    }

    @Override
    public XMPhone createXMPhone() {

        return new XMPhoneImpl();
    }

    @Override
    public XMWacth createXMWatch() {
        return  new XMWatchImpl();
    }

}
