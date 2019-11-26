package com.yqq.link;

/**
 * Created by yqq on 2019/11/26.
 */
public class Josephu {


    public static void main(String[] args) {
        //测试环形链表构建和遍历
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(6);
        circleSingleLinkedList.showNode();
        //测试出圈
        circleSingleLinkedList.countNode(1, 3, 6);
    }
}

//创建环形单向链表
class CircleSingleLinkedList{
    //创建first节点，当前不初始化
    private Boy first=null;

    //添加节点，构建成环形的链表
    public void addBoy(int nums) {
        if(nums<1) {
            System.out.println("nums的值不正确，至少大于1");
            return;
        }
        Boy curBoy=null;//辅助变量，帮助构建环形链表
        //使用for循环创建环形链表
        for(int i=1;i<=nums;i++) {
            //根据编号，创建节点
            Boy boy=new Boy(i);
            //特别地，第一个节点需要单独创建，并构建环结构
            if(i==1) {
                first=boy;
                first.setNext(first);
                curBoy=first;//让curBoy指向第一个节点
            }else {
                curBoy.setNext(boy); //first(boy[i-1]) 的指针指向boy[i]
                boy.setNext(first);  //boy[i] 的指针指向first
                curBoy=boy; // curBoy移到当前boy[i]
            }
        }
    }
    //遍历当前环形链表
    public void showNode() {
        if(first==null) {
            System.out.println("链表为空");
            return;
        }
        Boy curBoy=first;
        while(true) {
            System.out.printf("编号%d\n",curBoy.getNo());
            if(curBoy.getNext()==first) {//说明遍历完毕
                break;
            }
            curBoy=curBoy.getNext();//curBoy后移
        }
    }
    //根据用户的输入，计算出小孩出圈的顺序
    /**
     * @param startNo表示从第几个节点开始计数
     * @param countNum表示计数次数
     * @param nums表示最初节点的数量
     */
    public void countNode(int startNo,int countNum,int nums) {
        if(first==null || startNo<1 || startNo>nums) {
            System.out.println("参数输入有误，重新输入");
            return;
        }
        //创建辅助指针，帮助完成node出圈，helper指针需要指向最后的节点
        Boy helper=first;
        while(true) {
            if(helper.getNext()==first) {//说明helper指向最后节点
                break;
            }
            helper=helper.getNext();
        }
        //报数前，先让first和helper移动k-1次，即到达开始报数的位置
        for(int j=0;j<startNo-1;j++) {
            first=first.getNext();
            helper=helper.getNext();
        }
        //报数时，让helper和first指针同时移动countNum次，然后出圈；循环直到圈中只有一个节点
        while(true) {
            if(helper==first) {//说明圈中只有一个节点
                break;
            }
            for(int j=0;j<countNum-1;j++) {
                first=first.getNext();
                helper=helper.getNext();
            }
            System.out.printf("编号为%d的节点出圈\n", first.getNo());
            //first指向的节点出圈
            first=first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留在圈中的节点的编号是%d \n",first.getNo());
    }
}
//定义节点
class Boy{

    private int no;

    private Boy next;//指向下一个节点，默认null

    public Boy(int no) {
        this.no=no;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public Boy getNext() {
        return next;
    }
    public void setNext(Boy next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "Boy [no=" + no + ", next=" + next + "]";
    }
}
