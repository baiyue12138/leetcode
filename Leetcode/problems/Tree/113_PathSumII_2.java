/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
*  结合题目中的例子，简述思路如下：
*     1.采用中序遍历，则从根节点5起，首先搜索左孩子节点，一直到达叶子节点为止，第一条合法路径为：5-4-11-7，检验路径和是否满足约束条件（sum==22）；
 *    2.若满足则将路径保存起来；
  *   3.然后，当前路径尾端数据弹出，剩余5-4-11，返回，相当于回到根节点11；
   *  4.继续搜索右孩子结点，2为叶子节点，因而合法路径为：5-4-11-2，检验其是否满足约束条件；
    * 5.....
*
    *【注意事项】执行当前路径尾端数据弹出的操作有两个位置：
 *    1.遍历至叶子节点，形成合法路径，在检验路径是否满足约束条件并保存后，弹出末端数据，返回，如此便可回到最近的根节点，然后继续搜索该根节点的子节点；
  *   2.某一根节点的左右子节点遍历完毕，如根节点11的子节点7和2遍历完毕，须返回上一层，这时候需要弹出根节点11，则当前搜索路径变为：5-4；根节点4没有右叶子
  *节点，弹出4，返回上一层5,根节点5有右子节点，继续中序遍历...
 **/
public class Solution {
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) 
    {
	   List<List<Integer>> result=new ArrayList<List<Integer>>();//List接口变量用的ArrayList类对象实例化
	   List<Integer> temp=new ArrayList<Integer>();
	   
	   if(root==null)return result;
	   DFS(result,temp,root,sum);
	   return result;
    }
    
    void DFS(List<List<Integer>> result,List<Integer> temp,TreeNode root,int sum)
    {
	   if(root==null)return;
	   if(root.left==null&&root.right==null)//叶子节点
	   {
		   temp.add(root.val);
		   if(sumOfPath(temp)==sum)
			   result.add(new ArrayList(temp));//一定要注意这里，必须新建，否则值会改变
		   temp.remove(temp.size()-1);
		   return;
	   }
	   else
	   {
		   temp.add(root.val);
		   DFS(result,temp,root.left,sum);
		   DFS(result,temp,root.right,sum);
		   temp.remove(temp.size()-1);
	   }
   }
   
   int sumOfPath(List<Integer> temp)
   {
	   int sum=0;
	   for(int i=0;i<temp.size();i++)
	   {
		   sum+=temp.get(i);
	   }
	   return sum;
   }
}
