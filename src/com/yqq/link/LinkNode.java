package com.yqq.link;

/**
 * Created by yqq on 2019/10/2.
 */
public class LinkNode {

    public String data;

    public LinkNode next;

    public LinkNode(String data,LinkNode next){
        super();
        this.data=data;
        this.next=next;
    }

    public LinkNode(){
        super();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return "data:"+data+" next->"+next;
    }
}
