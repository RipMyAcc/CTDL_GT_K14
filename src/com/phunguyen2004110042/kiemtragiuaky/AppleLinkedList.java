package com.phunguyen2004110042.kiemtragiuaky;

public class AppleLinkedList {
    AppleNode head = null;
    AppleNode tail = null;
    AppleNode current = null;
    AppleNode previous = null;
    public AppleLinkedList(){};
    void add(String id, double khoiluong, String mau){
        AppleNode newNode = new AppleNode(id, khoiluong, mau);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    void addHead(String id, double khoiluong, String mau){
        AppleNode newNode = new AppleNode(id, khoiluong, mau);
        newNode.next=head;
        head=newNode;
    }
    void addBefore(String search, String id, double khoiluong, String mau){
        if(search(search)==false){
            System.out.println("Không tìm thấy để thêm");
            return;
        }
        if(current==head){
            addHead(id, khoiluong, mau);
        }
        else{
            searchPrevious();
            AppleNode newNode = new AppleNode( );
            previous.next=newNode;
            newNode.next=current;
        }
        
    }
    boolean search(String search){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.mau==search){
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
    void print(){
        current= head;
        if(head==null){
            System.out.println("Không có táo");
            return;
        }
        System.out.println("Các táo trong kho:");
        while(current!=null){
            current.inthongtin();
            current=current.next;
        }
    }
}
