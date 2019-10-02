package com.yqq.link;

/**
 * Created by yqq on 2019/10/3.
 */
public class Method {

    public static void initLinkNode(LinkNode L){
        L.setData("#");
        L.setNext(null);
    }

    //遍历链表，返回链表的长度
    public static int traverse(LinkNode L){
        LinkNode p = L;
        int count = 1;
        while(p.next!=null){
            p = p.next;
            count++;
        }
        return count;
    }

    //把链表L的data转化为StringBuffer输出，输出结果为字符串
    public static StringBuffer outputLinkNode(LinkNode L){
        StringBuffer str = new StringBuffer();
        LinkNode p = L;
        while (true){
            str.append(p.data);
            if(p.next!=null){
                p = p.next;
            }
            else{
                break;
            }
        }
        return str;
    }

    //在链表L的尾部插入一个节点，值为data
    public static void insertLinkNode(LinkNode L,String data){
        LinkNode p = L;
        LinkNode q = new LinkNode();
        //每次都会从链表头开始往下查找
        // 还有一种死循环的写法，用while
        while (true){
            if(p.next==null){
                q.setData(data);
                q.setNext(null);
                p.setNext(q);
                System.out.println("Insert "+data+" success.");
                break;
            }
            else{
                p = p.next;
            }
        }
    }

    //删除第n个节点 (从0开始)
    public static void deleteLinkNode(LinkNode L,int n){
        int count = 1;
        LinkNode p = L;
        for(@SuppressWarnings("unused")int i;;){
            if(count == n){
                p.setNext(p.next.next);
                break;
            }
            else{
                count++;
                p = p.next;
            }
        }
    }

    //从index=n开始遍历，如果后面出现str，则返回true否则返回false
    public static int lastIndex(LinkNode L,String str){
        LinkNode p = L;
        int flag = 0;
        for(int i=0;i<traverse(L);i++){
            if(p.data==str){
                //System.out.println(i);
                flag = i;
            }
            p = p.next;
        }
        return flag;
    }

}
