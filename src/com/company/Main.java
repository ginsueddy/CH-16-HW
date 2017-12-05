package com.company;

public class Main {

    /* Self Check 5-17:
    
        5.             +----+----+    +----+----+
            list ----> |  1 |  +----> |  3 |  / |
                       +----+----+    +----+----+

        6.             +----+----+    +----+----+    +----+----+
            list ----> |  1 |  +----> |  3 |  +----> |  2 |  / |
                       +----+----+    +----+----+    +----+----+

        7.             +----+----+    +----+----+
            list ----> |  4 |  +----> |  3 |  / |
                       +----+----+    +----+----+

        8.             +----+----+    +----+----+
            list ----> |  1 |  +----> |  2 |  / |
                       +----+----+    +----+----+

        9.  list.next.next = new ListNode(3, null);

        10. list = new ListNode(3, list);

        11. temp.next.next = list.next;
            list.next = temp

        12. ListNode = list2 = list
            list = list.next;
            list2.next = list.next.next;
            list.next = null;

        13. ListNode temp = list;
            list = list.next();
            temp.next = list.next;
            list.next = temp;

        14. ListNode temp = list.next.next;
            temp.next = list.next;
            list.next.next = list;
            list.next.next.next = null;
            list = temp;

        15. list.next.next.next = temp;
            temp.next.next = list.next.next;
            list.next.next = null;
            ListNode temp2 = temp.next;
            temp.next = list.next;
            list = temp2;

        16. list2.next.next.next = list;
            list.next = list2;
            list = list2.next.next;
            list2 = list2.next;
            list2.next = null;
            list.next.next.next = null;

        17. ListNode list2 = list.next.next;
            list.next.next.next.next = list.next;
            ListNode temp = list;
            list = list.next.next.next;
            list2.next = temp;
            list.next.next = null;
            list2.next.next = null;
     */

    public static void main(String[] args){

    }
}