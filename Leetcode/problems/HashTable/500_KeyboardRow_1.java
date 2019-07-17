class Solution {
   public String[] findWords(String[] words) {
        int flag1 = 0, flag2 = 0, flag3 = 0;
        List<String> result = new ArrayList<String>();
        for(String aa : words)
        {
            char[] find = aa.toCharArray();
            for(char ss: find)
            {
                if(ss == 'Q'||ss == 'q'||ss == 'W'||ss == 'w'||ss == 'E'||ss == 'e'||ss == 'R'||ss  == 'r'||ss == 'T'||ss == 't'||ss == 'Y'||ss == 'y'||ss == 'U'||ss == 'u'||ss == 'I'||ss == 'i'||ss  == 'O'||ss == 'o'||ss == 'P'||ss == 'p')
                    flag1 = 1;
                if(ss == 'A'||ss == 'a'||ss == 'S'||ss == 's'||ss == 'D'||ss == 'd'||ss == 'F'||ss  == 'f'||ss == 'G'||ss == 'g'||ss == 'H'||ss == 'h'||ss == 'J'||ss == 'j'||ss == 'K'||ss == 'k'||ss  == 'L'||ss == 'l')
                    flag2 = 1;
                if(ss == 'Z'||ss == 'z'||ss == 'X'||ss == 'x'||ss == 'C'||ss == 'c'||ss == 'V'||ss     == 'v'||ss == 'B'||ss == 'b'||ss == 'N'||ss == 'n'||ss == 'M'||ss == 'm')
                    flag3 = 1;
            }
        if(flag1 == 1 && flag2 == 0 && flag3 == 0)
            result.add(aa);
        if(flag1 == 0 && flag2 == 1 && flag3 == 0)
            result.add(aa);
        if(flag1 == 0 && flag2 == 0 && flag3 == 1)
            result.add(aa);
            flag1 = 0;
            flag2 = 0; 
            flag3 = 0;
        }
        return (String[])result.toArray(new String[0]);
    }
}