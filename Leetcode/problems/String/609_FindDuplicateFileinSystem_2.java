class Solution {
   public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>>res=new ArrayList<List<String>>();
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<paths.length;i++){
        	String[]path=paths[i].split(" ");
        	for(int j=1;j<path.length;j++){
        		String[] file=path[j].split("\\(");
        		String filename=file[0];
        		String[] contents=file[1].split("\\)");
        		String content=contents[0];
        		if(map.containsKey(content)){
        			List<String>li=map.get(content);
        			li.add(path[0]+"/"+filename);
        			map.put(content,li);
        		}else{
        			List<String>l=new ArrayList<>();
        			l.add(path[0]+"/"+filename);
        			map.put(content,l);
        		}
        	}
        }
         for(String key:map.keySet()){
        	List<String>r=map.get(key);
        	if(r.size()>1)
        		res.add(r);
        }
        return res;
    }
}