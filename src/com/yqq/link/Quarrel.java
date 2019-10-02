package com.yqq.link;

/**
 * Created by yqq on 2019/10/3.
 */
public class Quarrel extends Method {
    public static void main(String[] args) {

        LinkNode L = new LinkNode();
        System.out.println("初始化：");
        initLinkNode(L);
        System.out.println(L.toString());

        System.out.println("插入节点：");
        insertLinkNode(L,"A");
        insertLinkNode(L,"B");
        insertLinkNode(L,"C");
        insertLinkNode(L,"D");
        insertLinkNode(L,"E");
        insertLinkNode(L,"F");
        System.out.println(L.toString());

        int count = traverse(L);
        System.out.println("节点个数："+count);

        StringBuffer str = outputLinkNode(L);
        System.out.println(str);
        //最后一个F的位置
        int lastindex = lastIndex(L,"F");
        System.out.println("最后一个F的位置："+lastindex);

        System.out.println("删除一个节点");
        deleteLinkNode(L,2);

        count = traverse(L);
        System.out.println("节点个数："+count);
        str = outputLinkNode(L);
        System.out.println(str);
        System.out.println(L.toString());

    }
}
