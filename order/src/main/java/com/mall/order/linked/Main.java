package com.mall.order.linked;

/**
 * @author acai
 * @date 2020/11/27
 **/
public class Main {

    public static void main(String[] args) {
        Node node = buildNode();
        Node reverse = reverseNum(node,2,4);


        print(reverse);


    }


    public static Node reverse(Node head){
       if (head == null){
           return null;
       }
       Node pre = head;
       Node cur = pre.next;
       pre.next = null;
       while(cur != null){
           Node next = cur.next;
           cur.next = pre;
           pre = cur;
           cur = next;
       }
       return pre;
    }

    public static Node reverseNum(Node head,int m,int n){
        if(head == null || m>n){
            return head;
        }
        Node dummy = new Node(-1);
        dummy.next = head;
        head = dummy;
        for(int i=1;i<m;i++){
            head = head.next;
        }
        Node preM =  head;
        Node mNode = head.next;
        Node nNode = mNode;
        Node postN = nNode.next;
        for(int i =m;i<n;i++){
            Node next = postN.next;
            postN.next = nNode;
            nNode = postN;
            postN = next;

        }
        preM.next = nNode;
        mNode.next = postN;
        return dummy.next;
    }

    public static Node buildNode(){
        Node current,head;
        current = head= new Node(1);
        for(int i=2;i<6;i++){
            current.next = new Node(i);
            current = current.next;
        }
        return head;
    }
    public static void print(Node node){
        if(node == null){
            System.out.println("null");
        }
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }

}

class Node{
    Node next;
    int val;

    public Node(int val) {
        this.val = val;
    }
}
