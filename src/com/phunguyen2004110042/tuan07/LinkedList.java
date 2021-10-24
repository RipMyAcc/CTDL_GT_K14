package com.phunguyen2004110042.tuan07;

public class LinkedList {
    Node head = null;
    Node tail = null;
    Node current = null;
    Node previous = null;
    public LinkedList(){};
    void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    void addHead(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void addBefore(int search, int data){
        if(search(search)==false){
            System.out.println("Không tìm thấy để thêm");
            return;
        }
        if(current==head){
            addHead(data);
        }
        else{
            searchPrevious();
            Node newNode = new Node(data);
            previous.next=newNode;
            newNode.next=current;
        }
        
    }
    boolean search(int search){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.data==search){
                result =true;
                return result;
            }
            current=current.next;
        }
        return result;
    }
    void searchPrevious(){
        previous = head;
        while(previous!=null){
            if(previous.next==current){
                return;
            }
            previous=previous.next;
        }
    }
    void removeHead(){
        head=head.next;
    }
    void removeTail(){
        current=head;
        while(current!=null){
            if(current.next==tail){
                tail=current;
                tail.next=null;
                return;
            }
            current=current.next;
        }
    }
    void remove(int search){
        if(search(search)==false){
            System.out.println("Không tìm thấy để xoá");
            return;
        }
        if(current==head){
            removeHead();
            return;
        }
        if(current==tail){
            removeTail();
            return;
        }
        searchPrevious();
        previous.next=current.next;
    }
    void rewrite(int search, int data){
        if(search(search)==false){
            System.out.println("Không thể tìm thấy để sửa");
            return;
        }
        current.data=data;
    }
    void print(){
        current= head;
        if(head==null){
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("Các nút trong danh sách:");
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
