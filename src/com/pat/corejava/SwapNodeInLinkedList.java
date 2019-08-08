package com.pat.corejava;
class Node<T>{
    T t;
    Node<T> next;
    Node(T t){
        this.t = t;
        this.next=null;
    }
    }

public class SwapNodeInLinkedList {
  Node<Integer> headnode;
  private void add(int t){
       Node temp=  new Node<Integer>(t);
       temp.next=headnode;
       headnode=temp;
  }
 private void print(){
    Node temp =headnode;
    while(temp !=null){
        System.out.print(temp.t+"   ");
        temp=temp.next;
    }
    System.out.println(System.lineSeparator());
 }
 private void swap(int value1,int value2){
       Node<Integer> currentNode1 = headnode;
       Node<Integer> prevNode1=null;
       while(null != currentNode1 && currentNode1.t !=value1){
            prevNode1=currentNode1;
            currentNode1=currentNode1.next;

       }

       Node<Integer> currentNode2 = headnode;
       Node<Integer> prevNode2=null;

       while (null != currentNode2 && currentNode2.t !=value2){
           prevNode2=currentNode2;
            currentNode2=currentNode2.next;
        }


        if(prevNode1 !=null){
            prevNode1.next=currentNode2;
        }


        if(null != prevNode2){
            prevNode2.next=currentNode1;
        }
}



  public static  void main(String...args){
        /*add elements in headnode -> start */
        SwapNodeInLinkedList swapNodeInLinkedList = new SwapNodeInLinkedList();
        swapNodeInLinkedList.add(1);
        swapNodeInLinkedList.add(2);
        swapNodeInLinkedList.add(3);
      swapNodeInLinkedList.add(4);
      swapNodeInLinkedList.add(5);
      swapNodeInLinkedList.print();
      swapNodeInLinkedList.swap(2,3);
      swapNodeInLinkedList.print();






        /*add elements in headnode -> end */



  }





}
