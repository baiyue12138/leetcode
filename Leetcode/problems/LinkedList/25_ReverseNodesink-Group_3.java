/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode list=new ListNode(0);//永远表示头插法要插入的头结点
        ListNode return_list=list;//最终要返回的链表头
        ListNode Start=new ListNode(0);//每次处理反转时，开始的位置
        ListNode End=new ListNode(0);//每次处理反转时，结束的位置
        int count=0;//计数
        while(head!=null){//对要处理的链表按k个一组递进处理
            count=0;
            Start=head;
            End=Start;//开始结束指针的初始化
            while(End!=null&&count<k){
                End=End.next;
                count++;
            }//首先判定一下当前组是否有k个
            if(count==k){//有k个则进行处理
                list.next=head;//因为遇到list.next=null的问题，好像不能tmp=list.next这样去赋值，所以就手动给它先加一个结点
                head=head.next;//手动递进一位
                for(int i=1;i<k;i++){//因为已经加了一个结点，所以i从1开始，
                    ListNode tmp=list.next;
                    list.next=head;
                    head=head.next;
                    list.next.next=tmp;//头插法
                }
                Start.next=null;//在这里必须清空头数字的指针，使其变成真正的尾部
                list=Start;//Start里保存的就是尾部，而list要永远是头插法要插入的头，所以要让list定位到Start开始下一轮处理，这里可以这么理解，list一次往后跳k个结点，每次处理完之后，都跳到链表的最后，以便下一轮在其后面插入结点
			}else{//如果不足k个，直接链接即可
                list.next=Start;
                break;
            }          
        }
       return return_list.next; //因为list是往后跳的，但是return_list是保存着list的最开始的位置的，所以返回的时候要返回return_list;
    }
}