class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String>res=new ArrayList<>();
        Map<String,Integer>map=new HashMap<>();
        for(String domain:cpdomains){
        	String[]valueanddomain=domain.split(" ");
        	int value=Integer.parseInt(valueanddomain[0]);
        	if(map.containsKey(valueanddomain[1])){
        		map.put(valueanddomain[1],map.get(valueanddomain[1])+value);
        	}else{
        		map.put(valueanddomain[1],value);
        	}
        	int index=valueanddomain[1].indexOf(".");
        	String key=valueanddomain[1];
        	while(index!=-1){
        		key=key.substring(index+1);
        		if(map.containsKey(key)){
        		map.put(key,map.get(key)+value);
        		}else{
        		map.put(key,value);
        		}
        		index=key.indexOf(".");
        	}
        }
        for(String k:map.keySet()){
        	res.add(map.get(k)+" "+k);
        }
        return res;
    }
}