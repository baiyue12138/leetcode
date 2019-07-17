class Solution {
    /**
    *思路：这里使用的方法是使用了优先队列的方法，因为优先队列每次插入一个数据之后是自动排序的，一个最直观的解法是遍历一遍字符串，统计每类字符的频数，然后对字符按照出现的频数从大到小排序（可以做成<频数，字符>的映射，加入优先队列）。然后每次提取出优先队列中的队首的两个映射处理，我们将这两个映射中的字符连在一起，然后还要对其频数-1，如果减了频数以后，频数有依然不为0，,将修改后的映射重新插入优先队列，等待下次排列。
     * 写一个NewChar类，里面包含字母的出现频数，和字母本身。用优先队列PriorityQueue来存储一个一个的NewChar，
     * 并自己写一个比较器，通过字母的频数降序排列，即构建一个大顶堆。之后两两输出，输出前两个大的，
     * 然后将它们两个对应的count频率-1，再次放入，继续输出……
     *
     * 这样输出是为了总能有一个字母可以把频率最多的字母隔开，优先队列是为了维持储存NewChar的集合总是可以降序输出。
     *
     * @param S 定一个字符串S
     * @return 若可行，输出任意可行的结果。若不可行，返回空字符串。
     */
    public String reorganizeString(String S) {
        //整理好各个字母对应出现的频率
        int[] counts = new int[26];
        for (int i = 0; i < S.length(); i++) {
            counts[S.charAt(i) - 'a']++;
        }
        //定义大顶堆规则
        PriorityQueue<NewChar> pq = new PriorityQueue<>(26, new Comparator<NewChar>() {
            //重写比较规则 （后面对象 - 前面对象）为大顶堆

            /**
             * 拿过来api说
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             * @return a negative integer, zero, or a positive integer as the
             *         first argument is less than, equal to, or greater than the
             *         second.
             */
            @Override
            public int compare(NewChar o1, NewChar o2) {
                //基于出现频率的比较
                //默认是小顶堆，重写为大顶堆
                return o2.count - o1.count;
            }
        });
        //构建大顶堆
        for (int i = 0; i < 26; i++) {
            //判断重构是否可行，counts[i] <= (S.length() + 1) / 2)---某个字母过半就不能重构
            if (counts[i] > 0 && counts[i] <= (S.length() + 1) / 2) {
                //可以重构，就往大顶堆里面塞对象
                pq.add(new NewChar(counts[i], (char) (i + 'a')));
            } else if (counts[i] > (S.length() + 1) / 2) {
                return "";
            }
        }
        //由大顶堆重构字符串
        StringBuilder str = new StringBuilder();

        while (pq.size() > 1) {//最后剩下一个字符或者一个不剩，终止
            //拿出来频率老大和老二
            NewChar c1 = pq.poll();
            NewChar c2 = pq.poll();

            str.append(c1.letter);
            str.append(c2.letter);

            if (--c1.count > 0) pq.add(c1);
            if (--c2.count > 0) pq.add(c2);
        }
        //若剩下一个，特殊处理；一个不剩正好，美滋滋
        if (pq.size() > 0)
            str.append(pq.poll().letter);

        return str.toString();
    }

    /**
     * 自己根据数据特点搞个对象
     */
    static class NewChar {
        int count;//出现的频率
        char letter;//字母

        NewChar(int count, char letter) {
            this.count = count;
            this.letter = letter;
        }
    }

    /**
     * 创建PriorityQueue的时候一定要写一个比较器Comparator，因为NewChar是自己写的一个类，
     * 不写比较器的话程序自己不知道该如何排序，从而会报错：
     *
     * cannot be cast to java.lang.Comparable 	at java.util.PriorityQueue.siftUpCom
     */
}